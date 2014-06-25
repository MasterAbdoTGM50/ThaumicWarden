package matgm50.twarden.item;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.lib.ItemLib;
import net.minecraft.item.Item;

/**
 * Created by MasterAbdoTGM50 on 5/13/2014.
 */

public class ModItems {

    public static Item itemResource;
    public static Item itemWardenAmulet;
    public static Item itemWardenSword;
    public static Item itemFocusPurity;

    public static void init() {

        itemResource = new ItemResource();
        itemWardenAmulet = new ItemWardenAmulet();
        itemWardenSword = new ItemWardenSword();
        itemFocusPurity = new ItemFocusPurity();

        GameRegistry.registerItem(itemResource, ItemLib.RESOURCE_NAME);
        GameRegistry.registerItem(itemFocusPurity, ItemLib.PURITY_FOCUS_NAME);
        GameRegistry.registerItem(itemWardenSword, ItemLib.WARDEN_SWORD_NAME);
        GameRegistry.registerItem(itemWardenAmulet, ItemLib.WARDEN_AMULET_NAME);

    }

}
