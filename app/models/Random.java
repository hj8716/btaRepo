package models;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import play.data.validation.Constraints.Required;

import com.avaje.ebean.Model;

@Entity
@Table(uniqueConstraints=
@UniqueConstraint(columnNames = {"seed", "sequence", "lane"}))
public class Random extends Model {
	//
	private static Finder<String, Random> finder = new Finder<String, Random>(Random.class);
	
	@Id
	private String id;
	private String sequence;
    private String lane;
    private String seed;
    private String name;
    
    public Random() {};
    
    public Random(String id, String sequence, String name, String lane, String seed) {
    	this.id = id;
    	this.sequence = sequence;
    	this.name = name;
    	this.lane = lane;
    	this.seed = seed;
    }
    
    public static Random findByValues(String sequence, String seed, String lane) {
    	return finder.where().eq("sequence", sequence).eq("seed", seed).eq("lane", lane).findUnique();
    }

	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static List<Random> findBySequence(String sequence) {
		return finder.where().eq("sequence", sequence).findList();
	}
	
	public static int findCountBySequenceAndSeed(String sequence, String seed) {
		return finder.where().eq("sequence", sequence).eq("seed", seed).findRowCount();
	}
    
    
}
