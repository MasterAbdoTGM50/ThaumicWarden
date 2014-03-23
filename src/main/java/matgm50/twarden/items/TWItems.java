package matgm50.twarden.items;

import matgm50.twarden.config.TWItemConfig;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWItems {
	
	public static ArmorMaterial ArmorWardenMaterial = EnumHelper.addArmorMaterial("WARDENENIC", 50, new int[] {3, 8, 6, 3}, 50);
	public static ToolMaterial ToolWardenMaterial = EnumHelper.addToolMaterial("WARDENIC", 4, 3000, 15F, 5.0F, 50);
	
	public static ArmorMaterial ArmorTaintedMaterial = EnumHelper.addArmorMaterial("TAINTED", 50, new int[] {2, 6, 5, 2}, 50);
	public static ToolMaterial ToolTaintedMaterial = EnumHelper.addToolMaterial("TAINTED", 4, 500, 15F, 5.0F, 50);
	
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
	public static Item TWLizHammer;
	public static Item TWFeather;
	public static Item TWMagicAmulet;
	
	public static void Init() {
		
		TWHelm = new TWHelm(ArmorWardenMaterial);
		TWChest = new TWChest(ArmorWardenMaterial);
		TWLegs = new TWLegs(ArmorWardenMaterial);
		TWBoots = new TWBoots(ArmorWardenMaterial);
		TWCross = new TWCross();
		TWResource = new TWResource();
		TWSigil = new TWSigil();
		TWAmulet = new TWAmulet();
		TWTaintedHelm = new TWTaintedArmor(ArmorTaintedMaterial, 0).setUnlocalizedName(TWItemConfig.TWTAINTEDHELM_UN_NAME);
		TWTaintedChest = new TWTaintedArmor(ArmorTaintedMaterial, 1).setUnlocalizedName(TWItemConfig.TWTAINTEDCHEST_UN_NAME);
		TWTaintedLegs = new TWTaintedArmor(ArmorTaintedMaterial, 2).setUnlocalizedName(TWItemConfig.TWTAINTEDLEGS_UN_NAME);
		TWTaintedBoots = new TWTaintedArmor(ArmorTaintedMaterial, 3).setUnlocalizedName(TWItemConfig.TWTAINTEDBOOTS_UN_NAME);
		TWTaintedBlade = new TWTaintedBlade(ToolTaintedMaterial);
		TWLizHammer = new TWLizHammer();
		TWFeather = new TWFeather();
		TWMagicAmulet = new TWMagicAmulet();
		
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
		GameRegistry.registerItem(TWLizHammer, TWItemConfig.TWLIZHAMMER_KEY);
		GameRegistry.registerItem(TWFeather, TWItemConfig.TWFEATHER_KEY);
		GameRegistry.registerItem(TWMagicAmulet, TWItemConfig.TWMAGICAMULET_KEY);
		
	}
	
}