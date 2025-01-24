package org.taekungz.xpdisplay;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class XpDisplay extends JavaPlugin {
    public static String xpGained;
    public static String mendRepaired;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("xpDisplay has been Enabled!");
        getServer().getPluginManager().registerEvents(new Listener(), this);

        saveDefaultConfig();
        loadConfigValues();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("xpDisplay has been Disabled!");
    }

    public void loadConfigValues() {
        FileConfiguration config = getConfig();
        xpGained = getConfig().getString("actionbar.xp_gained", xpGained);
        mendRepaired = getConfig().getString("actionbar.mending_repaired", mendRepaired);
    }
}
