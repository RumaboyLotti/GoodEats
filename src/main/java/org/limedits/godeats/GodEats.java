package org.limedits.godeats;

import org.bukkit.plugin.java.JavaPlugin;
import org.limedits.godeats.EatMoreCommands.BookCommand;

public final class GodEats extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(" Happy Eating -Lotti ");
        getCommand("EatMore").setExecutor(new BookCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Sated");
    }
}
