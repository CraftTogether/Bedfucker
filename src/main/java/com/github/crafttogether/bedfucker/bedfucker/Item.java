package com.github.crafttogether.bedfucker.bedfucker;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Item {

    public static ItemStack bedfucker;

    public static void createBedfucker() {
        final ItemStack item = new ItemStack(Material.STRUCTURE_VOID, 1);
        final ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("bedfucker"));
        item.setItemMeta(meta);

        bedfucker = item;
        Bukkit.getLogger().info(bedfucker.getI18NDisplayName());
        createRecipe();
    }

    private static void createRecipe() {
        final ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("bedfucker"), bedfucker)
                .shape("tot", "odo", "tot")
                .setIngredient('t', Material.TNT)
                .setIngredient('o', Material.CRYING_OBSIDIAN)
                .setIngredient('d', Material.DIAMOND_PICKAXE);
        Bukkit.getServer().addRecipe(recipe);
    }

}
