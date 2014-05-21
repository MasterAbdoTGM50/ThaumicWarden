package matgm50.twarden.item;

import matgm50.twarden.TWarden;
import matgm50.twarden.entity.EntityPurity;
import matgm50.twarden.lib.ItemLib;
import matgm50.twarden.lib.ModLib;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.wands.IWandFocus;
import thaumcraft.api.wands.ItemFocusBasic;
import thaumcraft.common.items.wands.ItemWandCasting;

/**
 * Created by MasterAbdoTGM50 on 5/20/2014.
 */

public class ItemFocusPurity extends ItemFocusBasic {

    private IIcon depth, orn;

    public ItemFocusPurity() {

        super();
        setUnlocalizedName(ItemLib.PURITY_FOCUS_NAME);
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
        EntityPurity purityOrb = new EntityPurity(world, player);

        if (!world.isRemote) {

            if (wand.consumeAllVis(itemStack, player, getVisCost(), true, false)) {

                world.spawnEntityInWorld(purityOrb);
                world.playSoundAtEntity(purityOrb, "thaumcraft:ice", 0.3F, 0.8F + world.rand.nextFloat() * 0.1F);

            }

        }

        player.swingItem();

        return itemStack;

    }

    @Override
    public String getSortingHelper(ItemStack itemStack) {return "PURITY";}

    @Override
    public AspectList getVisCost() {

        return new AspectList().add(Aspect.AIR, 5000).add(Aspect.EARTH, 5000).add(Aspect.FIRE, 5000)
            .add(Aspect.WATER, 5000).add(Aspect.ORDER, 5000).add(Aspect.ENTROPY, 5000);

    }

}
