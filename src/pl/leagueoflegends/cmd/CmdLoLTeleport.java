package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLoLTeleport extends RCommand {

	public CmdLoLTeleport(){
	super("teleport");	
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkArguments(args, 2, false, "/"+label+" <arena>");
		super.checkPermissions(s, "lol.admin.teleport", "lol.admin.teleport."+args[0].toLowerCase());
		Player p = super.checkPlayer(s);
		//TODO teleportarenacmd
		return true;
	}
}
