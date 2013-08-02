package pl.leagueoflegends.cmd;

import java.util.List;

import org.bukkit.ChatColor;
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
					super.checkPermissions(s, "lol.admin");
					
		List<String> list = Config.getConfig("language").getStringList("help-admin");
		String[] array = new String[list.size()];
		for(int i = 0; i < list.size(); i++){
			array[i] = ChatColor.translateAlternateColorCodes('&', list.get(i));
		}
		s.sendMessage(array);
				
		return true;
	}

}
