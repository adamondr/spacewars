package dev.adamo.spacewars.items;

import org.bukkit.ChatColor;

public enum ItemRarities {
    COMMON(ChatColor.translateAlternateColorCodes('&', "&f&lCOMMON")),
    UNCOMMON(ChatColor.translateAlternateColorCodes('&', "&f&lUNCOMMON")),
    RARE(ChatColor.translateAlternateColorCodes('&', "&9&lRARE")),
    EPIC(ChatColor.translateAlternateColorCodes('&', "&5&lEPIC")),
    LEGENDARY(ChatColor.translateAlternateColorCodes('&', "&6&lLEGENDARY")),
    MYTHIC(ChatColor.translateAlternateColorCodes('&', "&d&klll &d&lMYTHIC &d&klll"));

    private final String string;

    ItemRarities(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
