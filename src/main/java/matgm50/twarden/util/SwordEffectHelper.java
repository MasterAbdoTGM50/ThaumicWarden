package matgm50.twarden.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

/**
 * Created by MasterAbdoTGM50 on 6/24/2014.
 */

public class SwordEffectHelper {

    public static final String WARDEN = "WARDEN";
    public static final String ORDER = "ORDER";
    public static final String CHAOS = "CHAOS";
    public static final String WATER = "WATER";
    public static final String FIRE = "FIRE";
    public static final String EARTH = "EARTH";
    public static final String AIR = "AIR";

    public static void doEffect(String effect, int bonus, ItemStack stack, EntityPlayer player, Entity entity) {

        if(effect == WARDEN) {

            DamageSource damageSource = new DamageSourceWardenSword("warden", player);
            entity.attackEntityFrom(damageSource, 2 * bonus);

        }

    }

}
