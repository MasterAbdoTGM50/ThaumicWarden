package matgm50.twarden.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.EntityDamageSource;

/**
 * Created by MasterAbdoTGM50 on 6/24/2014.
 */

public class DamageSourceWardenSword extends EntityDamageSource {

    public DamageSourceWardenSword(String par1Str, Entity par2Entity) {

        super(par1Str, par2Entity);
        setDamageBypassesArmor();
        setDamageIsAbsolute();

    }
}
