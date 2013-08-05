package pl.leagueoflegends.skills;

public class BloodBoil extends Ability {
	
// Nunu "w"

	public BloodBoil() {
		super("bloodBoil", 0, 5);
	}

	@Override
	public int getCooldown() {
		return 15;
	}

	@Override
	public int getManaCost() {
		return 50;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}
}
