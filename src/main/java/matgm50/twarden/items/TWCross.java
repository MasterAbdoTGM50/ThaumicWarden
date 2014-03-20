package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.util.TWCrossDamage;
import net.minecraft.client.renderer.texture.IconRegister;
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

public class TWCross extends Item implements IRepairable {

	public TWCross(int ID) {

		super(ID);
		setUnlocalizedName(TWItemConfig.TWCROSS_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxDamage(TWItems.ToolWardenMaterial.getMaxUses());
		setMaxStackSize(1);
		
	}

	@Override
	public EnumRarity getRarity(ItemStack Itemstack) {

		return EnumRarity.epic;

	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack Itemstack, EntityPlayer Player, Entity Target) {
		
		DamageSource CrossDamage = new TWCrossDamage("Cross", Player);
		
		if (Target instanceof ITaintedMob) {
			
			Target.attackEntityFrom(CrossDamage, 10);
			
		} else {
			
			Target.attackEntityFrom(CrossDamage, 5);
			
		}
		
		Itemstack.damageItem(1, Player);
		
		return super.onLeftClickEntity(Itemstack, Player, Target);
		
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack Itemstack) {
		
		return EnumAction.block;
		
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack Itemstack) {
		
		return 72000;
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack Itemstack, World World, EntityPlayer Player) {
		
		Player.setItemInUse(Itemstack, this.getMaxItemUseDuration(Itemstack));
		return Itemstack;
		
    }

	@Override
	public boolean getIsRepairable(ItemStack Weapon, ItemStack ItemInSlot) {

		return ItemInSlot.isItemEqual(new ItemStack(TWItems.TWResource, 1, 0)) ? true : super.getIsRepairable(Weapon, ItemInSlot);

	}
	
	@Override
	public boolean isFull3D() {
		
		return true;
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister Register) {

		itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardencross");

	}

}