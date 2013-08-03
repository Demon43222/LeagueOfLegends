package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminForcestop extends RCommand{
	
	public CmdLolAdminForcestop(){
		super("forcestop");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkArguments(args, 2, false, "/"+label+" <arena>");
		super.checkPermissions(s, "lol.admin.forcestop", "lol.admin.forcestop." + args[0].toLowerCase());
		
		
		return true;
	}

}
