package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWFeather extends Item {

	public TWFeather() {
		
		super();
		setUnlocalizedName(TWItemConfig.TWFEATHER_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setMaxStackSize(1);
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack stack) {
		
            return EnumRarity.rare;
            
    }
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par1, boolean par2) {
		
		if(entity instanceof EntityPlayer) {
			
			EntityPlayer Player = (EntityPlayer)entity;
			
			Player.fallDistance = 0F;
			
		}
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
		
            itemIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "gryphonfeather" );
            
    }
	
}