package matgm50.twarden.blocks;

import matgm50.twarden.config.TWBlockConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWBlocks {
	
	public static Block TWFlower;
	public static Block TWLizTable;
	
	public static void Init() {
		
		TWFlower = new TWFlower(TWBlockConfig.TWFLOWER_ID, Material.grass);
		TWLizTable = new TWLizTable(TWBlockConfig.TWLIZTABLE_ID, Material.rock);
		
		GameRegistry.registerBlock(TWFlower, TWBlockConfig.TWFLOWER_KEY);
		GameRegistry.registerBlock(TWLizTable, TWBlockConfig.TWLIZTABLE_KEY);
		
	}
	
}
