package pl.leagueoflegends;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
public class Lang {
 
    /*
    *    LanguagesManager (LM)
    *        Created by Regzand
    *        http://regzand.pl/
    *
    *    Nie usuwac podpisu!
    */
 
    private static Map<String, String> messages = new HashMap<String, String>();
 
    public static void loadMessages(FileConfiguration file){
        for(String k : file.getKeys(true)){
            messages.put(k.toLowerCase(), file.getString(k, "&cError"));
        }
    }
 
    public static void clearMessages(){
        messages = new HashMap<String, String>();
    }
 
    public static String getRawMessage(String key){
        String esc = messages.get(key.toLowerCase());
        if(esc == null)return "&cError";
        return esc;
    }
 
    public static String getMessage(String key, String... var){
        String esc = getRawMessage(key);
        esc = ChatColor.translateAlternateColorCodes('&', esc);
        for(int i = 0; i < var.length; i++){
            esc = esc.replaceAll("%"+i, var[i]);
        }
        return esc;
    }
 
}
