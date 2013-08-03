package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolChampionsDisable extends RCommand {
	
	public CmdLolChampionsDisable(){
	super("disable");

}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkArguments(args, 2, false, "/"+label+" <champion>");
		String champion = args[0];
		//TODO czy champion istnieje
		//TODO czy jest aktywny
		super.checkPermissions(s, "lol.admin.champions.disable");
		//TODO disablechampion cmd
		
		
		
		
		return true;
	}
}
