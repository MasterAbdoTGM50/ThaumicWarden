package matgm50.twarden.util.wardenic.upgrade;

import matgm50.twarden.util.DamageSourceWarden;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.entities.ITaintedMob;
import thaumcraft.common.config.Config;
import thaumcraft.common.entities.monster.EntityEldritchGuardian;

/**
 * Created by MasterAbdoTGM50 on 7/16/2014.
 */

public class WardenicUpgradeWarden extends WardenicUpgrade {

    public WardenicUpgradeWarden(Aspect aspect) {super(aspect);}

    @Override
    public void onAttack(ItemStack stack, EntityPlayer player, Entity entity) {

        super.onAttack(stack, player, entity);

        if(entity instanceof EntityEldritchGuardian || entity instanceof ITaintedMob) {

            DamageSource damageSource = new DamageSourceWarden("warden", player);

            entity.attackEntityFrom(damageSource, 20);

        }

    }

    @Override
    public void onTick(World world, EntityPlayer player, ItemStack stack) {

        super.onTick(world, player, stack);

        if(player.isPotionActive(Config.potionDeathGazeID)) {

            player.removePotionEffect(Config.potionDeathGazeID);

        }

    }

    @Override
    public void onAttacked(LivingHurtEvent event) {

        super.onAttacked(event);

    }
}
