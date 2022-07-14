package dev.adamo.spacewars.commands;

import dev.adamo.spacewars.items.GodPotionItem;
import dev.adamo.spacewars.items.Items;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveCommand extends SubCommand {
    @Override
    public void onCommand(Player player, String[] args) {
        for(Items item : Items.values()) {
            if(item.name().equals(args[0])) {
                ItemStack itemStack = item.getItemStack();

                break;
            }
        }
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public String[] aliases() {
        return new String[0];
    }
}
