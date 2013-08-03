package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLArenaSelect extends RCommand {

	
	public CmdLoLArenaSelect(){
		super("select");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkArguments(args, 2, false, "/"+label+" <arena>");
		String arena = args[0];
		//TODO czy istnieje arena
		super.checkPermissions(s, "lol.admin.select", "lol.admin.select." + args[0].toLowerCase());
		//TODO arenaselectcmd
		
		return true;
	}
}
