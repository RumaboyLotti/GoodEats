package org.limedits.goodeats.Simplifications;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import static org.bukkit.Material.*;
import static org.bukkit.potion.PotionEffectType.*;

public enum Enchantments {


    UNO(COOKED_BEEF, new PotionEffect(HEALTH_BOOST, 200, 1)),
    DOS(COOKED_CHICKEN, new PotionEffect(LUCK, 200, 1)),
    TRES(COOKED_COD, new PotionEffect(ABSORPTION, 200, 1)),
    QUATRO(COOKED_MUTTON, new PotionEffect(SATURATION, 200, 1)),
    CINCO(COOKED_PORKCHOP, new PotionEffect(DAMAGE_RESISTANCE, 200, 1)),
    SIES(COOKED_RABBIT, new PotionEffect(SLOW_FALLING, 200, 1)),
    SIETTE(COOKED_SALMON, new PotionEffect(HEAL, 200, 1)),
    UN(BAKED_POTATO, new PotionEffect(CONDUIT_POWER, 200, 1)),
    DU(BEETROOT_SOUP, new PotionEffect(LEVITATION, 200, 1)),
    TROIS(BREAD, new PotionEffect(JUMP, 200, 1)),
    DOUBLED(KELP, new PotionEffect(INCREASE_DAMAGE, 200, 1)),
    FASTD(MUSHROOM_STEM, new PotionEffect(FAST_DIGGING, 200, 1)),
    NIGHTV(RABBIT_STEW, new PotionEffect(NIGHT_VISION, 200, 1)),
    ZOOM(COOKIE, new PotionEffect(SPEED, 200, 1));


    public final PotionEffect effect;
    public final Material mat;

    Enchantments(Material mat, PotionEffect effect) {
        this.mat = mat;
        this.effect = effect;

    }

    public void apply(Player player){
        player.addPotionEffect(effect);
    }

    public void hasIcon() {
        effect.hasIcon();
    }
}
