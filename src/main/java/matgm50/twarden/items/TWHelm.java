package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import thaumcraft.api.IGoggles;
import thaumcraft.api.IRepairable;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.nodes.IRevealer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWHelm extends ItemArmor implements IRepairable, IVisDiscountGear, IGoggles, IRevealer {

	public TWHelm(ArmorMaterial material) {
		
		super(material, 3, 0);
		setUnlocalizedName(TWItemConfig.TWHELM_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setMaxDamage(1000);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
		
            itemIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenhelm" );
            
    }

	@Override
	public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect) {
			
			return 5;
		
	}

	@Override
	public boolean showNodes(ItemStack stack, EntityLivingBase player) {
		
		return true;
		
	}

	@Override
	public boolean showIngamePopups(ItemStack stack, EntityLivingBase player) {
		
		return true;
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack stack) {
		
            return EnumRarity.epic;
            
    }
	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack itemInSlot) {
		
		return itemInSlot.isItemEqual(new ItemStack(TWItems.twResource, 1, 1)) ? true : super.getIsRepairable(armor, itemInSlot);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, int slot) {
		
		ModelBiped model = new ModelBiped(0.5F);
		
		model.isSneak = player.isSneaking();
		model.isRiding = player.isRiding();
		model.isChild = player.isChild();
		
		return model;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		return "twarden:textures/armors/wardenhelm.png";
		
	}
	
	
}