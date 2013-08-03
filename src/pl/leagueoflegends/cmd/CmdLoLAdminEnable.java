package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLAdminEnable extends RCommand {

	public CmdLoLAdminEnable(){
		super("enable");
		
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkArguments(args, 2, false, "/"+label+" <arena>");
		String arena =args[0].toLowerCase();
		//TODO czy istnieje arena,jezeli jest zablokowana. Jak tak odblokuj ja.
		return true;
	}
}
