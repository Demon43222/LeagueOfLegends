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
		super.checkPermissions(s, "lol.admin.delete");
		Player p = super.checkPlayer(s);
		super.checkArguments(args, 2, false, "/"+label+" <arena>");
		String arena = args[0].toLowerCase();
		//TODO jezeli istnieje arena, usun ja
		return true;
	}

	
	
}
