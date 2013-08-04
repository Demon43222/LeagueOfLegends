package pl.leagueoflegends.skills;

public class BouncingBomb extends Ability {

	private static final int[] cooldown = new int[]{0, 6, 5, 4};
	
	public BouncingBomb() {
		super("bouncingBomb", 0, 5);
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
