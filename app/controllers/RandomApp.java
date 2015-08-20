package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.h2.util.StringUtils;

import com.avaje.ebean.Model.Finder;
import com.avaje.ebean.annotation.Transactional;

import models.Random;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.random.*;

public class RandomApp extends Controller {
	//
    public Result index(String sequence, String laneSize) {
    	List<Random> randoms = Random.findBySequence(sequence);
		Map<String, String> result = new HashMap<String, String>();
    	for (Random random : randoms) {
			result.put(random.getSeed() + "_" + random.getLane(), random.getName());
		}
    	
    	return ok(index.render(sequence, laneSize, result));
    }
    
    @Transactional
    public Result register() {
    	//
    	DynamicForm requestData = Form.form().bindFromRequest();
    	String name = requestData.get("name");
		String seed = requestData.get("seed");
		String sequence = requestData.get("sequence");
		String laneSize = requestData.get("laneSize");
		
		if(StringUtils.isNullOrEmpty(name)) {
			return badRequest("이름을 입력하세요.");
		}
		
		while(true){
		    int lane = ((int)(Math.random() * Integer.parseInt(laneSize)))  + 1;
		    if(Integer.parseInt(laneSize) <= Random.findCountBySequenceAndSeed(sequence, seed)){
		    	return badRequest("레인이 모두 배정되었습니다.");
		    }
		    if(Random.findByValues(sequence, seed, String.valueOf(lane)) == null) {
				new Random(sequence, name, String.valueOf(lane), seed).insert();
				break; 
		    }
		}
		 
    	return redirect(routes.RandomApp.index(sequence, laneSize));
    }

}