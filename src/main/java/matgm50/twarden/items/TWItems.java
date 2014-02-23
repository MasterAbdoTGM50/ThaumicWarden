package matgm50.twarden.items;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.config.TWItemConfig;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class TWItems {
	
	public static EnumArmorMaterial ArmorWardenMaterial = EnumHelper.addArmorMaterial("WARDENENIC", 50, new int[] { 4, 10, 8, 4}, 50);
	public static EnumToolMaterial ToolWardenMaterial = EnumHelper.addToolMaterial("WARDENIC", 4, 3000, 15F, 10.0F, 50);
	
	public static Item TWHelm;
	public static Item TWChest;
	public static Item TWLegs;
	public static Item TWBoots;
	public static Item TWSword;
	public static Item TWBow;
	public static Item TWResource;
	public static Item TWSigil;
	public static Item TWAmulet;
	public static Item TWBlood;
	
	public static void Init() {
		
		TWHelm = new TWHelm(TWItemConfig.TWHELM_ID, ArmorWardenMaterial);
		TWChest = new TWChest(TWItemConfig.TWCHEST_ID, ArmorWardenMaterial);
		TWLegs = new TWLegs(TWItemConfig.TWLEGS_ID, ArmorWardenMaterial);
		TWBoots = new TWBoots(TWItemConfig.TWBOOTS_ID, ArmorWardenMaterial);
		TWSword = new TWSword(TWItemConfig.TWSWORD_ID, ToolWardenMaterial);
		TWBow = new TWBow(TWItemConfig.TWBOW_ID);
		TWResource = new TWResource(TWItemConfig.TWRESOURCE_ID);
		TWSigil = new TWSigil(TWItemConfig.TWSIGIL_ID);
		TWAmulet = new TWAmulet(TWItemConfig.TWAMULET_ID);
		TWBlood = new TWBlood(TWItemConfig.TWBLOOD_ID, 0, 0, false);
		
		GameRegistry.registerItem(TWHelm, TWItemConfig.TWHELM_KEY);
		GameRegistry.registerItem(TWChest, TWItemConfig.TWCHEST_KEY);
		GameRegistry.registerItem(TWLegs, TWItemConfig.TWLEGS_KEY);
		GameRegistry.registerItem(TWBoots, TWItemConfig.TWBOOTS_KEY);
		GameRegistry.registerItem(TWSword, TWItemConfig.TWSWORD_KEY);
		GameRegistry.registerItem(TWBow, TWItemConfig.TWBOW_KEY);
		GameRegistry.registerItem(TWResource, TWItemConfig.TWRESOURCE_KEY);
		GameRegistry.registerItem(TWSigil, TWItemConfig.TWSIGIL_KEY);
		GameRegistry.registerItem(TWAmulet, TWItemConfig.TWAMULET_KEY);
		GameRegistry.registerItem(TWBlood, TWItemConfig.TWBLOOD_KEY);
		
	}
	
}