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
    
	//
    public Result indexAdmin(String sequence, String laneSize) {
    	List<Random> randoms = Random.findBySequence(sequence);
		Map<String, String> result = new HashMap<String, String>();
    	for (Random random : randoms) {
			result.put(random.getSeed() + "_" + random.getLane(), random.getName());
		}
    	
    	return ok(index_admin.render(sequence, laneSize, result));
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
		    
		    if(Random.findByValues(sequence, seed, String.valueOf(lane)) == null) {
		    	
		    	if(Integer.parseInt(laneSize) <= Random.findCountBySequenceAndSeed(sequence, seed)){
			    	return badRequest("레인이 모두 배정되었습니다.");
			    }
		    	
		    	String id = sequence + "_" + seed + "_" + String.valueOf(lane);
				new Random(id, sequence, name, String.valueOf(lane), seed).insert();
				break; 
				
		    }
		}
		 
    	return redirect(routes.RandomApp.index(sequence, laneSize));
    }
    
    @Transactional
    public Result update() {
    	//
    	DynamicForm requestData = Form.form().bindFromRequest();
    	String name = requestData.get("name");
		String oldSeed = requestData.get("oldSeed");
		String seed = requestData.get("seed");
		String sequence = requestData.get("sequence");
		String lane = requestData.get("lane");
		String laneSize = requestData.get("laneSize");
		
		if(StringUtils.isNullOrEmpty(name)) {
			return badRequest("이름을 입력하세요.");
		}
		
		if(StringUtils.isNullOrEmpty(oldSeed)) {
			return badRequest("old 시드를 선택하세요.");
		}
		
		if(StringUtils.isNullOrEmpty(seed)) {
			return badRequest("new 시드를 선택하세요.");
		}
		
		if(StringUtils.isNullOrEmpty(lane)) {
			return badRequest("레인을 입력하세요");
		}
		
		Random oldRandom = Random.findByValues(sequence, oldSeed, String.valueOf(lane));
		if(oldRandom == null) {
			return badRequest("입력된 정보가 없습니다.");
	    }

		while(true){
			
		    int newLane = ((int)(Math.random() * Integer.parseInt(laneSize)))  + 1;
		    
		    Random random = Random.findByValues(sequence, seed, String.valueOf(newLane));
		    
		    if(random == null) {
		    	
		    	if(Integer.parseInt(laneSize) <= Random.findCountBySequenceAndSeed(sequence, seed)){
			    	return badRequest("레인이 모두 배정되었습니다.");
			    }
		    	
		    	oldRandom.setSeed(seed);
		    	oldRandom.setLane(String.valueOf(newLane));
		    	oldRandom.setName(name);
		    	
		    	oldRandom.update();
		    	
				break; 
		    }
		}
		
    	return redirect(routes.RandomApp.indexAdmin(sequence, laneSize));
    }

}