package matgm50.twarden.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWBlockConfig;
import matgm50.twarden.config.TWModConfig;
import matgm50.twarden.items.TWItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class TWFlower extends BlockFlower {

	protected TWFlower(int ID, Material Material) {
		
		super(ID, Material);
		setUnlocalizedName(TWBlockConfig.TWFLOWER_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setStepSound(Block.soundGrassFootstep);
		
	}
	
	public int idDropped(int ID, Random Random, int Par3) {
		
		return TWItems.TWResource.itemID;
		
	}
	
	public int damageDropped(int par1) {
		
		return 2;
		
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons (IconRegister Register) {
		
		blockIcon = Register.registerIcon(TWModConfig.TWMOD_ID.toLowerCase() + ":" + "wardenflower" );
		
	}
	
}
