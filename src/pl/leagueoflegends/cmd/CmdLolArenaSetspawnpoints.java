package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolArenaSetspawnpoints extends RCommand {
	
	public CmdLolArenaSetspawnpoints(){
		super("setspawnpoint");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkArguments(args, 2, false, "/"+label+" <team>");
		//TODO czy zaznaczyl arene
		super.checkPermissions(s, "lol.admin.setspawnpoints");
		Player p = super.checkPlayer(s);
		String team = args[0];
		//TODO czy team istnieje
		
		
		return true;
	}

}
