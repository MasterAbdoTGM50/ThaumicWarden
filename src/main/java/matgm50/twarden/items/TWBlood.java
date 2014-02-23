package matgm50.twarden.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.world.World;

public class TWBlood extends ItemFood {
	

	public TWBlood(int ID, int Heal, float Saturation, boolean Wolf) {
		
		super(ID, Heal, Saturation, Wolf);
		setUnlocalizedName(TWItemConfig.TWBLOOD_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxStackSize(1);
		setAlwaysEdible();
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Sword) {
		
            return EnumRarity.epic;
            
    }
	
	@Override
	protected void onFoodEaten(ItemStack Itemstack, World World, EntityPlayer Player) {
		
		if (!World.isRemote) {
			
			NBTTagCompound IsWarden = Player.getEntityData();
			IsWarden.setBoolean("Warden", true);
			
		}
		
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		
		return EnumAction.drink;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
            itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedblood" );
            
    }

}
