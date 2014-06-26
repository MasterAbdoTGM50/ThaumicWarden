package matgm50.twarden.entity;

import matgm50.twarden.util.PurityHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.common.Thaumcraft;

/**
 * Created by MasterAbdoTGM50 on 5/20/2014.
 */

public class EntityPurity extends EntityThrowable {

    public EntityPurity(World par1World) {

        super(par1World);

    }

    public EntityPurity(World par1World, EntityLivingBase par2EntityLivingBase) {

        super(par1World, par2EntityLivingBase);

    }

    public EntityPurity(World par1World, double par2, double par4, double par6) {

        super(par1World, par2, par4, par6);

    }

    @Override
    protected float getGravityVelocity() {

        return 0.001F;

    }

    @Override
    public void onUpdate() {

        if (this.worldObj.isRemote) {

            for (int i = 0; i < 3; i++) {

                Thaumcraft.proxy.wispFX2(this.worldObj, this.posX + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F, this.posY + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F, this.posZ + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F, 0.3F, 2, true, 0.02F);

                double x2 = (this.posX + this.prevPosX) / 2.0D + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F;
                double y2 = (this.posY + this.prevPosY) / 2.0D + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F;
                double z2 = (this.posZ + this.prevPosZ) / 2.0D + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2F;

                Thaumcraft.proxy.wispFX2(this.worldObj, x2, y2, z2, 0.3F, 2, true, 0.02F);

            }

        }

        super.onUpdate();

    }

    @Override
    protected void onImpact(MovingObjectPosition mop) {

        for (int a = 0; a < 9; a++) {

            float fx = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            float fy = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            float fz = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            Thaumcraft.proxy.wispFX3(this.worldObj, this.posX + fx, this.posY + fy, this.posZ + fz, this.posX + fx * 8.0F, this.posY + fy * 8.0F, this.posZ + fz * 8.0F, 0.3F, 2, true, 0.02F);

            fx = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            fy = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            fz = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            Thaumcraft.proxy.wispFX3(this.worldObj, this.posX + fx, this.posY + fy, this.posZ + fz, this.posX + fx * 8.0F, this.posY + fy * 8.0F, this.posZ + fz * 8.0F, 0.3F, 0, true, 0.02F);

            fx = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            fy = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            fz = (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.3F;
            Thaumcraft.proxy.wispFX3(this.worldObj, this.posX + fx, this.posY + fy, this.posZ + fz, this.posX + fx * 8.0F, this.posY + fy * 8.0F, this.posZ + fz * 8.0F, 0.3F, 2, true, 0.02F);

        }

        if(!worldObj.isRemote) {

            PurityHelper.checkAndPurify(mop);
            setDead();

        }

    }

}
