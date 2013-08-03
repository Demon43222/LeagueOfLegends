package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolVersion extends RCommand{
	
	public CmdLolVersion(){
		super("version");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkPermissions(s, "lol.player.version");
		//TODO version cmd
		
		
		return true;
	}

}
