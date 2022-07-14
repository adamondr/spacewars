package dev.adamo.spacewars.items;

import org.bukkit.inventory.ItemStack;

public abstract class Item {
    public Item() {
    }

    public abstract String name();

    public abstract Items getItem();

    public abstract ItemStack getItemStack();

    public abstract ItemRarities getItemRarity();

    public abstract Class<? extends Item> getItemClass();
}
