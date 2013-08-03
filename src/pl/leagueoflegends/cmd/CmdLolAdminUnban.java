package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminUnban extends RCommand{

  
	public CmdLolAdminUnban(){
		super("unban");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		
	super.checkArguments(args, 3, false, "/"+label+" <nick> <arena>");
	super.checkPermissions(s, "lol.admin.unban");
	if(args[1] != null){
		//TODO ubcmd dla danej areny
	}else{
		//TODO ubcmd dla wszystkich aren
	}
	
		return true;
	}
}
