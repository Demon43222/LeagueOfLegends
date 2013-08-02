package pl.leagueoflegends.skills;

import pl.leagueoflegends.Config;

public class FrostShotSkill extends Skill{
	
	
	public FrostShotSkill(){
		super(0, 1);
	}
	
	@Override
	public String getName() {
		return Config.getConfig("language").getString("skills.frostShot.name", "Frost Shot");
	}

	@Override
	public String getDescription() {
		return Config.getConfig("language").getString("skills.frostShot.description", "Ashe enchants her basic attacks with ice, slowing her targets for 2 seconds.");
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
