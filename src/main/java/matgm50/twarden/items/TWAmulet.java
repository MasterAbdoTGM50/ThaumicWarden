package matgm50.twarden.items;

import java.util.List;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.misc.TWTab;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWAmulet extends Item {

	public TWAmulet(int ID) {
		
		super(ID);
		setUnlocalizedName(TWItemConfig.TWAMULET_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxStackSize(1);
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Sword) {
		
            return EnumRarity.rare;
            
    }
	
	@Override
	public ItemStack onItemRightClick(ItemStack Itemstack, World World, EntityPlayer Player) {
		
		if(Itemstack.getItemDamage() == 0) {
			
			Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 300, 2));
			Player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 300, 2));
			Player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 300, 2));
			Player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 300, 2));
			Player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 300, 2));
			
			Itemstack.setItemDamage(600);
			
		}
		
		
        return Itemstack;
        
    }
	
	@Override
	public void onUpdate(ItemStack Itemstack, World World, Entity Entity, int Par4, boolean Par5) {
		
		if (Itemstack.getItemDamage() > 0) {
			
			Itemstack.setItemDamage(Itemstack.getItemDamage() - 1);
			
		}
		
	}
	
    public void addInformation(ItemStack Itemstack, EntityPlayer Player, List List, boolean Par4) {
    	
    	int Cooldown = Itemstack.getItemDamage()/20;
    	
    	if(Itemstack.getItemDamage() == 0) {
    		
    		List.add(StatCollector.translateToLocal("info.amuletavailible"));
    		
    	} else if (Itemstack.getItemDamage() > 0) {
    		
    		List.add(StatCollector.translateToLocal("info.amuletcooldown") + " : " + Cooldown);
    		
    	}
    	
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
            itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamulet" );
            
    }
	
}