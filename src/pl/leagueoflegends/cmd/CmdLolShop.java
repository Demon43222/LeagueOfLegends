package pl.leagueoflegends.cmd;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import pl.leagueoflegends.cmd.engine.RCommand;
import pl.leagueoflegends.cmd.engine.RCommandException;

public class CmdLolShop extends RCommand{
	
	public CmdLolShop(){
		super("shop");
	}
	
    private  Plugin plugin;
    private Inventory inv;
    
	/*public  void shopinvregister(){
	     this.plugin = plugin;
	     this.plugin.getServer().getPluginManager().registerEvents((Listener) this, plugin);
	       
	        this.inv = Bukkit.createInventory(null, 50, "LeagueOfLegends Shop");
	        ItemStack i1 = new ItemStack(Material.ENDER_PEARL, 2);
	        ItemStack i2 = new ItemStack(Material.ENDER_PEARL, 1);
	        ItemStack is3 = new ItemStack(Material.COMPASS, 1);
	        
	        //*********
	        ItemMeta im1 = i1.getItemMeta();
	        im1.setDisplayName("¤4TP Spawn");
	        i1.setItemMeta(im1);
	        inv.setItem(48, i1);
	}
	
///adrenator
*/
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
