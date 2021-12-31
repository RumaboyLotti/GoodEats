package org.limedits.goodeats.EatMoreCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class GlowCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(p.isGlowing()){
            p.setGlowing(false);
            p.sendMessage(ChatColor.AQUA + "Glowing Disabled");
        }else if(!(p.isGlowing())){
            p.sendMessage("You must be glowing to Use this command");
        }

        return true;
    }
}
