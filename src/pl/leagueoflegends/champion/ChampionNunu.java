package pl.leagueoflegends.champion;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.skills.AbsoluteZero;
import pl.leagueoflegends.skills.Consume;
import pl.leagueoflegends.skills.BloodBoil;
import pl.leagueoflegends.skills.IceBlast;

public class ChampionNunu extends Champion{

	public ChampionNunu() {
		super("nunu", "Nunu", CharacterType.Marksman, 1000, 100, 1.0f);//TODO dodac poprawne dane

		addSkill(new Consume());
		addSkill(new IceBlast());
		addSkill(new BloodBoil());
		addSkill(new AbsoluteZero());
	}

	@Override
	public void onDeath() {
		// TODO Auto-generated method stub

	}

}
