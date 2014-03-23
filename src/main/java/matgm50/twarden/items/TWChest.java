package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
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
	
	public TWChest(ArmorMaterial Material) {
		
		super(Material, 3, 1);
		setUnlocalizedName(TWItemConfig.TWCHEST_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxDamage(1000);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister Register) {
		
            itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenchest" );
            
    }

	@Override
	public int getVisDiscount(ItemStack Itemstack, EntityPlayer Player, Aspect Aspect) {
		
		return 5;
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Armor) {
		
            return EnumRarity.epic;
            
    }
	
	@Override
	public boolean getIsRepairable(ItemStack Armor, ItemStack ItemInSlot) {
		
		return ItemInSlot.isItemEqual(new ItemStack(TWItems.TWResource, 1, 1)) ? true : super.getIsRepairable(Armor, ItemInSlot);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase Player, ItemStack Itemstack, int Slot) {
		
		ModelBiped Model = new ModelBiped(0.5F);
		
		Model.isSneak = Player.isSneaking();
		Model.isRiding = Player.isRiding();
		Model.isChild = Player.isChild();
		
		if(Player instanceof EntityPlayer) {
			
			EntityPlayer PlayerR = (EntityPlayer) Player;
			
			ItemStack ItemInUse = PlayerR.getHeldItem();
			
			Model.heldItemRight = ItemInUse != null ? 1 : 0;
			
			if (ItemInUse != null && PlayerR.getItemInUseCount() > 0) {
				
				EnumAction Action = ItemInUse.getItemUseAction();
				
				if (Action == EnumAction.block) {
					
					Model.heldItemRight = 3;
					
				} else if (Action == EnumAction.bow) {
					
					Model.aimedBow = true;
					
				}
				
			}
			
		}
		
		return Model;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack Stack, Entity Entity, int Slot, String Type) {
		
		return "twarden:textures/armors/wardenchest.png";
		
	}
	
		
}