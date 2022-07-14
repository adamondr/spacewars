package dev.adamo.spacewars.items;

import org.bukkit.inventory.ItemStack;

public enum Items {
//    DIAMOND(ItemRarities.UNCOMMON, DiamondItem.class),
    GODPOTION(ItemRarities.EPIC, new GodPotionItem().getItemClass(), new GodPotionItem().getItemStack());

    private final ItemRarities rarity;
    private final Class<?> executor;
    private final ItemStack itemStack;

    Items(ItemRarities rarity, Class<?> executor, ItemStack itemStack) {
        this.rarity = rarity;
        this.executor = executor;
        this.itemStack = itemStack;
    }

    public ItemRarities getRarity() {
        return rarity;
    }

    public Class<?> getExecutor() {
        return executor;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
