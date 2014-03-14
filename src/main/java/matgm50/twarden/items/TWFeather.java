package matgm50.twarden.items;

import thaumcraft.common.config.Config;
import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWFeather extends Item {

	public TWFeather(int ID) {
		
		super(ID);
		setUnlocalizedName(TWItemConfig.TWFEATHER_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxStackSize(1);
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Itemstack) {
		
            return EnumRarity.rare;
            
    }
	
	@Override
	public void onUpdate(ItemStack Itemstack, World World, Entity Entity, int Par1, boolean Par2) {
		
		if(Entity instanceof EntityPlayer) {
			
			EntityPlayer Player = (EntityPlayer)Entity;
			
			Player.fallDistance = 0F;
			
		}
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
            itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "gryphonfeather" );
            
    }
	
}