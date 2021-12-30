package org.limedits.goodeats.EatMoreCommands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.Collections;

public class BookCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookMeta  = (BookMeta) book.getItemMeta();
        bookMeta.setAuthor("Ava");
        bookMeta.setDisplayName(ChatColor.DARK_RED +  "Eat More Guide");
        bookMeta.isUnbreakable();
        bookMeta.setLore(Collections.singletonList(ChatColor.LIGHT_PURPLE + "Eat More guide for the less Intelligent"));
        bookMeta.getLore();
        book.setItemMeta(bookMeta);
        if(sender instanceof Player){
            p.getInventory().addItem(new ItemStack(book));
        }else {
            System.out.println("You must be a player to use this command");
            return false;
        }


        return true;
    }



}
