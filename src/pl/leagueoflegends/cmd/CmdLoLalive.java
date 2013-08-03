package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLalive extends RCommand {
	
	public CmdLoLalive(){
		super("alive");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkPermissions(s, "lol.user.alive");
		//TODO czy jest na arenie
		//TODO alivecmd
		
		
		return true;
	}

}
