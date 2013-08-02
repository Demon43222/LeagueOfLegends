package pl.leagueoflegends.skills;


public class FrostShotSkill extends Skill{
	
	public FrostShotSkill(){
		super("frostShot", 0, 1);
	}

	@Override
	public int getCooldown() {
		return 0;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0;
	}

}
