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
	super.checkPermissions(s, "lol.admin.ban", "lol.admin.ban" + args[0].toLowerCase());
	super.checkArguments(args, 3, false, "/"+label+" <nick>");
	if(args[1] != null ){
	//TODO ban na 1 arene	
		
		
	}else{
		//TODO ban na wszytskie areny
	}
   

		return true;
	}
}
