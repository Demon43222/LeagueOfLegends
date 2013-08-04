package pl.leagueoflegends.skills;

public class HexplosiveMinefield extends Ability {

  private static final int[] cooldown = new int[]{16, 16, 16, 16, 16};
	
	public HexplosiveMinefield() {
		super("hexplosiveMinefield", 0, 5);
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public int getManaCost() {
		return 90;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
