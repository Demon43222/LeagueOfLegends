package pl.leagueoflegends.skills;

public class SatchelCharge extends Ability {

  private static final int[] cooldown = new int[]{26, 24, 22, 20, 18};
	
	public SatchelCharge() {
		super("bouncingBomb", 0, 5);
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public int getManaCost() {
		return 65;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
