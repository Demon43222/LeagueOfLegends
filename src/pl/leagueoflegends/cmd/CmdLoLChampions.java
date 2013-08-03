package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLChampions extends RCommand {
	
	public CmdLoLChampions(){
		super("champions");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkPermissions(s, "lol.player.champions", "lol.admin.champions");
		
		//TODO champions list
		return true;
	}

}
