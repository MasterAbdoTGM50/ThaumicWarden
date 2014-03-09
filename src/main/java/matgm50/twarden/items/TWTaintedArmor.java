package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWTaintedArmor extends ItemArmor {

	public Icon Helm;
	public Icon Chest;
	public Icon Legs;
	public Icon Boots;

	public TWTaintedArmor(int ID, EnumArmorMaterial Material, int Type) {

		super(ID, Material, 3, Type);
		setCreativeTab(TWarden.TWTab);
		setMaxDamage(500);
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Armor) {
		
            return EnumRarity.uncommon;
            
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister Register) {

		this.Helm = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedhelm");
		this.Chest = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedchest");
		this.Legs = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedlegs");
		this.Boots = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "taintedboots");

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int Damage) {
		
		return this.armorType == 2 ? this.Legs : this.armorType == 1 ? this.Chest : this.armorType == 0 ? this.Helm : this.Boots;
		
	}
	
	@Override
    @SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack Stack, Entity Entity, int Slot, int Layer)
    {
		if ((Stack.itemID == TWItems.TWTaintedLegs.itemID)) {
			
			return "twarden:textures/armors/tainted_2.png";
			
		} else {
			
			return "twarden:textures/armors/tainted_1.png";
			
		}
        
    }

}
