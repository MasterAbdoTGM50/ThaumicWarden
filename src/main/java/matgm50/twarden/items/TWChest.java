package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.models.TWChestModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import thaumcraft.api.IRepairable;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.aspects.Aspect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWChest extends ItemArmor implements IRepairable, IVisDiscountGear {
	
	public TWChest(ArmorMaterial material) {
		
		super(material, 3, 1);
		setUnlocalizedName(TWItemConfig.TWCHEST_UN_NAME);
		setCreativeTab(TWarden.twTab);
		setMaxDamage(1000);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
		
            itemIcon = register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenchest" );
            
    }

	@Override
	public int getVisDiscount(ItemStack stack, EntityPlayer player, Aspect aspect) {
		
		return 5;
		
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
		
		ModelBiped model = new TWChestModel(0.5F);
		
		model.isSneak = player.isSneaking();
		model.isRiding = player.isRiding();
		model.isChild = player.isChild();
		
		if(player instanceof EntityPlayer) {
			
			EntityPlayer PlayerR = (EntityPlayer) player;
			
			ItemStack ItemInUse = PlayerR.getHeldItem();
			
			model.heldItemRight = ItemInUse != null ? 1 : 0;
			
			if (ItemInUse != null && PlayerR.getItemInUseCount() > 0) {
				
				EnumAction Action = ItemInUse.getItemUseAction();
				
				if (Action == EnumAction.block) {
					
					model.heldItemRight = 3;
					
				} else if (Action == EnumAction.bow) {
					
					model.aimedBow = true;
					
				}
				
			}
			
		}
		
		return model;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack Stack, Entity Entity, int Slot, String Type) {
		
		return "twarden:textures/armors/wardenchest.png";
		
	}
	
		
}