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
		
		super.checkPermissions(s, "lol.admin.kick");
		

		
		super.checkArguments(args, 1, true, "/"+label+" <nick>");
		
		return true;
	}

}
