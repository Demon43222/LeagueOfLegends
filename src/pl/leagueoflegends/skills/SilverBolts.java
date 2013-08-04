package pl.leagueoflegends.skills;

public class SilverBolts extends Ability {

	public SilverBolts() {
		super("silverBolts", 0, 5);
	}

	@Override
	public int getCooldown() {
		return 0;
	}

	@Override
	public int getManaCost() {
		return 0;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}

}
