package matgm50.twarden.item;

import matgm50.twarden.TWarden;
import matgm50.twarden.block.ModBlocks;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.wands.ItemFocusBasic;
import thaumcraft.common.items.wands.ItemWandCasting;

/**
 * Created by MasterAbdoTGM50 on 5/20/2014.
 */

public class ItemFocusIllumination extends ItemFocusBasic {

    private IIcon depth, orn;

    public ItemFocusIllumination() {

        super();
        setUnlocalizedName(ItemLib.ILLUMI_FOCUS_NAME);
        setCreativeTab(TWarden.tabTWarden);

    }

    @Override
    public void registerIcons(IIconRegister register) {

        icon = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "purityfocus");
        depth = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "puritydepth");
        orn = register.registerIcon(ModLib.ID.toLowerCase() + ":" + "purityorn");

    }

    @Override
    public IIcon getFocusDepthLayerIcon() {return depth;}

    @Override
    public IIcon getOrnament() {return orn;}

    @Override
    public int getFocusColor() {return 0x6698FF;}



    public ItemStack onFocusRightClick(ItemStack itemStack, World world, EntityPlayer player, MovingObjectPosition mop) {

        ItemWandCasting wand = (ItemWandCasting)itemStack.getItem();

        if(mop.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {

            if (!world.isRemote) {

                if (wand.consumeAllVis(itemStack, player, getVisCost(), true, false)) {

                    int x = mop.blockX;
                    int y = mop.blockY;
                    int z = mop.blockZ;

                    if (mop.sideHit == 0) {y--;}
                    if (mop.sideHit == 1) {y++;}
                    if (mop.sideHit == 2) {z--;}
                    if (mop.sideHit == 3) {z++;}
                    if (mop.sideHit == 4) {x--;}
                    if (mop.sideHit == 5) {x++;}

                    world.setBlock(x, y, z, ModBlocks.blockWitor, 0, 2);
                    //world.playSoundAtEntity(purityOrb, "thaumcraft:ice", 0.3F, 0.8F + world.rand.nextFloat() * 0.1F);

                }

            }

        }

        player.swingItem();

        return itemStack;

    }

    @Override
    public String getSortingHelper(ItemStack itemStack) {return "ILLUMINATION";}

    @Override
    public AspectList getVisCost() {

        return new AspectList().add(Aspect.AIR, 50).add(Aspect.FIRE, 50);

    }

}
