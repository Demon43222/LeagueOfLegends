package pl.leagueoflegends.skills;

public class Consume extends Ability {

  private static final int[] cooldown = new int[]{0, 17, 15, 13, 11, 9};

	public Consume() {
		super("consume", 0, 5);
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public int getManaCost() {
		return 60;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
