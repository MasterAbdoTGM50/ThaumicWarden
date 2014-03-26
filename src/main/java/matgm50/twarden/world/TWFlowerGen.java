package matgm50.twarden.world;

import java.util.Random;

import matgm50.twarden.blocks.TWBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class TWFlowerGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    
		int chance = random.nextInt(2);
		
		for(int I = 0; I < chance; I++) {
			
			int X = chunkX * 16 + random.nextInt(128);
		    int Z = chunkZ * 16 + random.nextInt(128);
		    int Y = world.getHeightValue(X, Z);
		    
			if (world.isAirBlock(X, Y, Z) && TWBlocks.twFlower.canBlockStay(world, X, Y, Z) && random.nextInt(100) <= 5) {
				
				world.setBlock(X, Y, Z, TWBlocks.twFlower, 0, 2);
				
			}
			
		}
		
	}
	
}
