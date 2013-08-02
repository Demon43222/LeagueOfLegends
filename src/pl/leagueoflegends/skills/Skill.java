package pl.leagueoflegends.skills;

public abstract class Skill {
	
	public abstract String getName();
	public abstract String getDescription();
	public abstract int getCooldown();		// in secounds
	public abstract boolean isActive();
	public abstract int getLevel();
	
}
