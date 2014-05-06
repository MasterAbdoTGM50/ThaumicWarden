package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.util.TWSwordDamage;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import thaumcraft.api.IRepairable;
import thaumcraft.common.entities.ITaintedMob;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWSword extends Item implements IRepairable {

	public TWSword() {

		super();
		setUnlocalizedName(TWItemConfig.TWSWORD_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setMaxDamage(TWItems.wardenToolMaterial.getMaxUses());
		setMaxStackSize(1);
		
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {

		return EnumRarity.epic;

	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity target) {
		
		DamageSource SwordDamage = new TWSwordDamage("sword", player);
		
		if (target instanceof ITaintedMob) {

			target.attackEntityFrom(SwordDamage, 20);

		} else {
			
			target.attackEntityFrom(SwordDamage, 10);
			
		}
		
		stack.damageItem(1, player);
		
		return super.onLeftClickEntity(stack, player, target);
		
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		
		return EnumAction.block;
		
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		
		return 72000;
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		
		player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
		return stack;
		
    }

	@Override
	public boolean getIsRepairable(ItemStack weapon, ItemStack itemInSlot) {

		return itemInSlot.isItemEqual(new ItemStack(TWItems.twResource, 1, 0)) ? true : super.getIsRepairable(weapon, itemInSlot);

	}
	
	@Override
	public boolean isFull3D() {
		
		return true;
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {

		itemIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardensword");

	}

}