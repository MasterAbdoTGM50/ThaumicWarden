package matgm50.twarden.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import matgm50.twarden.TWarden;

/**
 * Created by MasterAbdoTGM50 on 5/20/2014.
 */

public class ModEntities {

    public static void init() {

        EntityRegistry.registerModEntity(EntityPurity.class, "PurityOrb", 0, TWarden.instance, 64, 10, true);

    }

}
