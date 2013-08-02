package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.Config;
import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolStatReset extends RCommand {

	public CmdLolStatReset() {
		super("reset", new String[]{Config.getConfig("language").getString("commands.reset")});
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) throws RCommandException {
					super.checkPermissions(s, "lol.user.stat.reset", "lol.admin");
		Player p =	super.checkPlayer(s);
		
		//TODO uzupelnic
		
		return true;
	}

}
