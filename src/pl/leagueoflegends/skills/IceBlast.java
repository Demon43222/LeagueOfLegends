package pl.leagueoflegends.skills;

public class IceBlast extends Ability {

// Nunu "e"

	public static final int[] = mana(0, 75, 85, 95, 105, 115);

	public IceBlast() {
		super("iceBlast", 0, 5);
	}

	@Override
	public int getCooldown() {
		return 6;
	}

	@Override
	public int getManaCost() {
		return mana(getLevel());
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0 && checkDelay(getLastUsetTime(), getCooldown());
	}
}
