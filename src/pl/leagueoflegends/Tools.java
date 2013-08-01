package pl.leagueoflegends;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Tools {
	
	/**
	 * 
	 * @param in
	 * @param file
	 */
	public static void copy(InputStream in, File file) throws IOException {
		OutputStream out = new FileOutputStream(file);
		byte[] buf = new byte[1024];
		int len;
		
		while((len = in.read(buf)) > 0){
			out.write(buf, 0, len);
		}
			
		out.close();
		in.close();
	}
	
	
	public static String[] cut(String[] args, int b, int e){
		String[] esc = new String[args.length-b-e];
		for(int i = b; i<(args.length-e); i++){
			esc[i-b] = args[i];
		}
		return esc;
	}
	
	public static double random(int min, int max){
		return min + Math.random() * (max - min);
	}
	
	public static ItemStack setDisplayName(ItemStack is, String name){
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(name);
		is.setItemMeta(im);
		return is;
	}
}
