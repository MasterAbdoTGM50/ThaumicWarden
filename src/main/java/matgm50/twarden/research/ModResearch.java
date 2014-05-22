package matgm50.twarden.research;

import matgm50.twarden.lib.ResearchLib;
import thaumcraft.api.aspects.Aspect;

/**
 * Created by MasterAbdoTGM50 on 5/22/2014.
 */

public class ModResearch {

    public static Aspect exubitor;

    public static void init() {

        initAspect();
        initCategory();
        initResearch();

    }

    public static void initAspect() {

        exubitor = new Aspect(ResearchLib.EXUBITOR_KEY, 0x3cd4fc, new Aspect[] {Aspect.ELDRITCH, Aspect.DEATH}, ResearchLib.EXUBITOR_ICON, 771);

    }

    public static void initCategory() {



    }

    public static void initResearch() {



    }

}
