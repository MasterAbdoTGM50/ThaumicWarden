package matgm50.twarden.blocks;

import matgm50.twarden.config.TWBlockConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class TWBlocks {
	
	public static Block TWFlower;
	public static Block TWAnvil;
	
	public static void Init() {
		
		TWFlower = new TWFlower(TWBlockConfig.TWFLOWER_ID, Material.grass);
		TWAnvil = new TWSpawner(TWBlockConfig.TWSPAWNER_ID, Material.anvil);
		
		GameRegistry.registerBlock(TWFlower, TWBlockConfig.TWFLOWER_KEY);
		GameRegistry.registerBlock(TWAnvil, TWBlockConfig.TWSPAWNER_KEY);
		
	}
	
}
