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
			
			if(Target != null && Target.typeOfHit == MovingObjectType.BLOCK) {
				
				if(Player.worldObj.getTileEntity(Target.blockX, Target.blockY, Target.blockZ) != null
						&& Player.worldObj.getTileEntity(Target.blockX, Target.blockY, Target.blockZ) instanceof TWLizTableTile) {
					
					TWLizTableTile Table = (TWLizTableTile)Player.worldObj.getTileEntity(Target.blockX, Target.blockY, Target.blockZ);
					
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
	public void registerIcons(IIconRegister Register) {

		itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "lizhammer");

	}
	
}
