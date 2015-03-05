package com.github.walster001.EasterHunt;
 
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class EasterHunt extends JavaPlugin {
	@Override
    public void onEnable() {
		getLogger().info("EasterHunt by Walster001 Loaded Successfully!");
		
    }
 
    @Override
    public void onDisable() {
    	getLogger().info("EasterHunt by Walster001 Disabled Successfully!");
    	// TODO Insert logic to be performed when the plugin is disabled
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String eh, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("easterhunt")) {
    		if (!(sender instanceof Player))
    		        sender.sendMessage("This command cannot be run from the console.");
    		return true;
    	} else if (cmd.getName().equalsIgnoreCase("easterhunt start")) {
    		if (!(sender instanceof Player)) {
    			sender.sendMessage("This command cannot be run from the console.");
    		} else {
    		}
    		//doSomethingViaPlayer
    		return true;
    	} //If this has happened the function will return true. 
            // If this hasn't happened the value of false will be returned.
    	return false; 
    }
}
