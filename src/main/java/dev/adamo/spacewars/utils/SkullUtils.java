package dev.adamo.spacewars.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SkullUtils {
    public static void setup() {

    }
    @SuppressWarnings("deprecation")
    public static ItemStack getSkull(String uuid, String texture) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
        Bukkit.getUnsafe().modifyItemStack(head, "{SkullOwner:{Id:\"" + uuid + "\",Properties:{textures:[{Value:\"" + texture + "\"}]}}}");
        return head;
    }
}
