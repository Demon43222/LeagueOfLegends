package pl.leagueoflegends.skills;

import java.util.Date;

import pl.leagueoflegends.Config;

public abstract class Ability {
	
	private String id;
	private int level;
	private int maxLevel;
	private long lastUsed;
	
	public Ability(String id, int startLvl, int maxLvl){
		this.id = id;
		level = startLvl;
		maxLevel = maxLvl;
		lastUsed = 0;
	}
	
	public String getId(){
		return id;
	}
	public int getLevel(){
		return level;
	}
	public int getMaxLevel(){
		return maxLevel;
	}
	public boolean increaseLevel(int i){
		if(level+i > maxLevel)return false;
		level += i;
		return true;
	}
	public long getLastUsetTime(){
		return lastUsed;
	}
	public String getName(){
		return Config.getConfig("skills").getString(id+".name", id);
	}
	public String getDescription(){
		return Config.getConfig("skills").getString(id+".description", "");
	}
	
	
	// ABSTRACT //
	public abstract int getCooldown();		// in secounds
	public abstract int getManaCost();
	public abstract boolean isActive();
	
	
	// STATIC //
	public static boolean checkDelay(long lastUsed, int cooldown){
		long delay = (new Date()).getTime()-lastUsed;
		return delay > cooldown*20;
	}
}
