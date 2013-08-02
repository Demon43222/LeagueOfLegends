package pl.leagueoflegends.champion;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.Config;
import pl.leagueoflegends.skills.Ability;

public abstract class Champion {
	
	private final String id;
	private final CharacterType type;
	private List<Ability> skills = new ArrayList<Ability>();
	
	public Champion(String id, CharacterType type){
		this.id = id;
		this.type = type;
	}

	public String getId(){
		return id;
	}
	public CharacterType getType(){
		return type;
	}
	public Ability[] getSkills(){
		return (Ability[])skills.toArray();
	}
	public String getName(){
		return Config.getConfig("champions").getString(id+".name", id);
	}
	public String getDescription(){
		return Config.getConfig("champions").getString(id+".description", "");
	}
	
	
	
	// ABSTRACT //
	public abstract ItemStack getAttribute();
	
	// PROTECTED //
	protected void addSkill(Ability s){
		skills.add(s);
	}
	
	// ENUM //
	enum CharacterType{
		Tank,
		Support;
	}
}
