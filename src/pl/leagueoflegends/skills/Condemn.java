package pl.leagueoflegends.skills;

public class Condemn extends Ability {

  private static final int[] cooldown = new int[]{0, 20, 18, 16, 14, 12};

	public SatchelCharge() {
		super("condemn", 0, 5);
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
