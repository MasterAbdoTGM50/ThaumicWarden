package matgm50.twarden.blocks;

import matgm50.twarden.blocks.tiles.TWLizTableTile;
import matgm50.twarden.config.TWBlockConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWBlocks {
	
	public static Block twFlower;
	public static Block twLizTable;
    public static Block twQuartzBlock;
    public static Block twCQuartzBlock;
    public static Block twLQuartzBlock;
	
	public static void init() {
		
		twFlower = new TWFlower();
		twLizTable = new TWLizTable(Material.rock);
        twQuartzBlock = new TWInfuzedQuartzBlock(Material.rock);
        twCQuartzBlock = new TWInfuzedCQuartzBlock(Material.rock);
        twLQuartzBlock = new TWInfuzedLQuartzBlock(Material.rock);
		
		GameRegistry.registerBlock(twFlower, TWBlockConfig.TWFLOWER_KEY);
		GameRegistry.registerBlock(twLizTable, TWBlockConfig.TWLIZTABLE_KEY);
        GameRegistry.registerBlock(twQuartzBlock, TWBlockConfig.TWQUARTZ_KEY);
        GameRegistry.registerBlock(twCQuartzBlock, TWBlockConfig.TWCQUARTZ_KEY);
        GameRegistry.registerBlock(twLQuartzBlock, TWBlockConfig.TWLQUARTZ_KEY);
		
		GameRegistry.registerTileEntity(TWLizTableTile.class, TWBlockConfig.TWLIZTABLE_TILE_NAME);
		
	}
	
}
