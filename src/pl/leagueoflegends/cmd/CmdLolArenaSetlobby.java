package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolArenaSetlobby extends RCommand {
	
	public CmdLolArenaSetlobby(){
		super("setlobby");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkArguments(args, 1, false, "/"+label);
		//TODO czy zaznaczyl arene
		super.checkPermissions(s, "lol.admin.setlobby");
		Player p = super.checkPlayer(s);
		//TODO setlobby cmd
		return true;
	}

}
