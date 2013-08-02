package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.Config;
import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolJoin extends RCommand {

	public CmdLolJoin() {
		super("join", new String[]{Config.getConfig("language").getString("commands.join")});
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) throws RCommandException {
					super.checkArguments(args, 1, true, "/"+label+" <arena>");
		Player p =	super.checkPlayer(s);
		
		//TODO sprawdzic czy jest taka arena
		super.checkPermissions(s, "lol.user.join."+args[0].toLowerCase(), "lol.admin");
		
		//TODO uzupelnic
		
		return true;
	}

}
