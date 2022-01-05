package org.limedits.goodeats;

import org.bukkit.plugin.java.JavaPlugin;
import org.limedits.goodeats.EatMoreCommands.BookCommand;
import org.limedits.goodeats.EatMoreCommands.GlowCommand;
import org.limedits.goodeats.Evant.PlayerEatCarbs;
import org.limedits.goodeats.Evant.PlayerEatEvent;

public final class GoodEats extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(" Happy Eating -Lotti ");
        getCommand("EatMore").setExecutor(new BookCommand());
        getCommand("Glow").setExecutor((new GlowCommand()));
        getServer().getPluginManager().registerEvents(new PlayerEatEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerEatCarbs(), this );

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Sated");
    }
}
