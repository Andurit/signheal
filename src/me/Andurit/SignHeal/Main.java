package me.Andurit.SignHeal;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private Logger console = Logger.getLogger("Minecraft");
	
	public void onEnable()	{
		this.console.info("[SignHeal] Plugin succesfully activated");
		this.getServer().getPluginManager().registerEvents(new Events(),this);
		
	}
	public void onDisable()	{
		this.console.info("[SignHeal] Plugin succesfully deactivated");
		
	}
}
