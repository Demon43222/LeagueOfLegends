package pl.leagueoflegends.skills;

public class FinalHour extends Ability {

	private static final int[] cooldown = new int[]{0, 100, 85, 70};

	public FinalHour() {
		super("finalHour", 0, 3);
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public int getManaCost() {
		return 80;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
