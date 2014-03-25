package matgm50.twarden.items;

import matgm50.twarden.config.TWItemConfig;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWItems {
	
	public static ArmorMaterial wardenArmorMaterial = EnumHelper.addArmorMaterial("WARDENIC", 50, new int[] {3, 8, 6, 3}, 50);
	public static ToolMaterial wardenToolMaterial = EnumHelper.addToolMaterial("WARDENIC", 4, 3000, 15F, 5.0F, 50);
	
	public static ArmorMaterial taintArmorMaterial = EnumHelper.addArmorMaterial("TAINTED", 50, new int[] {2, 6, 5, 2}, 50);
	public static ToolMaterial taintToolMaterial = EnumHelper.addToolMaterial("TAINTED", 4, 500, 15F, 5.0F, 50);
	
	public static Item twHelm;
	public static Item twChest;
	public static Item twLegs;
	public static Item twBoots;
	public static Item twCross;
	public static Item twResource;
	public static Item twSigil;
	public static Item twAmulet;
	public static Item twTaintedHelm;
	public static Item twTaintedChest;
	public static Item twTaintedLegs;
	public static Item twTaintedBoots;
	public static Item twTaintedBlade;
	public static Item twLizHammer;
	public static Item twFeather;
	public static Item twMagicAmulet;
	
	public static void init() {
		
		twHelm = new TWHelm(wardenArmorMaterial);
		twChest = new TWChest(wardenArmorMaterial);
		twLegs = new TWLegs(wardenArmorMaterial);
		twBoots = new TWBoots(wardenArmorMaterial);
		twCross = new TWCross();
		twResource = new TWResource();
		twSigil = new TWSigil();
		twAmulet = new TWAmulet();
		twTaintedHelm = new TWTaintedArmor(taintArmorMaterial, 0).setUnlocalizedName(TWItemConfig.TWTAINTEDHELM_UN_NAME);
		twTaintedChest = new TWTaintedArmor(taintArmorMaterial, 1).setUnlocalizedName(TWItemConfig.TWTAINTEDCHEST_UN_NAME);
		twTaintedLegs = new TWTaintedArmor(taintArmorMaterial, 2).setUnlocalizedName(TWItemConfig.TWTAINTEDLEGS_UN_NAME);
		twTaintedBoots = new TWTaintedArmor(taintArmorMaterial, 3).setUnlocalizedName(TWItemConfig.TWTAINTEDBOOTS_UN_NAME);
		twTaintedBlade = new TWTaintedBlade(taintToolMaterial);
		twLizHammer = new TWLizHammer();
		twFeather = new TWFeather();
		twMagicAmulet = new TWMagicAmulet();
		
		GameRegistry.registerItem(twHelm, TWItemConfig.TWHELM_KEY);
		GameRegistry.registerItem(twChest, TWItemConfig.TWCHEST_KEY);
		GameRegistry.registerItem(twLegs, TWItemConfig.TWLEGS_KEY);
		GameRegistry.registerItem(twBoots, TWItemConfig.TWBOOTS_KEY);
		GameRegistry.registerItem(twCross, TWItemConfig.TWCROSS_KEY);
		GameRegistry.registerItem(twResource, TWItemConfig.TWRESOURCE_KEY);
		GameRegistry.registerItem(twSigil, TWItemConfig.TWSIGIL_KEY);
		GameRegistry.registerItem(twAmulet, TWItemConfig.TWAMULET_KEY);
		GameRegistry.registerItem(twTaintedHelm, TWItemConfig.TWTAINTEDHELM_KEY);
		GameRegistry.registerItem(twTaintedChest, TWItemConfig.TWTAINTEDCHEST_KEY);
		GameRegistry.registerItem(twTaintedLegs, TWItemConfig.TWTAINTEDLEGS_KEY);
		GameRegistry.registerItem(twTaintedBoots, TWItemConfig.TWTAINTEDBOOTS_KEY);
		GameRegistry.registerItem(twTaintedBlade, TWItemConfig.TWTAINTEDBLADE_KEY);
		GameRegistry.registerItem(twLizHammer, TWItemConfig.TWLIZHAMMER_KEY);
		GameRegistry.registerItem(twFeather, TWItemConfig.TWFEATHER_KEY);
		GameRegistry.registerItem(twMagicAmulet, TWItemConfig.TWMAGICAMULET_KEY);
		
	}
	
}