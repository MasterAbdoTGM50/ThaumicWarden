package matgm50.twarden.items;

import java.util.List;

import thaumcraft.common.config.Config;
import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWItemConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.util.TWTab;
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
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister Register) {
		
            itemIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenamulet" );
            
    }
	
}