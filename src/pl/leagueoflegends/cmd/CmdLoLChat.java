package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLChat extends RCommand{
	
	public CmdLoLChat(){
		super("chat");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkPermissions(s, "lol.player.chattoogle");
		//TODO czy jest na arenie
		//TODO chattooglecmd
		
		return true;
	}

}
