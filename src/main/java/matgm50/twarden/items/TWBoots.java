package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.models.TWBootsModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import thaumcraft.api.IRepairable;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.aspects.Aspect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWBoots extends ItemArmor implements IRepairable, IVisDiscountGear {

	public TWBoots(ArmorMaterial Material) {
		
		super(Material, 3, 3);
		setUnlocalizedName(TWItemConfig.TWBOOTS_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setMaxDamage(1000);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister Register) {
		
            itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenboots" );
            
    }

	@Override
	public int getVisDiscount(ItemStack stack, EntityPlayer Player, Aspect Aspect) {
		
		return 5;
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Armor) {
		
            return EnumRarity.epic;
            
    }
	
	@Override
	public boolean getIsRepairable(ItemStack Armor, ItemStack ItemInSlot) {
		
		return ItemInSlot.isItemEqual(new ItemStack(TWItems.twResource, 1, 1)) ? true : super.getIsRepairable(Armor, ItemInSlot);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase Player, ItemStack stack, int slot) {
		
		ModelBiped model = new TWBootsModel(0.5F);
		
		model.isSneak = Player.isSneaking();
		model.isRiding = Player.isRiding();
		model.isChild = Player.isChild();
		
		return model;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		return "twarden:textures/armors/wardenboots.png";
		
	}
	
}