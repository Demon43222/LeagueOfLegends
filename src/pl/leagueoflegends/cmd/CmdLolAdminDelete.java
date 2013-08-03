package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminDelete extends RCommand{

	public CmdLolAdminDelete() {
		super("delete");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		Player p = super.checkPlayer(s);
		super.checkPermissions(s, "lol.admin.delete");
		super.checkArguments(args, 2, false, "/"+label+" <arena>");
		
		return true;
	}

	
	
}
