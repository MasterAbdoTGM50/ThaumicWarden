package matgm50.twarden.util.wardenic;

import matgm50.twarden.research.ModResearch;
import matgm50.twarden.util.wardenic.upgrade.WardenicUpgrade;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.HashMap;

/**
 * Created by MasterAbdoTGM50 on 6/24/2014.
 */

public class WardenicChargeHelper {

    public static HashMap<String, WardenicUpgrade> upgrades = new HashMap<String, WardenicUpgrade>();

    public static void addUpgrade(WardenicUpgrade upgrade) {

        addUpgrade(upgrade.aspect.getName(), upgrade);

    }

    public static void addUpgrade(String key, WardenicUpgrade upgrade) {

        upgrades.put(key, upgrade);

    }

    public static WardenicUpgrade getUpgrade(ItemStack stack) {

        if(stack.stackTagCompound != null) {

            if(stack.stackTagCompound.hasKey("upgrade")) {

                return upgrades.get(stack.stackTagCompound.getString("upgrade"));

            } else {

                return upgrades.get(ModResearch.EXUBITOR.getName());

            }

        } else {

            return upgrades.get(ModResearch.EXUBITOR.getName());

        }

    }

    public static void setUpgradeOnStack(ItemStack stack, String key) {

        if(stack.stackTagCompound == null) {

            stack.setTagCompound(new NBTTagCompound());

        }

        stack.stackTagCompound.setString("upgrade", key);

    }

}
