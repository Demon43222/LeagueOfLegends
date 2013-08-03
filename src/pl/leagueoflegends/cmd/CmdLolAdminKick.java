package pl.leagueoflegends.cmd;



import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminKick extends RCommand {

	public CmdLolAdminKick() {
		super("kick");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		
		super.checkArguments(args, 3, false, "/"+label+" <nick> <arena>");
		super.checkPermissions(s, "lol.admin.kick");
		String arena = args[1].toLowerCase();
		String nick = args[0].toLowerCase();
			
		//TODO kickcmd
		

		
		return true;
	}
}
