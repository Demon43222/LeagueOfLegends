package pl.leagueoflegends.skills;

import java.util.Date;

public abstract class Skill {
	
	private int level;
	private int maxLevel;
	private long lastUsed;
	
	public Skill(int startLvl, int maxLvl){
		level = startLvl;
		maxLevel = maxLvl;
		lastUsed = 0;
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
	
	
	// ABSTRACT //
	public abstract String getName();
	public abstract String getDescription();
	public abstract int getCooldown();		// in secounds
	public abstract boolean isActive();
	
	
	// STATIC //
	public static boolean checkDelay(long lastUsed, int cooldown){
		long delay = (new Date()).getTime()-lastUsed;
		return delay > cooldown*20;
	}
}
