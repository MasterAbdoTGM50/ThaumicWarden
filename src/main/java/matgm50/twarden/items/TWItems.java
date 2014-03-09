package matgm50.twarden.items;

import matgm50.twarden.config.TWItemConfig;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWItems {
	
	public static EnumArmorMaterial ArmorWardenMaterial = EnumHelper.addArmorMaterial("WARDENENIC", 50, new int[] {3, 8, 6, 3}, 50);
	public static EnumToolMaterial ToolWardenMaterial = EnumHelper.addToolMaterial("WARDENIC", 4, 3000, 15F, 5.0F, 50);
	
	public static EnumArmorMaterial ArmorTaintedMaterial = EnumHelper.addArmorMaterial("TAINTED", 50, new int[] {2, 6, 5, 2}, 50);
	public static EnumToolMaterial ToolTaintedMaterial = EnumHelper.addToolMaterial("TAINTED", 4, 500, 15F, 5.0F, 50);
	
	public static Item TWHelm;
	public static Item TWChest;
	public static Item TWLegs;
	public static Item TWBoots;
	public static Item TWCross;
	public static Item TWResource;
	public static Item TWSigil;
	public static Item TWAmulet;
	public static Item TWTaintedHelm;
	public static Item TWTaintedChest;
	public static Item TWTaintedLegs;
	public static Item TWTaintedBoots;
	public static Item TWTaintedBlade;
	
	public static void Init() {
		
		TWHelm = new TWHelm(TWItemConfig.TWHELM_ID, ArmorWardenMaterial);
		TWChest = new TWChest(TWItemConfig.TWCHEST_ID, ArmorWardenMaterial);
		TWLegs = new TWLegs(TWItemConfig.TWLEGS_ID, ArmorWardenMaterial);
		TWBoots = new TWBoots(TWItemConfig.TWBOOTS_ID, ArmorWardenMaterial);
		TWCross = new TWCross(TWItemConfig.TWCROSS_ID);
		TWResource = new TWResource(TWItemConfig.TWRESOURCE_ID);
		TWSigil = new TWSigil(TWItemConfig.TWSIGIL_ID);
		TWAmulet = new TWAmulet(TWItemConfig.TWAMULET_ID);
		TWTaintedHelm = new TWTaintedArmor(TWItemConfig.TWTAINTEDHELM_ID, ArmorTaintedMaterial, 0).setUnlocalizedName(TWItemConfig.TWTAINTEDHELM_UN_NAME);
		TWTaintedChest = new TWTaintedArmor(TWItemConfig.TWTAINTEDCHEST_ID, ArmorTaintedMaterial, 1).setUnlocalizedName(TWItemConfig.TWTAINTEDCHEST_UN_NAME);
		TWTaintedLegs = new TWTaintedArmor(TWItemConfig.TWTAINTEDLEGS_ID, ArmorTaintedMaterial, 2).setUnlocalizedName(TWItemConfig.TWTAINTEDLEGS_UN_NAME);
		TWTaintedBoots = new TWTaintedArmor(TWItemConfig.TWTAINTEDBOOTS_ID, ArmorTaintedMaterial, 3).setUnlocalizedName(TWItemConfig.TWTAINTEDBOOTS_UN_NAME);
		TWTaintedBlade = new TWTaintedBlade(TWItemConfig.TWTAINTEDBLADE_ID, ToolTaintedMaterial);
		
		GameRegistry.registerItem(TWHelm, TWItemConfig.TWHELM_KEY);
		GameRegistry.registerItem(TWChest, TWItemConfig.TWCHEST_KEY);
		GameRegistry.registerItem(TWLegs, TWItemConfig.TWLEGS_KEY);
		GameRegistry.registerItem(TWBoots, TWItemConfig.TWBOOTS_KEY);
		GameRegistry.registerItem(TWCross, TWItemConfig.TWCROSS_KEY);
		GameRegistry.registerItem(TWResource, TWItemConfig.TWRESOURCE_KEY);
		GameRegistry.registerItem(TWSigil, TWItemConfig.TWSIGIL_KEY);
		GameRegistry.registerItem(TWAmulet, TWItemConfig.TWAMULET_KEY);
		GameRegistry.registerItem(TWTaintedHelm, TWItemConfig.TWTAINTEDHELM_KEY);
		GameRegistry.registerItem(TWTaintedChest, TWItemConfig.TWTAINTEDCHEST_KEY);
		GameRegistry.registerItem(TWTaintedLegs, TWItemConfig.TWTAINTEDLEGS_KEY);
		GameRegistry.registerItem(TWTaintedBoots, TWItemConfig.TWTAINTEDBOOTS_KEY);
		GameRegistry.registerItem(TWTaintedBlade, TWItemConfig.TWTAINTEDBLADE_KEY);
		
	}
	
}