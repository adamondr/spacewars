package dev.adamo.spacewars;

import dev.adamo.spacewars.commands.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpaceWars extends JavaPlugin {
    public static String version = "v0.0.1";
    private static SpaceWars instance;
    public CommandManager commandManager;

    public void onEnable() {
        setInstance(this);
        commandManager = new CommandManager();

        commandManager.setup();
    }

    public static SpaceWars getInstance() {
        return instance;
    }

    private static void setInstance(SpaceWars instance) {
        SpaceWars.instance = instance;
    }

}
