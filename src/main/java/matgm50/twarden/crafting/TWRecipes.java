package matgm50.twarden.crafting;

import matgm50.twarden.aspects.TWAspects;
import matgm50.twarden.blocks.TWBlocks;
import matgm50.twarden.config.TWResearchConfig;
import matgm50.twarden.items.TWItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

public class TWRecipes {
	
	public static CrucibleRecipe twQuartz;
	public static CrucibleRecipe twFabric;
	public static ShapedArcaneRecipe twHelm;
	public static ShapedArcaneRecipe twChest;
	public static ShapedArcaneRecipe twLegs;
	public static ShapedArcaneRecipe twBoots;
	public static ShapedArcaneRecipe twCross;
	public static ShapedArcaneRecipe twStone;
	public static ShapedArcaneRecipe twFrame;
	public static InfusionRecipe twSigil;
	public static InfusionRecipe twFlower;
	public static InfusionRecipe twLizHammer;
	public static InfusionRecipe twLizTable;
	
	public static void init() {
		
		initCrucible();
		initArcane();
		initInfusion();
		
	}
	
	public static void initCrucible() {
		
		twQuartz = ThaumcraftApi.addCrucibleRecipe(TWResearchConfig.TWQUARTZ_KEY, new ItemStack(TWItems.twResource, 1, 0), new ItemStack(Blocks.quartz_block), new AspectList().add(Aspect.ELDRITCH, 8).add(Aspect.MAGIC, 8).add(Aspect.CRYSTAL, 16));
		twFabric = ThaumcraftApi.addCrucibleRecipe(TWResearchConfig.TWFABRIC_KEY, new ItemStack(TWItems.twResource, 1, 1), new ItemStack(ConfigItems.itemResource, 1, 7), new AspectList().add(Aspect.ELDRITCH, 4).add(Aspect.MAGIC, 4).add(Aspect.CLOTH, 8).add(Aspect.METAL, 8));
		
	}
	
	public static void initArcane() {
		
		twHelm = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.twHelm, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"XXX", "XOX", "   ", 'X', new ItemStack(TWItems.twResource, 1, 1), 'O', new ItemStack(TWItems.twSigil, 1));
		twChest = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.twChest, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"X X", "XOX", "XXX", 'X', new ItemStack(TWItems.twResource, 1, 1), 'O', new ItemStack(TWItems.twSigil, 1));
		twLegs = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.twLegs, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"XXX", "XOX", "X X", 'X', new ItemStack(TWItems.twResource, 1, 1), 'O', new ItemStack(TWItems.twSigil, 1));
		twBoots = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.twBoots, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				"   ", "XOX", "X X", 'X', new ItemStack(TWItems.twResource, 1, 1), 'O', new ItemStack(TWItems.twSigil, 1));
		twCross = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWARMOR_KEY, new ItemStack(TWItems.twCross, 1), new AspectList().add(Aspect.ORDER, 125).add(Aspect.ENTROPY, 125).add(Aspect.AIR, 125).add(Aspect.EARTH, 125).add(Aspect.FIRE, 125).add(Aspect.WATER, 125),
				" X ", "XOX", " X ", 'X', new ItemStack(TWItems.twResource, 1, 0), 'O', new ItemStack(TWItems.twSigil, 1));
		twFrame = ThaumcraftApi.addArcaneCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.twResource, 1, 2), new AspectList().add(Aspect.ORDER, 60).add(Aspect.ENTROPY, 60).add(Aspect.AIR, 60).add(Aspect.EARTH, 60).add(Aspect.FIRE, 60).add(Aspect.WATER, 60),
				" X ", "XOX", " X ", 'X', new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 1), 'O', new ItemStack(TWItems.twResource, 1, 0));
		
	}
	
	public static void initInfusion() {
		
		twSigil = ThaumcraftApi.addInfusionCraftingRecipe(TWResearchConfig.TWSIGIL_KEY, new ItemStack(TWItems.twSigil, 1), 25, new AspectList().add(TWAspects.WARDEN, 32).add(Aspect.MAGIC, 32), new ItemStack(TWItems.twResource, 1, 2),
				new ItemStack [] {new ItemStack(TWItems.twResource, 1, 3), new ItemStack(TWItems.twResource, 1, 3), new ItemStack(TWItems.twResource, 1, 3), new ItemStack(TWItems.twResource, 1, 3)});
		twLizHammer = ThaumcraftApi.addInfusionCraftingRecipe(TWResearchConfig.TWLIZBETH_KEY, new ItemStack(TWItems.twLizHammer, 1), 25, new AspectList().add(TWAspects.WARDEN, 64).add(Aspect.MAGIC, 64).add(Aspect.EXCHANGE, 64).add(Aspect.TOOL, 64), new ItemStack(TWItems.twResource, 1, 0),
				new ItemStack [] {new ItemStack(TWItems.twResource, 1, 3), new ItemStack(TWItems.twResource, 1, 3), new ItemStack(Blocks.anvil)});
		twLizTable = ThaumcraftApi.addInfusionCraftingRecipe(TWResearchConfig.TWLIZBETH_KEY, new ItemStack(TWBlocks.twLizTable, 1), 25, new AspectList().add(TWAspects.WARDEN, 64).add(Aspect.MAGIC, 64).add(Aspect.EXCHANGE, 64).add(Aspect.TOOL, 64), new ItemStack(Blocks.enchanting_table, 1, 0),
				new ItemStack [] {new ItemStack(TWItems.twResource, 1, 3), new ItemStack(TWItems.twResource, 1, 3), new ItemStack(Blocks.anvil), new ItemStack(Blocks.anvil), new ItemStack(Blocks.anvil), new ItemStack(Blocks.anvil), new ItemStack(Blocks.anvil), new ItemStack(Blocks.anvil)});
		
	}
	
}
