package org.limedits.goodeats.Evant;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PlaySneak implements Listener {

    @EventHandler
    public void onPlayerSneak(PlayerToggleSneakEvent e ){
        Player p = e.getPlayer();
        if(p.isSneaking()){
            p.setInvisible(false) ;
        }

    }

}
