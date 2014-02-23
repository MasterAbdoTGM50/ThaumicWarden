package matgm50.twarden.items;

import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.misc.TWTab;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWBow extends ItemBow {

	public TWBow(int ID) {
		
		super(ID);
		setUnlocalizedName(TWItemConfig.TWBOW_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setMaxDamage(TWItems.ToolWardenMaterial.getMaxUses());
		
	}
	
	@Override
    public EnumRarity getRarity(ItemStack Sword) {
		
            return EnumRarity.epic;
            
    }
	
	@Override
	public void onPlayerStoppedUsing(ItemStack Itemstack, World World, EntityPlayer Player, int ItemInUseCount) {
		
        int J = this.getMaxItemUseDuration(Itemstack) - ItemInUseCount;

        ArrowLooseEvent Event = new ArrowLooseEvent(Player, Itemstack, J);
        MinecraftForge.EVENT_BUS.post(Event);
        if (Event.isCanceled()) {
        	
            return;
            
        }
        
        J = Event.charge;

        boolean Flag = Player.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, Itemstack) > 0;

        if (Flag || Player.inventory.hasItem(Item.arrow.itemID)) {
        	
            float F = (float)J / 10.0F;
            F = (F * F + F * 2.0F) / 3.0F;

            if ((double)F < 0.1D) {
            	
                return;
                
            }

            if (F > 1.0F) {
            	
                F = 1.0F;
                
            }

            EntityArrow Entityarrow = new EntityArrow(World, Player, F * 3.0F);

            if (F == 1.0F) {
            	
                Entityarrow.setIsCritical(true);
                
            }

            int K = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, Itemstack);

            if (K > 0) {
            	
                Entityarrow.setDamage(Entityarrow.getDamage() + (double)K * 0.5D + 0.5D);
                
            }

            int L = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, Itemstack);

            if (L > 0) {
            	
                Entityarrow.setKnockbackStrength(L);
                
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, Itemstack) > 0) {
            	
                Entityarrow.setFire(100);
                
            }

            Itemstack.damageItem(1, Player);
            World.playSoundAtEntity(Player, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + F * 0.5F);

            if (Flag) {
            	
                Entityarrow.canBePickedUp = 2;
                
            } else {
            	
                Player.inventory.consumeInventoryItem(Item.arrow.itemID);
                
            }

            if (!World.isRemote) {
            	
                World.spawnEntityInWorld(Entityarrow);
                
            }
            
        }
        
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
		itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenbow" );
		
		TWItemConfig.TWBOWDRAWN_ICON = new Icon[TWItemConfig.TWBOWDRAWN_ICONNAME.length];
		
		for(int D = 0; D < TWItemConfig.TWBOWDRAWN_ICON.length; ++D) {
			
			TWItemConfig.TWBOWDRAWN_ICON[D] = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + TWItemConfig.TWBOWDRAWN_ICONNAME[D] );
			
		}
		            
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(ItemStack Itemstack, int RenderPass, EntityPlayer Player, ItemStack UsingItem, int UseRemaining) {
        
		if (UsingItem != null) {
			
            int time = 72000 - UseRemaining;
            if (time < 4)
                return TWItemConfig.TWBOWDRAWN_ICON[0];
            if (time < 8)
                return TWItemConfig.TWBOWDRAWN_ICON[1];
            return TWItemConfig.TWBOWDRAWN_ICON[2];
            
        }
		
        return getIcon(Itemstack, RenderPass);
        
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public Icon getItemIconForUseDuration(int D) {
		
        return TWItemConfig.TWBOWDRAWN_ICON[D];
        
    }
	
	@Override
	public boolean getIsRepairable(ItemStack Weapon, ItemStack ItemInSlot) {
		
		return ItemInSlot.isItemEqual(new ItemStack(TWItems.TWResource, 1, 0)) ? true : super.getIsRepairable(Weapon, ItemInSlot);
		
	}
	
	public int getItemEnchantability() {
		
        return TWItems.ToolWardenMaterial.getEnchantability();
        
    }
	
}
