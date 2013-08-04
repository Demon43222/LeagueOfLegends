package pl.leagueoflegends.champion;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.skills.FinalHour;
import pl.leagueoflegends.skills.Tumble;
import pl.leagueoflegends.skills.Condemn;
import pl.leagueoflegends.skills.SilverBolts;

public class ChampionVayne extends Champion{

	private final static ItemStack attribute;

	static{
		attribute = new ItemStack(Material.BOW, 1);
		attribute.addEnchantment(Enchantment.ARROW_INFINITE, 1);
	}

	public ChampionVayne() {
		super("vayne", "Vayne", CharacterType.Marksman, 1000, 100, 1.0f);//TODO dodac poprawne dane

		addSkill(new Tumble());
		addSkill(new SilverBolts());
		addSkill(new Condemn());
		addSkill(new FinalHour());
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
