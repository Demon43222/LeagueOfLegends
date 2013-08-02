package pl.leagueoflegends.characters;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.skills.Skill;

public abstract class Character {
	
	private List<Skill> skills = new ArrayList<Skill>();
	
	public Skill[] getSkills(){
		return (Skill[])skills.toArray();
	}
	
	
	// ABSTRACT //
	public abstract String getName();
	public abstract String getDescription();
	public abstract ItemStack getAttribute();
	public abstract CharacterType getType();
	
	// PROTECTED //
	protected void addSkill(Skill s){
		skills.add(s);
	}
	
	enum CharacterType{
		Tank,
		Support;
	}
}
