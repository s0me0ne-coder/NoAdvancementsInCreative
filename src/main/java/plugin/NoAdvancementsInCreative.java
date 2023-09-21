// This is free and unencumbered software released into the public domain.
// Author: NotAlexNoyle.

package plugin;

import org.bukkit.plugin.java.JavaPlugin;

// Extending this class is standard bukkit boilerplate for any plugin, or else the server software won't load the classes.
public class NoAdvancementsInCreative extends JavaPlugin {

	// What to do when the plugin is run by the server.
	public void onEnable() {

		// Register the event.
		getServer().getPluginManager().registerEvents(new Listeners(), this);

	}

}
