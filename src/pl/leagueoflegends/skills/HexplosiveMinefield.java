package pl.leagueoflegends.skills;

public class HexplosiveMinefield extends Ability {

  private static final int[] mana = new int[]{0, 70, 80, 90, 100, 110};
	
	public HexplosiveMinefield() {
		super("hexplosiveMinefield", 0, 5);
	}

	@Override
	public int getCooldown() {
		return 16;
	}

	@Override
	public int getManaCost() {
		return mana[getLevel()];
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
