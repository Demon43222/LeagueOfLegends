package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLArenaShowregion extends RCommand {
	
	public CmdLoLArenaShowregion(){
		super("showregion");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		//TODO czy zaznaczyl arene
		super.checkPermissions(s, "lol.admin.showregion");
		//TODO showregioncmd
		
		
		return true;
	}

}
