package matgm50.twarden.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.block.ModBlocks;
import matgm50.twarden.item.ModItems;
import matgm50.twarden.lib.ResearchLib;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigItems;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModRecipes {

    public static CrucibleRecipe recipeQuartz;
    public static CrucibleRecipe recipeCrystal;
    public static ShapedArcaneRecipe recipeWardenAmulet;

    public static void init() {

        initMundane();
        initThaumic();

    }

    public static void initMundane() {

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzNormal), "XX", "XX", 'X', new ItemStack(ModItems.itemResource, 1, 2));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzChiseled), "X", "X", 'X', new ItemStack(ModBlocks.blockInfusedQuartzSlab));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzPillar, 2), "X", "X", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzSlab, 6), "XXX", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzStair, 4), "X  ", "XX ", "XXX", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));

    }

    public static void initThaumic() {

        recipeQuartz = ThaumcraftApi.addCrucibleRecipe(ResearchLib.QUARTZ_KEY, new ItemStack(ModItems.itemResource, 1, 2), new ItemStack(Items.quartz), new AspectList().add(Aspect.MAGIC, 4).add(Aspect.ELDRITCH, 4));
        recipeCrystal = ThaumcraftApi.addCrucibleRecipe(ResearchLib.CRYSTAL_KEY, new ItemStack(ModItems.itemResource, 1, 1), new ItemStack(ModItems.itemResource, 1, 0), new AspectList().add(Aspect.MAGIC, 32).add(Aspect.CRYSTAL, 32));

        recipeWardenAmulet = ThaumcraftApi.addArcaneCraftingRecipe(ResearchLib.WARDEN_AMULET_KEY, new ItemStack(ModItems.itemWardenAmulet), new AspectList().add(Aspect.AIR, 50).add(Aspect.EARTH, 50).add(Aspect.FIRE, 50)
                .add(Aspect.WATER, 50).add(Aspect.ORDER, 50).add(Aspect.ENTROPY, 50), "XXX", "X X", "XOX", 'O', new ItemStack(ModItems.itemResource, 1, 1), 'X', new ItemStack(ConfigItems.itemResource , 1, 7));

    }

}
