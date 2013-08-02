package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminBan extends RCommand{

  
	public CmdLolAdminBan(){
		super("ban");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
	super.checkPermissions(s, "lol.admin.ban");
	super.checkArguments(args, 1, false, "/"+label+" <nick>");
  //TODO 
	super.checkArguments(args, 2, true, "/"+label+" <nick> + <arena>");
  //TODO
		return true;
	}
}
