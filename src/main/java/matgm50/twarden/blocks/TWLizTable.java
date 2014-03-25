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
	
	public IIcon topIcon;
	public IIcon botIcon;
	public IIcon sideIcon;
	
	public TWLizTable(Material material) {

		super(material);
		setBlockName(TWBlockConfig.TWLIZTABLE_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setHardness(4.0F);
		setStepSound(Block.soundTypeStone);
		setBlockBounds(0F, 0F, 0F, 1F, 0.75F, 1F);
		
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
		
		topIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "liztabletop" );
		botIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "liztablebot" );
		sideIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "liztableside" );
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		
		if(side == 0) {
			
			return botIcon;
			
		} else if(side == 1) {
			
			return topIcon;
			
		} else {
			
			return sideIcon;
			
		}
		
	}
	
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		TWLizTableTile table = (TWLizTableTile)world.getTileEntity(x, y, z);
		ItemStack held = player.getCurrentEquippedItem();
		
		if(!world.isRemote) {
			
			if(table != null) {
				
				if(table.getStackInSlot(0) == null && held != null) {
					
					if(table.isItemValidForSlot(0, held)) {
						
						table.setInventorySlotContents(0, held);
						player.destroyCurrentEquippedItem();
						player.inventory.markDirty();
						
					}
					
				} else if(table.getStackInSlot(0) != null) {
						
					EntityItem spawned = new EntityItem(player.worldObj, player.posX + 0.5D, player.posY + 0.5D, player.posZ + 0.5D, table.getStackInSlot(0));
					world.spawnEntityInWorld(spawned);
					table.setInventorySlotContents(0, null);
					table.markDirty();
					
				}
				
			}
			
		}
		
		return true;
		
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
		
		TWLizTableTile table = (TWLizTableTile)world.getTileEntity(x, y, z);
		if(table != null) {
			
			for(int I = 0; I < table.getSizeInventory(); I++) {
				
				ItemStack drop = table.getStackInSlotOnClosing(I);
				
				if(drop != null) {
					
					float x2 = x + world.rand.nextFloat();
					float y2 = y + world.rand.nextFloat();
					float z2 = z + world.rand.nextFloat();
					
					EntityItem dropped = new EntityItem(world, x2, y2, z2, drop);
					
					dropped.motionX = (-0.5F + world.rand.nextFloat()) * 0.05;
					dropped.motionY = (2.0F + world.rand.nextFloat()) * 0.05;
					dropped.motionZ = (-0.5F + world.rand.nextFloat()) * 0.05;
					
					world.spawnEntityInWorld(dropped);
					
				}
				
			}
			
		}
		
		super.breakBlock(world, x, y, z, block, meta);
		
	}
	
	
	@Override
	public boolean renderAsNormalBlock() {return false;}

	@Override
	public boolean isOpaqueCube() {return false;}

	@Override
	public TileEntity createNewTileEntity(World world, int par2) {
		
		return new TWLizTableTile();
		
	}
	
}
