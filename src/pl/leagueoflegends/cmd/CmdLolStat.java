package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.Config;
import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolStat extends RCommand {

	public CmdLolStat() {
		super("stat", new String[]{Config.getConfig("language").getString("commands.stat")});
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args) throws RCommandException {
		String nick;
		if(args != null && args.length != 0){
			/*
			 * Mo˝e dodaç by: je˝eli ktoÊ wpisze w args[0] swój nick to te˝ dzia∏a?
			 * if(args[0].equalsIgnoreCase(nick)){
			 *
			 *   }else{
			 *   Robi to co jest
			 *   }
			 */
			
			super.checkPermissions(s, "lol.player.stat.other", "lol.admin");
			nick = args[0].toLowerCase();
			
		}else{
			Player p = super.checkPlayer(s);
			super.checkPermissions(s, "lol.player.stat", "lol.admin");
			nick = p.getName().toLowerCase();
			
		}
		//TODO stat cmd
		
		return false;
	}

}
