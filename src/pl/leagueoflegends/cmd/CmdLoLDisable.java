package pl.leagueoflegends.cmd;


import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLDisable extends RCommand{

	public CmdLoLDisable(){
		super("disable");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkPermissions(s, "lol.admin.disableplugin");
		//TODO disableplugincmd
		return true;
	}
	
}
