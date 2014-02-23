package matgm50.twarden.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import matgm50.twarden.config.TWResearchConfig;
import matgm50.twarden.items.TWItems;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

public class TWRecipes {
	
	public static CrucibleRecipe TWQuartz;
	public static ShapedArcaneRecipe TWHelm;
	public static ShapedArcaneRecipe TWChest;
	public static ShapedArcaneRecipe TWLegs;
	public static ShapedArcaneRecipe TWBoots;
	public static ShapedArcaneRecipe TWSword;
	public static ShapedArcaneRecipe TWBow;
	public static ShapedArcaneRecipe TWFrame;
	public static ShapedArcaneRecipe TWStone;
	public static ShapedArcaneRecipe TWSigil;
	public static ShapedArcaneRecipe TWAmulet;
	
	public static void Init() {
		
		InitCrucible();
		InitArcane();
		
	}
	
	public static void InitCrucible() {
		
		TWQuartz = ThaumcraftApi.addCrucibleRecipe(TWResearchConfig.TWQUARTZ_KEY, new ItemStack(TWItems.TWResource, 1, 0), new ItemStack(Item.netherQuartz), new AspectList().add(Aspect.ELDRITCH, 4).add(Aspect.MAGIC, 4).add(Aspect.CRYSTAL, 4));
		
	}
	
	public static void InitArcane() {
		
		TWHelm = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWHelm, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				" I ", "XOX", "XHX", 'X', new ItemStack(TWItems.TWResource, 1, 0), 'O', new ItemStack(TWItems.TWSigil, 1), 'H', new ItemStack(ConfigItems.itemHelmetThaumium, 1), 'I', new ItemStack(ConfigItems.itemGoggles, 1));
		TWChest = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.TWChest, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"XMX", "XOX", "XHX", 'X', new ItemStack(TWItems.TWResource, 1, 0), 'O', new ItemStack(TWItems.TWSigil, 1), 'M', new ItemStack(ConfigItems.itemChestRobe, 1), 'H', new ItemStack(ConfigItems.itemChestThaumium, 1));
		TWLegs = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWLegs, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"XMX", "XOX", "XHX", 'X', new ItemStack(TWItems.TWResource, 1, 0), 'O', new ItemStack(TWItems.TWSigil, 1), 'M', new ItemStack(ConfigItems.itemLegsRobe, 1), 'H', new ItemStack(ConfigItems.itemLegsThaumium, 1));
		TWBoots = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWBoots, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				" I ", "XOX", "XHX", 'X', new ItemStack(TWItems.TWResource, 1, 0), 'O', new ItemStack(TWItems.TWSigil, 1), 'H', new ItemStack(ConfigItems.itemBootsRobe, 1), 'I', new ItemStack(ConfigItems.itemBootsThaumium, 1));
		TWSword = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWSword, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				" X ", " O ", "XHX", 'X', new ItemStack(TWItems.TWResource, 1, 0), 'O', new ItemStack(TWItems.TWSigil, 1), 'H', new ItemStack(ConfigItems.itemSwordThaumium, 1));
		TWBow = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.TWBow, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				" XI", "XOH", " XI", 'X', new ItemStack(TWItems.TWResource, 1, 0), 'O', new ItemStack(TWItems.TWSigil, 1), 'H', new ItemStack(Item.bow, 1), 'I', new ItemStack(ConfigItems.itemResource, 1, 7));
		TWFrame = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.TWResource, 1, 1), new AspectList().add(Aspect.ORDER, 60).add(Aspect.ENTROPY, 60).add(Aspect.AIR, 60).add(Aspect.EARTH, 60).add(Aspect.FIRE, 60).add(Aspect.WATER, 60),
				"OXO", "X X", "OXO", 'X', new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 1), 'O', new ItemStack(TWItems.TWResource, 1, 0));
		TWStone = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSTONE_KEY, new ItemStack(TWItems.TWResource, 1, 3), new AspectList().add(Aspect.ORDER, 25).add(Aspect.ENTROPY, 25).add(Aspect.AIR, 25).add(Aspect.EARTH, 25).add(Aspect.FIRE, 25).add(Aspect.WATER, 25),
				" XX", "XOX", "XX ", 'X', new ItemStack(TWItems.TWResource, 1, 2), 'O', new ItemStack(ConfigBlocks.blockCrystal, 1, 6));
		TWSigil = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.TWSigil, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				" X ", "XOX", " X ", 'X', new ItemStack(TWItems.TWResource, 1, 2), 'O', new ItemStack(TWItems.TWResource, 1, 1));
		TWAmulet = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSTONE_KEY, new ItemStack(TWItems.TWAmulet, 1), new AspectList().add(Aspect.ORDER, 50).add(Aspect.ENTROPY, 50).add(Aspect.AIR, 50).add(Aspect.EARTH, 50).add(Aspect.FIRE, 50).add(Aspect.WATER, 50),
				"XXX", "X X", "XOX", 'X', new ItemStack(ConfigItems.itemResource, 1, 7), 'O', new ItemStack(TWItems.TWResource, 1, 3));
		
	}
	
}
