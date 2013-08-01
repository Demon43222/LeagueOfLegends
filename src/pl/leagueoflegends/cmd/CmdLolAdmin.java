package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;

import pl.leagueoflegends.Config;
import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolAdmin extends RCommand{

	public CmdLolAdmin() {
		super("admin", new String[]{Config.getConfig("language").getString("commands.admin")});
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) throws RCommandException {
		// TODO Auto-generated method stub
		return false;
	}

}
