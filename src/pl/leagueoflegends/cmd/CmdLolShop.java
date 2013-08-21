package pl.leagueoflegends.cmd;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolShop extends RCommand{
	
	public CmdLolShop(){
		super("shop");
	}

	@Override
	public boolean execute(CommandSender s, String label, String[] args)
			throws RCommandException {
		super.checkPermissions(s, "lol.player.shop");
		Player p = super.checkPlayer(s);
		
		String nick = p.getName().toLowerCase();
         if(!(args == null)){
        	 if(! (args.equals(nick))){
        		 //TODO shop cmd - zakup dla innego gracza( taki prezent)
        	 }
         }
		//TODO shop cmd
		
		
		return true;
	}

}
