package matgm50.twarden.util.wardenic.upgrade;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import thaumcraft.api.aspects.Aspect;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 7/14/2014.
 */

public class WardenicUpgrade {

    public Aspect aspect;
    public Random random = new Random();

    public WardenicUpgrade(Aspect aspect) {this.aspect = aspect;}

    public void onAttack(ItemStack stack, EntityPlayer player, Entity entity) {}

    public void onTick(World world, EntityPlayer player, ItemStack stack) {}

    public void onAttacked(LivingHurtEvent event) {}

    public String getQuote() {

        return StatCollector.translateToLocal("upgrade." + aspect.getName() + ".quote");

    }

}
