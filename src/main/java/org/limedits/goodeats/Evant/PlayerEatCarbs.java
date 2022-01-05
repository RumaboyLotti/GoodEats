package org.limedits.goodeats.Evant;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import static org.limedits.goodeats.Simplifications.Enchantments.*;


public class PlayerEatCarbs implements Listener {


        @EventHandler
        public void onPlayerEat(PlayerItemConsumeEvent event){
            Player p =  event.getPlayer();
            LivingEntity liv = p;



            if(p.getItemInUse().equals(UN)){
                p.setGlowing(true); UN.hasIcon();UN.apply(event.getPlayer()); UN.apply(p);
            }else if (p.getItemInUse ().equals(DU)){
                DU.hasIcon();DU.apply(event.getPlayer());
            }else if (p.getItemInUse ().equals (TROIS)){
               TROIS.hasIcon(); TROIS.apply(event.getPlayer());
            }else if (p.getItemInUse().equals(DOUBLED)){
                DOUBLED.hasIcon(); DOUBLED.apply(event.getPlayer());
            }else if (p.getItemInUse ().equals(FASTD)){
                 FASTD.hasIcon(); FASTD.apply(event.getPlayer());
            }else if (p.getItemInUse ().equals(NIGHTV)){
                NIGHTV.hasIcon(); NIGHTV.apply(event.getPlayer());
            }else if (p.getItemInUse ().equals(ZOOM)){
                ZOOM.apply(event.getPlayer()); ZOOM.hasIcon();
            }
        }




    }
