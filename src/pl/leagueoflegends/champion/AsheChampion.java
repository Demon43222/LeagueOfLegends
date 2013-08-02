package pl.leagueoflegends.champion;

import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.skills.EnchantedCrystalArrowAbility;
import pl.leagueoflegends.skills.FrostShotAbility;
import pl.leagueoflegends.skills.HawkshotAbility;
import pl.leagueoflegends.skills.VolleyAbility;

public class AsheChampion extends Champion{

	public AsheChampion() {
		super("ashe", CharacterType.Marksman);
		
		addSkill(new FrostShotAbility());
		addSkill(new VolleyAbility());
		addSkill(new HawkshotAbility());
		addSkill(new EnchantedCrystalArrowAbility());
	}

	@Override
	public ItemStack getAttribute() {
		// TODO Auto-generated method stub
		return null;
	}

}
