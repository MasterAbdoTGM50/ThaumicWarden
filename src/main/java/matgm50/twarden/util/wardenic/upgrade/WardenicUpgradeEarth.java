package matgm50.twarden.util.wardenic.upgrade;

import matgm50.twarden.util.DamageSourceWarden;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import thaumcraft.api.aspects.Aspect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MasterAbdoTGM50 on 8/30/2014.
 */

public class WardenicUpgradeEarth extends WardenicUpgrade {

    public WardenicUpgradeEarth(Aspect aspect) {super(aspect);}

    @Override
    public void onTick(World world, EntityPlayer player, ItemStack stack) {

        super.onTick(world, player, stack);

        player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 0, 5));

    }

    @Override
    public void onAttacked(LivingHurtEvent event) {

        super.onAttacked(event);

        if(event.source.damageType == "fall") {

            List entities = new ArrayList<Entity>();
            DamageSource damageSource = new DamageSourceWarden("warden", event.entity);

            entities = event.entity.worldObj.getEntitiesWithinAABBExcludingEntity(event.entity, AxisAlignedBB.getBoundingBox(event.entity.posX - 6, event.entity.posY - 6, event.entity.posZ - 6, event.entity.posX + 6, event.entity.posY + 6, event.entity.posZ + 6));

            for(int i = 0; i < entities.size(); i++) {

                if(entities.get(i) instanceof Entity) {

                    ((Entity)entities.get(i)).attackEntityFrom(damageSource, 4);

                }

            }

        }

    }

}
