package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.blocks.tiles.TWLizTableTile;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWLizHammer extends Item {

	public TWLizHammer() {

		super();
		setUnlocalizedName(TWItemConfig.TWLIZHAMMER_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setMaxStackSize(1);
		canRepair = true;
		
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {

		return EnumRarity.rare;
		
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase player, ItemStack stack) {
		
		if(!player.worldObj.isRemote) {
			
			MovingObjectPosition target = getMovingObjectPositionFromPlayer(player.worldObj, (EntityPlayer) player, true);
			
			if(target != null && target.typeOfHit == MovingObjectType.BLOCK) {
				
				if(player.worldObj.getTileEntity(target.blockX, target.blockY, target.blockZ) != null
						&& player.worldObj.getTileEntity(target.blockX, target.blockY, target.blockZ) instanceof TWLizTableTile) {
					
					TWLizTableTile table = (TWLizTableTile)player.worldObj.getTileEntity(target.blockX, target.blockY, target.blockZ);
					
					table.Repair(0);
					
				}
				
			}
			
		}
		
		return super.onEntitySwing(player, stack);
		
	}
	
	@Override
	public boolean isItemTool(ItemStack stack) {
		
		return true;
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {

		itemIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "lizhammer");

	}
	
}
