package matgm50.twarden.util;

import baubles.api.BaublesApi;
import matgm50.twarden.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by MasterAbdoTGM50 on 6/24/2014.
 */

public class WardenHelper {

    public static final String WARDEN = "warden";
    public static final String ORDER = "order";
    public static final String CHAOS = "chaos";
    public static final String WATER = "water";
    public static final String FIRE = "fire";
    public static final String EARTH = "earth";
    public static final String AIR = "air";

    public static void setEffect(ItemStack stack) {

        if(stack.stackTagCompound == null) {

            stack.setTagCompound(new NBTTagCompound());

        }

        stack.stackTagCompound.setString("effect", WARDEN);

    }

    public static String getEffect(ItemStack stack) {

        if(stack.stackTagCompound != null) {

            if(stack.stackTagCompound.hasKey("effect")) {

                return stack.stackTagCompound.getString("effect");

            } else {

                return WARDEN;
            }

        } else {

            return WARDEN;

        }

    }

    public static int getBonus(EntityPlayer player) {

        if(BaublesApi.getBaubles(player).getStackInSlot(0) != null) {

            return BaublesApi.getBaubles(player).getStackInSlot(0).getItemDamage() + 1;

        }

        return 1;

    }

    public static void doEffect(String effect, ItemStack stack, EntityPlayer player, Entity entity) {

        if(effect == WARDEN) {

            DamageSource damageSource = new DamageSourceWardenSword("warden", player);
            entity.attackEntityFrom(damageSource, 2 * getBonus(player));

        }

    }

    public static void rollRepair(World world, EntityPlayer player, ItemStack itemStack) {

        if(!world.isRemote) {

            Random random = new Random();

            ItemStack amulet = BaublesApi.getBaubles(player).getStackInSlot(0);

            int chance;

            if(amulet != null) {

                if(amulet.getItem() == ModItems.itemWardenAmulet) {

                    if(amulet.getItemDamage() == 1) {

                        chance = 100;

                    } else if(amulet.getItemDamage() == 2) {

                        chance = 50;

                    } else if(amulet.getItemDamage() == 3) {

                        chance = 25;

                    } else {

                        chance = 200;

                    }

                    if(random.nextInt(chance) == 1) {

                        if(itemStack.getItemDamage() != 0) {

                            itemStack.setItemDamage(itemStack.getItemDamage() - 1);

                        }

                    }

                }

            }

        }

    }

}
