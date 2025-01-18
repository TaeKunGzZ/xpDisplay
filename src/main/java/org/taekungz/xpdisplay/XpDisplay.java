package org.taekungz.xpdisplay;

import org.bukkit.plugin.java.JavaPlugin;

public final class XpDisplay extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("xpDisplay has been Enabled!");
        getServer().getPluginManager().registerEvents(new Listener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("xpDisplay has been Disabled!");
    }
}
