package pl.leagueoflegends.skills;

import pl.leagueoflegends.Config;

public class VolleySkill extends Skill {

	private int[] cooldown;
	
	public VolleySkill() {
		super(0, 5);
		cooldown = new int[]{0,16,13,10,7,4};
	}

	@Override
	public String getName() {
		return Config.getConfig("language").getString("skills.volley.name", "Volley");
	}

	@Override
	public String getDescription() {
		return Config.getConfig("language").getString("skills.volley.description", "Ashe fires 7 arrows in a 57.5 cone, dealing physical damage to each target hit. Each arrow will only hit one enemy, and each enemy will only be hit by one arrow. Volley also applies the current rank of Frost Shot, regardless of whether it is toggled on or not.");
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
