package matgm50.twarden.crafting;

import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import matgm50.twarden.items.TWItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWTransRecipes {
	
	public static void Init() {
		
		OreDictionary.registerOre("wardenamulet", new ItemStack(TWItems.TWAmulet, 1, OreDictionary.WILDCARD_VALUE));
		
		InitDye();
		InitMin();
		InitThaum();
		
	}
	
	public static void InitDye() {
		
		for(int D = 0; D < 15; D++) {
			
	        CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.dyePowder, 1, D+1), 
	        		new Object[] {"wardenamulet", new ItemStack(Item.dyePowder, 1, D)})));
	        
		}
		
        CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.dyePowder, 1, 0), 
        		new Object[] {"wardenamulet", new ItemStack(Item.dyePowder, 1, 15)})));
		
        for(int D = 0; D <= 15; D++) {
			
	        CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.silk, 4), 
	        		new Object[] {"wardenamulet", new ItemStack(Block.cloth, 1, D)})));
	        
		}
        
	}
	
	public static void InitMin() {
		
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Block.obsidian, 1), 
				new Object[] {"wardenamulet", "logWood", "logWood", "logWood", "logWood", "logWood", "logWood", "logWood", "logWood"})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Block.wood, 8), 
				new Object[] {"wardenamulet", new ItemStack(Block.obsidian)})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.enderPearl, 1), 
				new Object[] {"wardenamulet", new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron)})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.ingotIron, 4), 
				new Object[] {"wardenamulet", new ItemStack(Item.enderPearl)})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.ingotGold, 1), 
				new Object[] {"wardenamulet", new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron),
					new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron), new ItemStack(Item.ingotIron)})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.ingotIron, 8), 
				new Object[] {"wardenamulet", new ItemStack(Item.ingotGold)})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.diamond, 1), 
				new Object[] {"wardenamulet", new ItemStack(Item.ingotGold), new ItemStack(Item.ingotGold), new ItemStack(Item.ingotGold), new ItemStack(Item.ingotGold),
					new ItemStack(Item.ingotGold), new ItemStack(Item.ingotGold), new ItemStack(Item.ingotGold), new ItemStack(Item.ingotGold)})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(Item.ingotGold, 8), 
				new Object[] {"wardenamulet", new ItemStack(Item.diamond)})));
		
	}
	
	public static void InitThaum() {
		
		for(int D = 0; D < 5; D++) {
			
	        CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(ConfigItems.itemShard, 1, D+1), 
	        		new Object[] {"wardenamulet", new ItemStack(ConfigItems.itemShard, 1, D)})));
	        
		}
		
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(ConfigItems.itemShard, 1, 0), 
        		new Object[] {"wardenamulet", new ItemStack(ConfigItems.itemShard, 1, 5)})));
		
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1), 
        		new Object[] {"wardenamulet", new ItemStack(ConfigBlocks.blockCustomPlant, 1, 0), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 0), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 0), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 0), 
					new ItemStack(ConfigBlocks.blockCustomPlant, 1, 0), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 0), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 0), new ItemStack(ConfigBlocks.blockCustomPlant, 1, 0)})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(ConfigBlocks.blockCustomPlant, 8, 0), 
        		new Object[] {"wardenamulet", new ItemStack(ConfigBlocks.blockCustomPlant, 1, 1)})));
		
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(ConfigItems.itemResource, 1, 2), 
        		new Object[] {"wardenamulet", new ItemStack(ConfigBlocks.blockMagicalLog, 1, 0), new ItemStack(ConfigBlocks.blockMagicalLog, 1, 0), new ItemStack(ConfigBlocks.blockMagicalLog, 1, 0), new ItemStack(ConfigBlocks.blockMagicalLog, 1, 0)})));
		CraftingManager.getInstance().getRecipeList().add((new ShapelessOreRecipe(new ItemStack(ConfigBlocks.blockMagicalLog, 4, 0), 
        		new Object[] {"wardenamulet", new ItemStack(ConfigItems.itemResource, 1, 2)})));
		
	}
	
}
