package matgm50.twarden.util.upgrade;

import matgm50.twarden.research.ModResearch;
import matgm50.twarden.util.WardenicHelper;
import thaumcraft.api.aspects.Aspect;

/**
 * Created by MasterAbdoTGM50 on 7/16/2014.
 */

public class WardenicUpgrades {

    public static final WardenicUpgrade WARDEN = new WardenicUpgradeWarden(ModResearch.EXUBITOR);
    public static final WardenicUpgrade FIRE = new WardenicUpgradeWarden(Aspect.FIRE);

    public static void init() {

        WardenicHelper.addUpgrade(ModResearch.EXUBITOR.getName(), WARDEN);
        WardenicHelper.addUpgrade(Aspect.FIRE.getName(), FIRE);

    }

}
