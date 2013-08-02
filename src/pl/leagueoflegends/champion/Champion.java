package pl.leagueoflegends.champion;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import pl.leagueoflegends.Config;
import pl.leagueoflegends.skills.Ability;

public abstract class Champion {
	
	private final String id;
	private final CharacterType type;
	private int live;
	private int maxLive;
	private int mana;
	private int maxMana;
	private List<Ability> skills = new ArrayList<Ability>();
	
	public Champion(String id, CharacterType type, int maxLive){
		this.id = id;
		this.type = type;
		this.maxLive = maxLive;
		this.live = maxLive;
	}

	public String getId(){
		return id;
	}
	public int getLive(){
		return live;
	}
	public int getMaxLive(){
		return maxLive;
	}
	public int getMana(){
		return mana;
	}
	public int getMaxMana(){
		return maxMana;
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
	public boolean changeLive(int change){
		live += change;
		if(live <= 0){
			onDeath();
			return false;
		}
		return true;
	}
	public boolean changeMana(int change){
		mana += change;
		if(mana < 0){
			//nie ma wystarczajaco many
			return false;
		}
		return true;
	}
	
	
	
	// ABSTRACT //
	public abstract ItemStack getAttribute();
	public abstract void onDeath();
	
	// PROTECTED //
	protected void addSkill(Ability s){
		skills.add(s);
	}
	
	// ENUM //
	enum CharacterType{
		Tank,
		Support,
		Marksman;
	}
}
