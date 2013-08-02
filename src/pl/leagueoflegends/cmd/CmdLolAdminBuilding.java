package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdminBuilding extends RCommand {

	public CmdLolAdminBuilding() {
		super("building");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) throws RCommandException {
					super.checkPermissions(s, "lol.admin.building");
		Player p =	super.checkPlayer(s);
		
		//TODO uzupelnic
		
		return true;
	}

}
