package org.limedits.goodeats.EatMoreCommands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.*;

public class BookCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Map<String, Long> cooldown = new HashMap<String, Long>();
        Player p = (Player) sender;
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookMeta  = (BookMeta) book.getItemMeta();
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Welcome to Eat More");
        pages.add("Brief overview of what each food item does");
        pages.add("Do /help GoodEats for list of commands");
        pages.add("Cooked Beef gives health boost");
        pages.add("Cooked chicken gives Luck");
        pages.add("Cooked Cod gives absorption hearts ");
        pages.add("Cooked Sheep gives Saturation");
        pages.add("Cooked Porkchop gives damage resistance ");
        pages.add("Cooked Rabbit give slowfalling ");
        pages.add("Cooked Salmon give insta health ");
        pages.add("Baked Potato  gives conduit power");
        pages.add("Beat Soup gives Levitation");
        pages.add("Bread gives jump boost");
        pages.add("Dried Kelp gives Strength");
        pages.add("Mushroom Stew gives haste");
        pages.add("Rabbit Stew gives night vision");
        pages.add("Cookie gives Speed");
        pages.add(ChatColor.DARK_GREEN + "That's all Folks!");

        bookMeta.setAuthor("Ava");
        bookMeta.setTitle("Eatmore");
        bookMeta.setDisplayName(ChatColor.DARK_RED +  "Eat More Guide");
        bookMeta.isUnbreakable();
        bookMeta.setLore(Collections.singletonList(ChatColor.LIGHT_PURPLE + "Eat More guide for the less Intelligent"));
        bookMeta.getLore();
        bookMeta.getPages();

        bookMeta.setPages(pages);
        book.setItemMeta(bookMeta);
        if(sender instanceof Player){

            if(cooldown.containsKey(p.getName())){
                if(cooldown.get(p.getName()) > System.currentTimeMillis()){
                    long timeleft = (cooldown.get(p.getName()) - System.currentTimeMillis()) /1000;
                    p.sendMessage(ChatColor.GOLD + "Calm down Buck a roo" + timeleft + "Seconds");
                    System.out.println();
                }
                return true;
            }
            cooldown.put(p.getName(), System.currentTimeMillis()+(9 * 1000) );
            p.getInventory().addItem(new ItemStack(book));
        }else {
            System.out.println("You must be a player to use this command");
            return false;
        }


        return true;
    }



}
