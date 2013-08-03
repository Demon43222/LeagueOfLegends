package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLArenaSetregion extends RCommand{
	
	public CmdLoLArenaSetregion(){
		super("setregion");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
	     //TODO czy zaznaczyl arene
		super.checkPermissions(s, "lol.admin.setregion");
		//TODO setregioncmd
		
		return true;
	}

}
