package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminStatReset extends RCommand {

	public CmdLolAdminStatReset() {
		super("reset");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) throws RCommandException {
					super.checkArguments(args, 1, true, "/"+label+" <nick>");
					super.checkPermissions(s, "lol.admin.stat.reset");
		
		//TODO uzupelnic

		return true;
	}

}
