package matgm50.twarden.items;

import thaumcraft.common.tiles.TileArcaneWorkbench;
import matgm50.twarden.TWarden;
import matgm50.twarden.blocks.tiles.TWLizTableTile;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWLizHammer extends Item {

	public TWLizHammer(int ID) {

		super(ID);
		setUnlocalizedName(TWItemConfig.TWLIZHAMMER_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		canRepair = true;
		
	}

	@Override
	public EnumRarity getRarity(ItemStack Sword) {

		return EnumRarity.rare;
		
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase Player, ItemStack Itemstack) {
		
		if(!Player.worldObj.isRemote) {
			
			MovingObjectPosition Target = getMovingObjectPositionFromPlayer(Player.worldObj, (EntityPlayer) Player, true);
			
			if(Target != null && Target.typeOfHit == EnumMovingObjectType.TILE) {
				
				if(Player.worldObj.getBlockTileEntity(Target.blockX, Target.blockY, Target.blockZ) != null
						&& Player.worldObj.getBlockTileEntity(Target.blockX, Target.blockY, Target.blockZ) instanceof TWLizTableTile) {
					
					TWLizTableTile Table = (TWLizTableTile)Player.worldObj.getBlockTileEntity(Target.blockX, Target.blockY, Target.blockZ);
					
					Table.Repair(0);
					
				}
				
			}
			
		}
		
		return super.onEntitySwing(Player, Itemstack);
		
	}
	
	@Override
	public boolean isItemTool(ItemStack Itemstack) {
		
		return true;
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister Register) {

		itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "lizhammer");

	}
	
}
