package pl.leagueoflegends.cmd;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import pl.leagueoflegends.Config;
import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLol extends RCommand{

	public CmdLol() {
		super("lol", "leagueoflegends");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) throws RCommandException {
		
		List<String> list = Config.getConfig("template").getStringList("help");
		String[] array = new String[list.size()];
		for(int i = 0; i < list.size(); i++){
			array[i] = ChatColor.translateAlternateColorCodes('&', list.get(i));
		}
		s.sendMessage(array);
		
		return true;
	}

}
