package pl.leagueoflegends.champion;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.skills.EnchantedCrystalArrowAbility;
import pl.leagueoflegends.skills.FrostShotAbility;
import pl.leagueoflegends.skills.HawkshotAbility;
import pl.leagueoflegends.skills.VolleyAbility;

public class AsheChampion extends Champion{
	
	private final static ItemStack attribute;
	
	static{
		attribute = new ItemStack(Material.BOW, 1);
		attribute.addEnchantment(Enchantment.ARROW_INFINITE, 1);
	}
	
	public AsheChampion() {
		super("ashe", CharacterType.Marksman);
		
		addSkill(new FrostShotAbility());
		addSkill(new VolleyAbility());
		addSkill(new HawkshotAbility());
		addSkill(new EnchantedCrystalArrowAbility());
	}

	@Override
	public ItemStack getAttribute() {
		return attribute;
	}

}
