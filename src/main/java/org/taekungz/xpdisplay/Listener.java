package org.taekungz.xpdisplay;

import com.destroystokyo.paper.event.player.PlayerPickupExperienceEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemMendEvent;
import org.bukkit.inventory.ItemStack;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onPlayerPickupExperience(PlayerPickupExperienceEvent event) {
        Player player = event.getPlayer();
        int expGained = event.getExperienceOrb().getExperience();

        player.sendActionBar(XpDisplay.xpGained + "§f: §6+" + ChatColor.GOLD + expGained);
    }

    @EventHandler
    public void onPlayerItemMend(PlayerItemMendEvent event) {
        Player player = event.getPlayer();
        int expAmount = event.getRepairAmount();
        ItemStack item = event.getItem();

        int currentDurability = item.getType().getMaxDurability() - item.getDurability() + expAmount;
        int maxDurability = item.getType().getMaxDurability();
        String durabilityDisplay = " §8(" + ChatColor.YELLOW + currentDurability + "§7/" + ChatColor.DARK_GREEN + maxDurability + "§8)";

        player.sendActionBar( XpDisplay.mendRepaired + "§f: §6+" + ChatColor.GOLD + expAmount + durabilityDisplay);
    }
}
