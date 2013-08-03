package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminDisable extends RCommand{

	
	
	public CmdLolAdminDisable(){
		super("disable");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkPermissions(s, "lol.admin.disable");
		super.checkArguments(args, 2, false, "/"+label+" <arena>");
		
		return true;
	}
}
