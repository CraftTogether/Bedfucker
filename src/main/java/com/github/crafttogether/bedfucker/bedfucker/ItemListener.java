package com.github.crafttogether.bedfucker.bedfucker;

import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemListener implements Listener {

    @EventHandler
    public void onInteractEvent(PlayerInteractEvent event) {
        if (!event.getAction().isRightClick()) return;

        if (event.hasItem() && event.getItem().getItemMeta().equals(Item.bedfucker.getItemMeta())){
            Bukkit.getLogger().info("Right item");
            if (event.getClickedBlock().getType() == Material.BEDROCK) {
                Bukkit.getLogger().info("Breaking bedrock");
                event.getPlayer().getInventory().remove(Item.bedfucker);
                event.getClickedBlock().breakNaturally();
                event.getPlayer().getLocation().createExplosion(5f);
            }
            event.setCancelled(true);
        }
    }

}
