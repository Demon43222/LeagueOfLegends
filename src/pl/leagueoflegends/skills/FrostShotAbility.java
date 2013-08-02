package pl.leagueoflegends.skills;


public class FrostShotAbility extends Ability{ //TODO to jest testowe, bedzie modyfikowane
	
	public FrostShotAbility(){
		super("frostShot", 0, 1);
	}

	@Override
	public int getCooldown() {
		return 0;
	}

	@Override
	public boolean isActive() {
		return getLevel()!=0;
	}

	@Override
	public int getManaCost() {
		return 8;
	}

}
