package matgm50.twarden.items;

import thaumcraft.common.config.Config;
import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWAmulet extends Item {

	public TWAmulet() {
		
		super();
		setUnlocalizedName(TWItemConfig.TWAMULET_UN_NAME);
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
			
			EntityPlayer player = (EntityPlayer)entity;
			
			if(player.isPotionActive(Config.potionFluxTaintID)) {
				
				player.removePotionEffect(Config.potionFluxTaintID);
				
			}
			
			if(player.isPotionActive(Potion.wither.id)) {
				
				player.removePotionEffect(Potion.wither.id);
				
			}
			
		}
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
		
            itemIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamulet" );
            
    }
	
}