package pl.leagueoflegends.skills;


public class VolleyAbility extends Ability {

	private static final int[] cooldown = new int[]{0,16,13,10,7,4};
	
	public VolleyAbility() {
		super("volley", 0 , 5);
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

	@Override
	public int getManaCost() {
		return 60;
	}

}
