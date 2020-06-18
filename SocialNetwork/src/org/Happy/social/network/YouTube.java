package org.Happy.social.network;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class YouTube implements CommandExecutor {
	
	public SocialMain plugin = SocialMain.getPlugin(SocialMain.class);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
		 
	String s = plugin.config.getString("Messages.social.youtube");
	sender.sendMessage("§aНаш ютуб:§e" + s);
		
		return true;
	}

}
