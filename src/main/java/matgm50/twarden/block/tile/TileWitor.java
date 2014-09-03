package matgm50.twarden.block.tile;

import net.minecraft.tileentity.TileEntity;
import thaumcraft.common.Thaumcraft;

/**
 * Created by MasterAbdoTGM50 on 9/2/2014.
 */

public class TileWitor extends TileEntity {

    public boolean canUpdate() {return true;}

    public void updateEntity() {

        super.updateEntity();

        if (this.worldObj.isRemote) {

            if (this.worldObj.rand.nextInt(9 - Thaumcraft.proxy.particleCount(2)) == 0) {
                Thaumcraft.proxy.wispFX3(this.worldObj, this.xCoord + 0.5F, this.yCoord + 0.5F, this.zCoord + 0.5F, this.xCoord + 0.3F + this.worldObj.rand.nextFloat() * 0.4F, this.yCoord + 0.5F, this.zCoord + 0.3F + this.worldObj.rand.nextFloat() * 0.4F, 0.5F, 0, true, -0.025F);
            }

            if (this.worldObj.rand.nextInt(15 - Thaumcraft.proxy.particleCount(4)) == 0) {
                Thaumcraft.proxy.wispFX3(this.worldObj, this.xCoord + 0.5F, this.yCoord + 0.5F, this.zCoord + 0.5F, this.xCoord + 0.4F + this.worldObj.rand.nextFloat() * 0.2F, this.yCoord + 0.5F, this.zCoord + 0.4F + this.worldObj.rand.nextFloat() * 0.2F, 0.25F, 2, true, -0.02F);
            }

        }

    }

}
