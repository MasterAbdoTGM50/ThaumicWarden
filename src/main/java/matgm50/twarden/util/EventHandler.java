package matgm50.twarden.util;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class EventHandler {

    public static void init() {

        FMLCommonHandler.instance().bus().register(new EventHandler());

    }

}
