package org.limedits.goodeats.Evant;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.ArrayList;



public class PlayerEatEvent implements   Listener {
    @EventHandler
    public void onPlayerEat(PlayerItemConsumeEvent e){
      ItemStack beef = new ItemStack(Material.COOKED_BEEF);
      ItemStack chicken = new ItemStack(Material.COOKED_CHICKEN);
      ItemStack cod = new ItemStack(Material.COOKED_COD);
      ItemStack sheep = new ItemStack(Material.COOKED_MUTTON);
      ItemStack pig = new ItemStack(Material.COOKED_PORKCHOP);
      ItemStack bunny = new ItemStack(Material.COOKED_RABBIT);
      ItemStack salmon = new ItemStack(Material.COOKED_SALMON);
      Player p =  e.getPlayer();
      LivingEntity liv = p;

        ArrayList<ItemStack> protein = new ArrayList<>();
        String[] proteins_list = protein.toArray(new String[0]);
        protein.add(beef);
        protein.add(chicken);
        protein.add(cod);
        protein.add(sheep);
        protein.add(pig);
        protein.add(bunny);
        protein.add(salmon);
            if(p.getItemInUse ().isSimilar(beef)){
                p.setGlowing(true);uno.hasIcon();p.addPotionEffect(uno); e.getPlayer().addPotionEffect(uno);
            }else if (p.getItemInUse ().isSimilar (chicken)){
                p.addPotionEffect(dos); dos.hasIcon();  e.getPlayer().addPotionEffect(dos);
            }else if (p.getItemInUse ().isSimilar (cod)){
                p.addPotionEffect(tres); tres.hasIcon(); e.getPlayer().addPotionEffect(tres);
            }else if (p.getItemInUse ().isSimilar(sheep)){
                p.addPotionEffect(quarto); quarto.hasIcon(); e.getPlayer().addPotionEffect(quarto);
            }else if (p.getItemInUse ().isSimilar(pig)){
                p.addPotionEffect(cinco); cinco.hasIcon();  e.getPlayer().addPotionEffect(cinco);
            }else if (p.getItemInUse ().isSimilar (bunny)){
                p.addPotionEffect(sies); sies.hasIcon();  e.getPlayer().addPotionEffect(sies);
            }else if (p.getItemInUse ().isSimilar(salmon)){
                p.addPotionEffect(siette); siette.hasIcon();  e.getPlayer().addPotionEffect(siette);
            }

    }

    PotionEffect uno = new PotionEffect(PotionEffectType.HEALTH_BOOST, 200,1);
    PotionEffect dos = new PotionEffect(PotionEffectType.LUCK, 200, 1);
    PotionEffect tres = new PotionEffect(PotionEffectType.ABSORPTION, 200, 2);
    PotionEffect quarto = new PotionEffect(PotionEffectType.SATURATION, 200, 1);
    PotionEffect cinco = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1);
    PotionEffect sies = new PotionEffect(PotionEffectType.SLOW_FALLING, 200, 1);
    PotionEffect siette = new PotionEffect(PotionEffectType.HEAL, 200, 1);

}