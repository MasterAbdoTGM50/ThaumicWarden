package matgm50.twarden.items;

import thaumcraft.api.IGoggles;
import thaumcraft.api.IRepairable;
import thaumcraft.api.IVisDiscountGear;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.nodes.IRevealer;
import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.misc.TWTab;
import matgm50.twarden.models.TWLegsModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWLegs extends ItemArmor implements IRepairable, IVisDiscountGear {

	public TWLegs(int ID, EnumArmorMaterial Material) {
		
		super(ID, Material, 3, 2);
		setUnlocalizedName(TWItemConfig.TWLEGS_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxDamage(1000);
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
            itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenlegs" );
            
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
		
		return ItemInSlot.isItemEqual(new ItemStack(TWItems.TWResource, 1, 0)) ? true : super.getIsRepairable(Armor, ItemInSlot);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase Entity, ItemStack Itemstack, int Slot) {
		
		ModelBiped Model = new TWLegsModel(1);
		
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
		
        return "twarden:textures/models/twlegs.png";
        
    }
	
}