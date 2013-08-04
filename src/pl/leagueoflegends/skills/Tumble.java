package pl.leagueoflegends.skills;

public class Tumble extends Ability {

	private static final int[] cooldown = new int[]{0, 6, 5, 4, 3, 2};

	public Tumble() {
		super("tumble", 0, 5);
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public int getManaCost() {
		return 30;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
