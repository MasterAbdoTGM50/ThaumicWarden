package matgm50.twarden.world;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModGen {

    public static void init() {

        GameRegistry.registerWorldGenerator(new GenExubitura(), 1);

    }

}