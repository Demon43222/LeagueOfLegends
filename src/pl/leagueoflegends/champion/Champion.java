package pl.leagueoflegends.champion;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.skills.Ability;

public abstract class Champion {
	
	private List<Ability> skills = new ArrayList<Ability>();
	
	public Ability[] getSkills(){
		return (Ability[])skills.toArray();
	}
	
	
	// ABSTRACT //
	public abstract String getName();
	public abstract String getDescription();
	public abstract ItemStack getAttribute();
	public abstract CharacterType getType();
	
	// PROTECTED //
	protected void addSkill(Ability s){
		skills.add(s);
	}
	
	enum CharacterType{
		Tank,
		Support;
	}
}
