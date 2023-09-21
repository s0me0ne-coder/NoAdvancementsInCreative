// This is free and unencumbered software released into the public domain.
// Author: NotAlexNoyle.
package plugin;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.destroystokyo.paper.event.player.PlayerAdvancementCriterionGrantEvent;

public class Listeners implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onAdvancementProgress(PlayerAdvancementCriterionGrantEvent event) {
		if(event.getPlayer().getGameMode() != GameMode.SURVIVAL) {
			event.setCancelled(true);
		}
	}

}
