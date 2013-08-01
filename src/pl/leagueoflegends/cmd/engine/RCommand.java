package pl.leagueoflegends.cmd.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.leagueoflegends.Tools;

public abstract class RCommand {
	
	// ---------------------------------------- //
	// FIELDS									//
	// ---------------------------------------- //
	
	// FIELD: name
	// Name of command
	private String name;
	
	// FIELD: aliases
	// Alternative names of command
	private List<String> aliases;
	public void addAliases(String... aliases){this.aliases.addAll(Arrays.asList(aliases));}
	public void addAliases(List<String> aliases){this.aliases.addAll(aliases);}
	public boolean isAlias(String alias){
		if(getName().equalsIgnoreCase(alias))return true;
		for(String a : aliases)
			if(a.equalsIgnoreCase(alias))return true;
		return false;
	}
		
	// FIELD: subCommands
	// List of subcommands
	private List<RCommand> subCommands;
	public void addSubCommands(RCommand... commands){this.subCommands.addAll(Arrays.asList(commands));}
	public void addSubCommands(List<RCommand> commands){this.subCommands.addAll(commands);}
	
	
	// ---------------------------------------- //
	// CONSTRUCTOR								//
	// ---------------------------------------- //
	
	public RCommand(String name, String... aliases){
		this.aliases = new ArrayList<String>();
		this.subCommands = new ArrayList<RCommand>();
		
		setName(name);
		addAliases(aliases);
	}
	
	
	// ---------------------------------------- //
	// EXECUTING								//
	// ---------------------------------------- //
	
	public abstract boolean execute(CommandSender s, String label, String args[]) throws RCommandException;
	
	public boolean perform(CommandSender s, String label, String args[]) throws RCommandException{
		
		//if there is no arguments it can't contains any subcommands
		if(args.length == 0)return this.execute(s, label, args);
		
		RCommand c = getSubCommand(args[0]);
		//if there is subcommand with allias that match args[0]
		if(c != null) return c.perform(s, label+" "+args[0], Tools.cut(args, 1, 0));
		
		return this.execute(s, label, args);
	}
	
	
	// ---------------------------------------- //
	// MANAGING									//
	// ---------------------------------------- //
	
	public RCommand getSubCommand(String alias){
		for(RCommand c : subCommands)
			if(c.isAlias(alias))return c;
		return null;
	}
	
	
	// ---------------------------------------- //
	// TOOLS									//
	// ---------------------------------------- //
	
	protected Player checkPlayer(CommandSender s) throws RCommandException{
		if(s instanceof Player) return (Player)s;
		throw new RCommandPlayerOnlyException();
	}
	
	protected void checkPermissions(CommandSender s, String... permissions) throws RCommandException{
		for(String p : permissions) if(s.hasPermission(p)) return;
		throw new RCommandPermissionsException(permissions);
	}
	
	protected void checkArguments(String[] args, int length, boolean exacly, String syntax) throws RCommandException{
		if(exacly && args.length == length)return;
		if(!exacly && args.length >= length)return;
		throw new RCommandArgsException(syntax);
	}
	
	protected Player checkPlayer(String name) throws RCommandException{
		Player p = Bukkit.getPlayer(name);
		if(p != null)return p;
		throw new RCommandPlayerOfflineException(name);
	}
	
	
	// ---------------------------------------- //
	// GETTERS SETTERS							//
	// ---------------------------------------- //
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAliases() {
		return aliases;
	}
	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}
	public List<RCommand> getSubCommands() {
		return subCommands;
	}
	public void setSubCommands(List<RCommand> subCommands) {
		this.subCommands = subCommands;
	}
}
