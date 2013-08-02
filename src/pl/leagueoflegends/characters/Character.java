package pl.leagueoflegends.characters;

import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.skills.Skill;

public interface Character {
	
	public String getName();
	public String getDescription();
	public ItemStack getAttribute();
	public CharacterType getType();
	public Skill[] getSkills();
	
	enum CharacterType{
		Tank,
		Support;
	}
}
