package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLAdminInfo extends RCommand{

	
	public CmdLoLAdminInfo(){
		super("info");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkArguments(args, 2, false, "/"+label+" <arena>");
		Player p = super.checkPlayer(s);
		super.checkPermissions(s, "lol.admin.info", "lol.admin.info." + args[0].toLowerCase());
		String arena = args[0].toLowerCase();
		
				
		return true;
	}
}
