package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminUnban extends RCommand{

  
	public CmdLolAdminUnban(){
		super("unbannnnn");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
	super.checkPermissions(s, "lol.admin.unban");
	super.checkArguments(args, 1, true, "/"+label+" <nick>");
  //TODO ub
		return true;
	}
}
