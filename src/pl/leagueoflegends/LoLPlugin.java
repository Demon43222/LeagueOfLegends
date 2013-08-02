package pl.leagueoflegends;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import pl.leagueoflegends.cmd.CmdLol;
import pl.leagueoflegends.cmd.CmdLolAdmin;
import pl.leagueoflegends.cmd.CmdLolAdminBuilding;
import pl.leagueoflegends.cmd.CmdLolAdminStat;
import pl.leagueoflegends.cmd.CmdLolAdminStatReset;
import pl.leagueoflegends.cmd.CmdLolJoin;
import pl.leagueoflegends.cmd.CmdLolLeave;
import pl.leagueoflegends.cmd.CmdLolSpectate;
import pl.leagueoflegends.cmd.CmdLolStat;
import pl.leagueoflegends.cmd.CmdLolStatReset;
import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandArgsException;
import pl.leagueoflegends.cmd.engine.RCommandException;
import pl.leagueoflegends.cmd.engine.RCommandPermissionsException;
import pl.leagueoflegends.cmd.engine.RCommandPlayerOfflineException;
import pl.leagueoflegends.cmd.engine.RCommandPlayerOnlyException;

public class LoLPlugin extends JavaPlugin{
	
	private RCommand lolCommand;
  
	public void onEnable(){
		
		//config
		Config.registerConfig("config", "config.yml", this);
		Config.registerConfig("language", "languages.yml", this);
		Config.registerConfig("skills", "skills.yml", this);
		Config.registerConfig("champions", "champions.yml", this);
		
		//languages
		Lang.loadMessages(Config.getConfig("language"));
		
		//commands
		//lol
		lolCommand = new CmdLol();
		//lol join <arena>
		lolCommand.addSubCommands(new CmdLolJoin());
		//lol leave
		lolCommand.addSubCommands(new CmdLolLeave());
		//lol spectate <arena>
		lolCommand.addSubCommands(new CmdLolSpectate());
		//lol stat [nick]
		RCommand lolStat = new CmdLolStat();
			//lol stat reset
			lolStat.addSubCommands(new CmdLolStatReset());
		lolCommand.addSubCommands(lolStat);
		//lol admin
		RCommand lolAdmin = new CmdLolAdmin();
			//lol admin stat <nick>
			RCommand lolAdminStat = new CmdLolAdminStat();
				//lol admin stat reset <nick>
				lolAdminStat.addSubCommands(new CmdLolAdminStatReset());
			lolAdmin.addSubCommands(lolAdminStat);
			//lol admin building
			lolAdmin.addSubCommands(new CmdLolAdminBuilding());
		lolCommand.addSubCommands(lolAdmin);
		
		//Success message
		logInfo("Poprawnie zaladowany!");
		logInfo("by regzand & adrenator & Dzikoysk @ Bukkit.pl");
	}
	
	public void onDisable(){
		
	}
	
	public boolean onCommand(CommandSender s, Command c, String label, String[] args){
		
		try {
			return lolCommand.perform(s, label, args);
			
		} catch (RCommandArgsException e) {			//SYNTAX
			s.sendMessage(Lang.getMessage("error.wrongSyntax", e.getSyntax()));
			
		} catch (RCommandPermissionsException e) {	//PERMISSIONS
			s.sendMessage(Lang.getMessage("error.permission"));
			
		} catch (RCommandPlayerOfflineException e) {//PLAYER OFFLINE
			s.sendMessage(Lang.getMessage("error.playerOffline", e.getPlayerName()));
			
		} catch (RCommandPlayerOnlyException e) {	//PLAYER ONLY
			s.sendMessage(Lang.getMessage("error.playerOnly"));
			
		} catch (RCommandException e) {				//UNKNOWN
			s.sendMessage(Lang.getMessage("error.unknown"));
			
		}
		
		return true;
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
