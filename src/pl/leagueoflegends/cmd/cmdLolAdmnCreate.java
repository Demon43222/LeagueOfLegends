package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class cmdLolAdmnCreate extends RCommand{

  
	public cmdLolAdmnCreate(){
		super("create");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
	super.checkArguments(args, 2, false, "/"+label+" <nick>");
	super.checkPermissions(s, "lol.admin.create");
	String arena = args[0];
	
  //TODO arenacreate
		return true;
	}
}
