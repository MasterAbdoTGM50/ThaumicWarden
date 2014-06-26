package matgm50.twarden.util;

import matgm50.twarden.entity.IEldritchMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.*;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.entities.ITaintedMob;
import thaumcraft.common.entities.monster.*;

/**
 * Created by MasterAbdoTGM50 on 5/20/2014.
 */

public class PurityHelper {

    public static boolean isEldritch(Entity entity) {

        if(entity instanceof IEldritchMob) {

            return true;

        }

        return false;

    }

    public static boolean isEldritch(MovingObjectPosition mop) {

        if(mop.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY) {

            if (mop.entityHit != null) {

                return isEldritch(mop.entityHit);

            }

        }

        return false;

    }

    public static boolean isTainted(Entity entity) {

        if(entity instanceof ITaintedMob) {

            return true;

        }

        return false;

    }

    public static boolean isTainted(MovingObjectPosition mop) {

        if(mop.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY) {

            if (mop.entityHit != null) {

                return isTainted(mop.entityHit);

            }

        }

        return false;

    }

    public static void purifyEntity(Entity toPurify) {

        if (toPurify != null) {

            World world = toPurify.worldObj;

            if(isTainted(toPurify)) {

                if(!world.isRemote) {

                    Entity purified = getPureState(toPurify);
                    purified.setPositionAndRotation(toPurify.posX, toPurify.posY, toPurify.posZ, toPurify.rotationYaw, toPurify.rotationPitch);

                    toPurify.setDead();
                    world.spawnEntityInWorld(purified);

                }

            }

        }

    }

    public static void checkAndPurify(MovingObjectPosition mop) {

        if(mop.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY) {

            purifyEntity(mop.entityHit);

        }

    }

    public static Entity getPureState(Entity entity){

        if(entity instanceof EntityTaintChicken) {

            return new EntityChicken(entity.worldObj);

        }

        if(entity instanceof EntityTaintCow) {

            return new EntityCow(entity.worldObj);

        }

        if(entity instanceof EntityTaintCreeper) {

            return new EntityCreeper(entity.worldObj);

        }

        if(entity instanceof EntityTaintPig) {

            return new EntityPig(entity.worldObj);

        }

        if(entity instanceof EntityTaintSheep) {

            return new EntitySheep(entity.worldObj);

        }

        if(entity instanceof EntityTaintSpider) {

            return new EntitySpider(entity.worldObj);

        }

        if(entity instanceof EntityTaintVillager) {

            return new EntityVillager(entity.worldObj);

        }

        return entity;

    }

}
