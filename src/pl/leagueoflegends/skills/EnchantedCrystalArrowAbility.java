package pl.leagueoflegends.skills;

public class EnchantedCrystalArrowAbility extends Ability {

	private static final int[] cooldown = new int[]{0, 100, 90, 80};
	
	public EnchantedCrystalArrowAbility() {
		super("enchantedCrystalArrow", 0, 3);
	}

	@Override
	public int getCooldown() {
		return cooldown[getLevel()];
	}

	@Override
	public int getManaCost() {
		return 150;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
