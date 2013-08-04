package pl.leagueoflegends.champion;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.skills.MegaInfernoBomb;
import pl.leagueoflegends.skills.HexplosiveMinefield;
import pl.leagueoflegends.skills.SatchelCharge;
import pl.leagueoflegends.skills.BouncingBomb;

public class ChampionZiggs extends Champion{
	
	private final static ItemStack attribute;
	
	static{
		attribute = new ItemStack(Material.SNOWBALL, 1);
	}
	
	public ChampionAshe() {
		super("ziggs", "Ziggs", CharacterType.Marksman, 1000, 100, 1.0f);//TODO dodac poprawne dane
		
		addSkill(new BouncingBomb());
		addSkill(new SatchelCharge());
		addSkill(new HexplosiveMinefield());
		addSkill(new MegaInfernoBomb());
	}

	@Override
	public ItemStack getAttribute() {
		return attribute;
	}

	@Override
	public void onDeath() {
		// TODO Auto-generated method stub
		
	}

}
