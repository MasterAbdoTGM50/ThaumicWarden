package matgm50.twarden.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import matgm50.twarden.TWarden;
import matgm50.twarden.config.TWBlockConfig;
import matgm50.twarden.config.TWModConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class TWSpawner extends Block {

	public static Icon AnvilIcon;

	public TWSpawner(int ID, Material Material) {

		super(ID, Material);
		setUnlocalizedName(TWBlockConfig.TWSPAWNER_UN_NAME);
		setCreativeTab(TWarden.TWTab);
		setStepSound(Block.soundAnvilFootstep);

	}

}
