package me.Andurit.SignHeal;

import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Events extends Main implements Listener{
	@SuppressWarnings({ "incomplete-switch" })
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			boolean isSign = false;
			switch(event.getClickedBlock().getType()){
			case SIGN:
				isSign = true;
				break;
			case SIGN_POST:
				isSign = true;
				break;
			case WALL_SIGN:
				isSign = true;
				break;
			}
		if (isSign) {
			Sign sign = (Sign) event.getClickedBlock().getState();
			if (sign.getLine(0).equals("[JEDLO]")) {
				event.getPlayer().setFoodLevel(20);
				event.getPlayer().sendMessage(ChatColor.GREEN+ "Jedlo bolo doplnene!");
			}
		}
		}
		
	}
	

}
