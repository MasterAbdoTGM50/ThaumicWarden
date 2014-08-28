package matgm50.twarden.util.upgrade;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import thaumcraft.api.aspects.Aspect;

/**
 * Created by MasterAbdoTGM50 on 8/28/2014.
 */

public class WardenicUpgradeArmor extends WardenicUpgrade{

    public WardenicUpgradeArmor(Aspect aspect) {super(aspect);}

    @Override
    public void onAttack(ItemStack stack, EntityPlayer player, Entity entity) {

        super.onAttack(stack, player, entity);

    }

    @Override
    public void onTick(World world, EntityPlayer player, ItemStack stack) {

        super.onTick(world, player, stack);

    }

    @Override
    public void onAttacked(LivingHurtEvent event) {

        super.onAttacked(event);

    }
}
