package org.Happy.social.network;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.sun.tools.javac.Main;

public class SocialMain extends JavaPlugin {
	YamlConfiguration config;

	@SuppressWarnings("unused")
	public void onEnable() {
		
		Bukkit.getPluginManager().disablePlugin(null);
		Main plugin = null;
		
		File file = new File(getDataFolder() + "/config.yml");
		config = YamlConfiguration.loadConfiguration(file);
		
		config.set("Messages.social.vkontakte", "vk");
		config.set("Messages.social.youtube", "yt");
		
		getCommand("VK").setExecutor(new VK());
		getCommand("YouTube").setExecutor(new YouTube());
		getCommand("VKONTAKTE").setExecutor(new VK());
		
	}
}
