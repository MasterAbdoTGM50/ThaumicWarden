package matgm50.twarden.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.blocks.tiles.TWLizTableTile;
import matgm50.twarden.config.TWBlockConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class TWLizTable extends BlockContainer {
	
	public IIcon TopIcon;
	public IIcon BotIcon;
	public IIcon SideIcon;
	
	public TWLizTable(Material Material) {

		super(Material);
		setBlockName(TWBlockConfig.TWLIZTABLE_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setHardness(4.0F);
		setStepSound(Block.soundTypeStone);
		setBlockBounds(0F, 0F, 0F, 1F, 0.75F, 1F);
		
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister Register) {
		
		TopIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "liztabletop" );
		BotIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "liztablebot" );
		SideIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "liztableside" );
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int Side, int Meta) {
		
		if(Side == 0) {
			
			return BotIcon;
			
		} else if(Side == 1) {
			
			return TopIcon;
			
		} else {
			
			return SideIcon;
			
		}
		
	}
	
	@Override
    public boolean onBlockActivated(World World, int X, int Y, int Z, EntityPlayer Player, int Side, float HitX, float HitY, float HitZ) {
		
		if(!World.isRemote) {
			
			TWLizTableTile Table = (TWLizTableTile)World.getTileEntity(X, Y, Z);
			ItemStack Held = Player.getCurrentEquippedItem();
			
			if(Table != null) {
				
				if(Table.getStackInSlot(0) == null && Held != null) {
					
					if(Table.isItemValidForSlot(0, Held)) {
						
						Table.setInventorySlotContents(0, Held);
						Player.destroyCurrentEquippedItem();
						
					}
					
				} else if(Table.getStackInSlot(0) != null) {
						
					EntityItem Spawned = new EntityItem(Player.worldObj, Player.posX + 0.5D, Player.posY + 0.5D, Player.posZ + 0.5D, Table.getStackInSlot(0));
					World.spawnEntityInWorld(Spawned);
					Table.setInventorySlotContents(0, null);
					
				}
				
				World.markBlockForUpdate(X, Y, Z);
				
			}
			
		}
		
		return true;
		
	}
	
	@Override
	public void breakBlock(World World, int X, int Y, int Z, Block Block, int Meta) {
		
		TWLizTableTile Table = (TWLizTableTile)World.getTileEntity(X, Y, Z);
		if(Table != null) {
			
			for(int I = 0; I < Table.getSizeInventory(); I++) {
				
				ItemStack Drop = Table.getStackInSlotOnClosing(I);
				
				if(Drop != null) {
					
					float X2 = X + World.rand.nextFloat();
					float Y2 = Y + World.rand.nextFloat();
					float Z2 = Z + World.rand.nextFloat();
					
					EntityItem Dropped = new EntityItem(World, X2, Y2, Z2, Drop);
					
					Dropped.motionX = (-0.5F + World.rand.nextFloat()) * 0.05;
					Dropped.motionY = (2.0F + World.rand.nextFloat()) * 0.05;
					Dropped.motionZ = (-0.5F + World.rand.nextFloat()) * 0.05;
					
					World.spawnEntityInWorld(Dropped);
					
				}
				
			}
			
		}
		
		super.breakBlock(World, X, Y, Z, Block, Meta);
		
	}
	
	
	@Override
	public boolean renderAsNormalBlock() {return false;}

	@Override
	public boolean isOpaqueCube() {return false;}

	@Override
	public TileEntity createNewTileEntity(World World, int Par2) {
		
		return new TWLizTableTile();
		
	}
	
}
