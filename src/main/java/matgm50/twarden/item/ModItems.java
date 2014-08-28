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

    public static Item itemResource = new ItemResource();
    public static Item itemWardenAmulet = new ItemWardenAmulet();
    public static Item itemWardenSword = new ItemWardenSword();
    public static Item itemFocusPurity = new ItemFocusPurity();
    public static Item itemWardenHelm = new ItemWardenHelm();
    public static Item itemWardenChest = new ItemWardenChest();
    public static Item itemWardenLegs = new ItemWardenLegs();
    public static Item itemWardenBoots = new ItemWardenBoots();
    public static Item itemLoveRing = new ItemLoveRing();
    public static Item itemWaslieHammer = new ItemWaslieHammer();

    public static void init() {

        GameRegistry.registerItem(itemResource, ItemLib.RESOURCE_NAME);
        GameRegistry.registerItem(itemFocusPurity, ItemLib.PURITY_FOCUS_NAME);
        GameRegistry.registerItem(itemWardenSword, ItemLib.WARDEN_SWORD_NAME);
        GameRegistry.registerItem(itemWardenAmulet, ItemLib.WARDEN_AMULET_NAME);
        GameRegistry.registerItem(itemWardenHelm, ItemLib.WARDEN_HELM_NAME);
        GameRegistry.registerItem(itemWardenChest, ItemLib.WARDEN_CHEST_NAME);
        GameRegistry.registerItem(itemWardenLegs, ItemLib.WARDEN_LEGS_NAME);
        GameRegistry.registerItem(itemWardenBoots, ItemLib.WARDEN_BOOTS_NAME);
        GameRegistry.registerItem(itemLoveRing, ItemLib.LOVE_RING_NAME);
        GameRegistry.registerItem(itemWaslieHammer, ItemLib.WASLIE_HAMMER_NAME);

    }

}
