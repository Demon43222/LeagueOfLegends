package pl.leagueoflegends.skills;

public class AbsoluteZero extends Ability {

// Nunu "r" - Ulti

	private static final int[] cooldown = new int[]{0, 110, 100, 90};

	public AbsoluteZero() {
		super("absoluteZero", 0, 3);
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public int getManaCost() {
		return 100;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
