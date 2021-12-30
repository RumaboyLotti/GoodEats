package org.limedits.godeats.EatMoreCommands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BookCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        Material item = Material.BOOK;
        if(sender instanceof Player){
            p.getInventory().addItem(new ItemStack(item));
        }else {
            System.out.println("You must be a player to use this command");
            return false;
        }


        return true;
    }
}
