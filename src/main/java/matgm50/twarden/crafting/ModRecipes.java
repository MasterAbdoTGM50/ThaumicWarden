package matgm50.twarden.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import matgm50.twarden.block.ModBlocks;
import matgm50.twarden.item.ModItems;
import net.minecraft.item.ItemStack;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModRecipes {

    public static void init() {

        initMundane();

    }

    public static void initMundane() {

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzNormal), "XX", "XX", 'X', new ItemStack(ModItems.itemResource, 1, 2));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzChiseled), "X", "X", 'X', new ItemStack(ModBlocks.blockInfusedQuartzSlab));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzPillar, 2), "X", "X", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzSlab, 6), "XXX", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockInfusedQuartzStair, 4), "X  ", "XX ", "XXX", 'X', new ItemStack(ModBlocks.blockInfusedQuartzNormal));

    }

    public static void initThaumic() {



    }

}
