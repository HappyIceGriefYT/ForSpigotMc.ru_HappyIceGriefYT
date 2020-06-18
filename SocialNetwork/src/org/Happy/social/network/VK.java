package org.Happy.social.network;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class VK implements CommandExecutor{
	
	public SocialMain plugin = SocialMain.getPlugin(SocialMain.class);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
		 
	String s = plugin.config.getString("Messages.social.vkontakte");
	sender.sendMessage("§aНаш вк:§e" + s);
		
		return true;
	}

}
