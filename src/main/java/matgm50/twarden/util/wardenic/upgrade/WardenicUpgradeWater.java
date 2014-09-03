package matgm50.twarden.util.wardenic.upgrade;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import thaumcraft.api.aspects.Aspect;

/**
 * Created by MasterAbdoTGM50 on 8/29/2014.
 */

public class WardenicUpgradeWater extends WardenicUpgrade {

    public WardenicUpgradeWater(Aspect aspect) {super(aspect);}

    @Override
    public void onTick(World world, EntityPlayer player, ItemStack stack) {

        super.onTick(world, player, stack);

        if(player.isInWater()) {

            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 0, 5));

        }

    }

}
