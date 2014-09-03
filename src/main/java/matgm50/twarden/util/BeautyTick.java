package matgm50.twarden.util;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import matgm50.twarden.item.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import thaumcraft.common.Thaumcraft;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 9/3/2014.
 */

public class BeautyTick {

    Random random = new Random();

    public static void init() {

        MinecraftForge.EVENT_BUS.register(new BeautyTick());

    }

    @SubscribeEvent
    public void onTick(LivingEvent.LivingUpdateEvent event) {

        if(event.entity instanceof EntityPlayer) {

            EntityPlayer player = (EntityPlayer)event.entity;

            if(player.getCurrentEquippedItem().getItem() == ModItems.itemLoveRing) {

                if(player.worldObj.isRemote) {

                    for(int degree = 0; degree < 360; degree++) {

                        Thaumcraft.proxy.wispFX3(player.worldObj, calculateX(player.posX, 3, degree), player.posY - 1F, calculateZ(player.posZ, 3, degree),
                                calculateX(player.posX, 3, degree), player.posY + 1F, calculateZ(player.posZ, 3, degree), 0.5F, 2, true, -0.025F);

                        Thaumcraft.proxy.wispFX3(player.worldObj, calculateX(player.posX, 3, degree), player.posY - 1F + 2, calculateZ(player.posZ, 3, degree),
                                calculateX(player.posX, 3, degree), player.posY + 1F, calculateZ(player.posZ, 3, degree), 0.5F, 0, true, -0.025F);

                        Thaumcraft.proxy.wispFX3(player.worldObj, calculateX(player.posX, 2, degree), player.posY - 1F, calculateZ(player.posZ, 2, degree),
                                calculateX(player.posX, 2, degree), player.posY + 1F, calculateZ(player.posZ, 2, degree), 0.5F, 2, true, -0.025F);

                        Thaumcraft.proxy.wispFX3(player.worldObj, calculateX(player.posX, 2, degree), player.posY - 1F + 2, calculateZ(player.posZ, 2, degree),
                                calculateX(player.posX, 2, degree), player.posY + 1F, calculateZ(player.posZ, 2, degree), 0.5F, 0, true, -0.025F);

                    }

                }

            }

        }

    }

    public static double calculateX(double originX, int radius, int degree) {

        return originX + radius * Math.cos(degree * Math.PI/180);

    }

    public static double calculateZ(double originZ, int radius, int degree) {

        return originZ + radius * Math.sin(degree * Math.PI/180);

    }

}
