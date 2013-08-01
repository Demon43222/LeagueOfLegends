package pl.leagueoflegends;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class LoLPlugin extends JavaPlugin{
  
	public void onEnable(){
		
		//config
		Config.registerConfig("config", "config.yml", this);
		Config.registerConfig("language", "languages.yml", this);
		
		//languages
		Lang.loadMessages(Config.getConfig("language"));
		
		//Success message
		logInfo("Poprawnie zaladowany!");
		logInfo("by regzand & adrenator & Dzikoysk @ Bukkit.pl");
	}
	
	public void onDisable(){
		
	}
	
	
	// STATIC //
	private static Logger logger = Logger.getLogger("minecraft");
	private static String prefix = "[LeagueOfLegends]";
	
	public static void logInfo(String msg){
		logger.info(prefix+" "+msg);
	}
	public static void logWarning(String msg){
		logger.warning(prefix+" "+msg);
	}
}
