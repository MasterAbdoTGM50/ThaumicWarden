package matgm50.twarden;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import matgm50.twarden.block.ModBlocks;
import matgm50.twarden.crafting.ModRecipes;
import matgm50.twarden.entity.ModEntities;
import matgm50.twarden.item.ModItems;
import matgm50.twarden.lib.ModLib;
import matgm50.twarden.network.proxy.CommonProxy;
import matgm50.twarden.util.TabTWarden;
import matgm50.twarden.world.ModGen;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by MasterAbdoTGM50 on 5/11/2014.
 */

@Mod(modid = ModLib.ID, name = ModLib.NAME, version = ModLib.VERSION, dependencies = ModLib.DEPENDENCIES)

public class TWarden {

    @Instance(ModLib.ID)
    public static TWarden instance;

    @SidedProxy(serverSide = ModLib.COMMONPROXY, clientSide = ModLib.CLIENTPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs tabTWarden = new TabTWarden(ModLib.ID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.initRenderers();

        ModItems.init();
        ModBlocks.init();
        ModEntities.init();
        ModGen.init();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        //ModRecipes.init();
        //ModResearch.init();

    }

}
