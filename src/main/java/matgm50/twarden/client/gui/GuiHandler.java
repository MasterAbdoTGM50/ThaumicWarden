package matgm50.twarden.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import matgm50.twarden.TWarden;
import matgm50.twarden.inventory.ContainerHammer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by MasterAbdoTGM50 on 8/26/2014.
 */

public class GuiHandler implements IGuiHandler {

    public static void init() {

        NetworkRegistry.INSTANCE.registerGuiHandler(TWarden.instance, new GuiHandler());

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        switch(ID) {
            case 0 : return new ContainerHammer(player);
        }

        return null;

    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        switch(ID) {
            case 0 : return new GuiWaslieHammer(player);
        }

        return null;

    }

}
