package pl.leagueoflegends.skills;

public class HawkshotAbility extends Ability {

	public HawkshotAbility() {
		super("hawkshot", 0, 5);
	}

	@Override
	public int getCooldown() {
		return 60;
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
