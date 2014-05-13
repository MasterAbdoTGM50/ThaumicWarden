package matgm50.twarden.item;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.lib.ItemLib;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 5/13/2014.
 */

public class TWItems {

    public static Item itemWardenResource;

    public static void init() {

        itemWardenResource = new ItemWardenResource();

        GameRegistry.registerItem(itemWardenResource, ItemLib.RESOURCE_NAME);

    }

}
