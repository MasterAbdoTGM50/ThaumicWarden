package matgm50.twarden.util.wardenic;

import matgm50.twarden.research.ModResearch;
import matgm50.twarden.util.wardenic.upgrade.WardenicUpgrade;
import matgm50.twarden.util.wardenic.upgrade.WardenicUpgradeArmor;
import matgm50.twarden.util.wardenic.upgrade.WardenicUpgradeFire;
import matgm50.twarden.util.wardenic.upgrade.WardenicUpgradeWarden;
import thaumcraft.api.aspects.Aspect;

/**
 * Created by MasterAbdoTGM50 on 7/16/2014.
 */

public class WardenicUpgrades {

    public static final WardenicUpgrade WARDEN = new WardenicUpgradeWarden(ModResearch.EXUBITOR);
    public static final WardenicUpgrade FIRE = new WardenicUpgradeFire(Aspect.FIRE);
    public static final WardenicUpgrade ARMOR = new WardenicUpgradeArmor(Aspect.ARMOR);

    public static void init() {

        WardenicChargeHelper.addUpgrade(ModResearch.EXUBITOR.getName(), WARDEN);
        WardenicChargeHelper.addUpgrade(Aspect.FIRE.getName(), FIRE);
        WardenicChargeHelper.addUpgrade(Aspect.ARMOR.getName(), ARMOR);

    }

}
