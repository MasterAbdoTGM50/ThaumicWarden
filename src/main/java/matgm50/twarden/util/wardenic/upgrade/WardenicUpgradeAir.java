package matgm50.twarden.util.wardenic.upgrade;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import thaumcraft.api.aspects.Aspect;

/**
 * Created by MasterAbdoTGM50 on 8/30/2014.
 */

public class WardenicUpgradeAir extends WardenicUpgrade {

    public WardenicUpgradeAir(Aspect aspect) {super(aspect);}

    @Override
    public void onTick(World world, EntityPlayer player, ItemStack stack) {

        super.onTick(world, player, stack);

        player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 0, 5));

        if(player.fallDistance > 5) {player.fallDistance = 5;}

    }

}
