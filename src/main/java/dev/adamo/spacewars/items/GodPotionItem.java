package dev.adamo.spacewars.items;

import dev.adamo.spacewars.utils.SkullUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Skull;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GodPotionItem extends Item {

    @Override
    public String name() {
        return "godpotion";
    }

    @Override
    public Items getItem() {
        return Items.GODPOTION;
    }

    @Override
    public ItemStack getItemStack() {
        ItemStack item = SkullUtils.getSkull("41da9ee4-bf81-4cd1-8ede-e4a3ddc4f980", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDRhYTlhZWFiYWYyNTY4Yjk3YTJlOGNmYTlhNTNiYWNkNGM4ZDg5ZGFkNGJhMzg3ZjZjNGI3NjFhZTA0YTE4In19fQ==\\");
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&5&lGod Potion"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7This potion contains"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7a lot of positive effects!"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Lasts for 12 hours."));
        lore.add(" ");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&78Consumed on use."));
        lore.add(" ");
        lore.add(this.getItemRarity().getString());
        item.setItemMeta(itemMeta);
        return item;
    }

    @Override
    public ItemRarities getItemRarity() {
        return ItemRarities.EPIC;
    }

    @Override
    public Class<? extends Item> getItemClass() {
        return this.getClass();
    }
}