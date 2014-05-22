package matgm50.twarden.world;

import cpw.mods.fml.common.IWorldGenerator;
import matgm50.twarden.block.ModBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class GenExubitura implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        int X = chunkX * 16 + random.nextInt(128);
        int Z = chunkZ * 16 + random.nextInt(128);
        int Y = world.getHeightValue(X, Z);

        if (world.isAirBlock(X, Y, Z) && ModBlocks.blockExubitura.canBlockStay(world, X, Y, Z) && random.nextInt(100) <= 5) {

            world.setBlock(X, Y, Z, ModBlocks.blockExubitura, 0, 2);

        }


    }

}
