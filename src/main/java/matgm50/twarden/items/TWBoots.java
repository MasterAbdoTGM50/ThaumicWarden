package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.models.TWBootsModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import thaumcraft.api.IRepairable;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.aspects.Aspect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWBoots extends ItemArmor implements IRepairable, IVisDiscountGear {

	public TWBoots(int ID, EnumArmorMaterial Material) {
		
		super(ID, Material, 3, 3);
		setUnlocalizedName(TWItemConfig.TWBOOTS_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxDamage(1000);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
            itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenboots" );
            
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
	public void onArmorTickUpdate(World World, EntityPlayer Player, ItemStack Itemstack) {
		
		Player.fallDistance = 0;
		
	}
	
	@Override
	public boolean getIsRepairable(ItemStack Armor, ItemStack ItemInSlot) {
		
		return ItemInSlot.isItemEqual(new ItemStack(TWItems.TWResource, 1, 0)) ? true : super.getIsRepairable(Armor, ItemInSlot);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase Entity, ItemStack Itemstack, int Slot) {
		
		ModelBiped Model = new TWBootsModel(1);
		
		Model.isSneak = Entity.isSneaking();
		Model.isRiding = Entity.isRiding();
		Model.isChild = Entity.isChild();
		Model.heldItemRight = Entity.getCurrentItemOrArmor(0) != null ? 1 :0;
		if(Entity instanceof EntityPlayer) {
			
			Model.aimedBow =((EntityPlayer)Entity).getItemInUseDuration() > 2;
			
		}
		
		return Model;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack Stack, Entity Entity, int Slot, int Layer)
    {
		
        return "twarden:textures/models/twboots.png";
        
    }
	
}