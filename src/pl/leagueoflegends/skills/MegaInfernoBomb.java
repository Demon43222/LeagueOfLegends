package pl.leagueoflegends.skills;

public class MegaInfernoBomb extends Ability {

  private static final int[] cooldown = new int[]{0, 120, 105, 90};

	public MegaInfernoBomb() {
		super("megaInfernoBomb", 0, 3);
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
