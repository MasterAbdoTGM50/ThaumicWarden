package matgm50.twarden.blocks;

import matgm50.twarden.config.TWBlockConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWBlocks {
	
	public static Block TWFlower;
	
	public static void Init() {
		
		TWFlower = new TWFlower(TWBlockConfig.TWFLOWER_ID, Material.grass);
		
		GameRegistry.registerBlock(TWFlower, TWBlockConfig.TWFLOWER_KEY);
		
	}
	
}
