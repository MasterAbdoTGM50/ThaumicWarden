package matgm50.twarden.world.schematic;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TWScheGen extends WorldGenerator {

	private short Height;
	private short Width;
	private short Length;
	
	private int Area;

	private byte[] Blocks;
	private byte[] Meta;
	
	public TWScheGen(InputStream Schematic) throws IOException {
		
		this(CompressedStreamTools.readCompressed(Schematic));

	}

	public TWScheGen(NBTTagCompound Tag) {

		this.Height = Tag.getShort("Height");
		this.Width = Tag.getShort("Width");
		this.Length = Tag.getShort("Length");

		this.Area = Width * Height * Length;

		this.Blocks = new byte[Area];
		this.Meta = new byte[Area];

		this.Blocks = Tag.getByteArray("Blocks");
		this.Meta = Tag.getByteArray("Data");
		
	}
	
	public void FillChest(World World, int X, int Y, int Z, int Slot, ItemStack Itemstack) {
		
		TileEntityChest Chest = (TileEntityChest) World.getTileEntity(X, Y, Z);
		
		Chest.setInventorySlotContents(Slot, Itemstack);
		
	}
	
	@Override
	public boolean generate(World World, Random Random, int I, int J, int K) {

		int TBP = 0;

		for (int E = 0; E < Height; E++) {

			for (int T = 0; T < Length; T++) {

				for (int A = 0; A < Width; A++) {
						
						//World.setBlock(I + A, J + E, K + T, Blocks[TBP], Meta[TBP], 2);
						
						TBP = TBP + 1;
						
				}
				
			}

		}
		
		return true;

	}

}
