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

public class PlaayerEatCarbs implements Listener {

        @EventHandler
        public void onPlayerEat(PlayerItemConsumeEvent e){
            ItemStack potato = new ItemStack(Material.BAKED_POTATO);
            ItemStack beet_soup = new ItemStack(Material.BEETROOT_SOUP);
            ItemStack bread = new ItemStack(Material.BREAD);
            ItemStack kelp = new ItemStack(Material.DRIED_KELP);
            ItemStack m_stew = new ItemStack(Material.MUSHROOM_STEM);
            ItemStack r_stew = new ItemStack(Material.RABBIT_STEW);
            ItemStack cookie = new ItemStack(Material.COOKIE);
            Player p =  e.getPlayer();
            LivingEntity liv = p;

            ArrayList<ItemStack> carb = new ArrayList<>();
            String[] carb_list = carb.toArray(new String[0]);
            carb.add(potato);
            carb.add(beet_soup);
            carb.add(bread);
            carb.add(kelp);
            carb.add(m_stew);
            carb.add(r_stew);
            carb.add(cookie);
            if(p.getItemInUse ().isSimilar(potato)){
                p.setGlowing(true);
                un.hasIcon();p.addPotionEffect(un); e.getPlayer().addPotionEffect(un);
            }else if (p.getItemInUse ().isSimilar (beet_soup)){
                p.addPotionEffect(du); du.hasIcon();  e.getPlayer().addPotionEffect(du);
            }else if (p.getItemInUse ().isSimilar (bread)){
                p.addPotionEffect(trois); trois.hasIcon(); e.getPlayer().addPotionEffect(trois);
            }else if (p.getItemInUse ().isSimilar(kelp)){
                p.addPotionEffect(doubled); doubled.hasIcon(); e.getPlayer().addPotionEffect(doubled);
            }else if (p.getItemInUse ().isSimilar(m_stew)){
                p.addPotionEffect(fastd); fastd.hasIcon();  e.getPlayer().addPotionEffect(fastd);
            }else if (p.getItemInUse ().isSimilar (r_stew)){
                p.addPotionEffect(nightv); nightv.hasIcon();  e.getPlayer().addPotionEffect(nightv);
            }else if (p.getItemInUse ().isSimilar(cookie)){
                p.addPotionEffect(zoom); zoom.hasIcon();  e.getPlayer().addPotionEffect(zoom);
            }
        }

        PotionEffect un = new PotionEffect(PotionEffectType.CONDUIT_POWER, 200, 1 );
        PotionEffect du = new PotionEffect(PotionEffectType.LEVITATION, 200, 1 );
        PotionEffect trois = new PotionEffect(PotionEffectType.JUMP, 200, 2 );
        PotionEffect doubled = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 1 );
        PotionEffect fastd = new PotionEffect(PotionEffectType.FAST_DIGGING, 200, 1 );
        PotionEffect nightv = new PotionEffect(PotionEffectType.NIGHT_VISION, 200, 1 );
        PotionEffect zoom = new PotionEffect(PotionEffectType.SPEED, 200, 1 );

    }
