package matgm50.twarden.util;

import matgm50.twarden.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 5/13/2014.
 */

public class TabTWarden extends CreativeTabs {

    public TabTWarden(String label) {

        super(label);

    }

    @Override
    public Item getTabIconItem() {

        return ModItems.itemWardenAmulet;

    }

}
