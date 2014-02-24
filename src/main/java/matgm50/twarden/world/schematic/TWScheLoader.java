package matgm50.twarden.world.schematic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TWScheLoader extends WorldGenerator {

	private short Height = 0;
	private short Width = 0;
	private short Length = 0;

	private byte[] Blocks;
	private byte[] Meta;
	
	public TWScheLoader(InputStream Schematic) throws IOException {

		this(CompressedStreamTools.readCompressed(Schematic));

	}

	public TWScheLoader(NBTTagCompound Tag) {

		this.Height = Tag.getShort("Height");
		this.Width = Tag.getShort("Width");
		this.Length = Tag.getShort("Length");

		int Area = Width * Height * Length;

		this.Blocks = new byte[Area];
		this.Meta = new byte[Area];

		this.Blocks = Tag.getByteArray("Blocks");
		this.Meta = Tag.getByteArray("Data");

	}
	
	@Override
	public boolean generate(World World, Random Random, int I, int J, int K) {

		int TBP = 0;
		int TBD = 0;

		for (int E = 0; E < Height; E++) {

			for (int T = 0; T < Length; T++) {

				for (int A = 0; A < Width; A++) {
						
						World.setBlock(I + A, J + E, K + T, Blocks[TBP], Meta[TBP], 2);
						
						TBP = TBP + 1;
					
				}
				
			}

		}

		return true;

	}

}
