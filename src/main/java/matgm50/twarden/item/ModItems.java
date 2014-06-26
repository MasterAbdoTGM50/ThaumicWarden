package matgm50.twarden.item;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.lib.ItemLib;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by MasterAbdoTGM50 on 5/13/2014.
 */

public class ModItems {

    public static ArmorMaterial materialWarden = EnumHelper.addArmorMaterial("WARDEN", 33, new int[]{3, 8, 6, 3}, 50);

    public static Item itemResource;
    public static Item itemWardenAmulet;
    public static Item itemWardenSword;
    public static Item itemFocusPurity;
    public static Item itemWardenHelm;
    public static Item itemWardenChest;
    public static Item itemWardenLegs;
    public static Item itemWardenBoots;
    public static Item itemLoveRing;

    public static void init() {

        itemResource = new ItemResource();
        itemWardenAmulet = new ItemWardenAmulet();
        itemWardenSword = new ItemWardenSword();
        itemFocusPurity = new ItemFocusPurity();
        itemWardenHelm = new ItemWardenHelm();
        itemWardenChest = new ItemWardenChest();
        itemWardenLegs = new ItemWardenLegs();
        itemWardenBoots = new ItemWardenBoots();
        itemLoveRing = new ItemLoveRing();

        GameRegistry.registerItem(itemResource, ItemLib.RESOURCE_NAME);
        GameRegistry.registerItem(itemFocusPurity, ItemLib.PURITY_FOCUS_NAME);
        GameRegistry.registerItem(itemWardenSword, ItemLib.WARDEN_SWORD_NAME);
        GameRegistry.registerItem(itemWardenAmulet, ItemLib.WARDEN_AMULET_NAME);
        GameRegistry.registerItem(itemWardenHelm, ItemLib.WARDEN_HELM_NAME);
        GameRegistry.registerItem(itemWardenChest, ItemLib.WARDEN_CHEST_NAME);
        GameRegistry.registerItem(itemWardenLegs, ItemLib.WARDEN_LEGS_NAME);
        GameRegistry.registerItem(itemWardenBoots, ItemLib.WARDEN_BOOTS_NAME);
        GameRegistry.registerItem(itemLoveRing, ItemLib.LOVE_RING_NAME);

    }

}
