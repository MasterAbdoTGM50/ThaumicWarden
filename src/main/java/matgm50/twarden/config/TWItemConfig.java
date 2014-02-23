package matgm50.twarden.config;

import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TWItemConfig {
	
	public static int TWHELM_ID;
	public static final int TWHELM_DID = 15101;
	public static final String TWHELM_KEY = "TWHelmet";
	public static final String TWHELM_UN_NAME = "WardenHelmet";
	
	public static int TWCHEST_ID;
	public static final int TWCHEST_DID = 15102;
	public static final String TWCHEST_KEY = "TWChestplate";
	public static final String TWCHEST_UN_NAME = "WardenChestplate";
	
	public static int TWLEGS_ID;
	public static final int TWLEGS_DID = 15103;
	public static final String TWLEGS_KEY = "TWLeggings";
	public static final String TWLEGS_UN_NAME = "WardenLeggings";
	
	public static int TWBOOTS_ID;
	public static final int TWBOOTS_DID = 15104;
	public static final String TWBOOTS_KEY = "TWBoots";
	public static final String TWBOOTS_UN_NAME = "WardenBoots";
	
	public static int TWSWORD_ID;
	public static final int TWSWORD_DID = 15105;
	public static final String TWSWORD_KEY = "TWSword";
	public static final String TWSWORD_UN_NAME = "WardenSword";
	
	public static int TWBOW_ID;
	public static final int TWBOW_DID = 15106;
	public static final String TWBOW_KEY = "TWBow";
	public static final String TWBOW_UN_NAME = "WardenBow";
	
	@SideOnly(Side.CLIENT)
	public static Icon[] TWBOWDRAWN_ICON;
	public static final String[] TWBOWDRAWN_ICONNAME = { "wardenbowdrawn0", "wardenbowdrawn1", "wardenbowdrawn2"};
	
	public static int TWRESOURCE_ID;
	public static final int TWRESOURCE_DID = 15107;
	public static final String TWRESOURCE_KEY = "TWResource";
	public static final String TWRESOURCE_UN_NAME = "WardenResource";
	
	@SideOnly(Side.CLIENT)
	public static Icon[] TWRESOURCE_ICON;
	public static final String[] TWRESOURCE_ICONNAME = {"infusedquartz", "wardensigilframe", "wardenshard", "wardenstone", "taintedbloodspill"};
	
	public static int TWSIGIL_ID;
	public static final int TWSIGIL_DID = 15108;
	public static final String TWSIGIL_KEY = "TWSigil";
	public static final String TWSIGIL_UN_NAME = "WardenSigil";
	
	public static int TWAMULET_ID;
	public static final int TWAMULET_DID = 15109;
	public static final String TWAMULET_KEY = "TWAmulet";
	public static final String TWAMULET_UN_NAME = "WardenAmulet";
	
	public static int TWBLOOD_ID;
	public static final int TWBLOOD_DID = 15110;
	public static final String TWBLOOD_KEY = "TWBlood";
	public static final String TWBLOOD_UN_NAME = "TaintedBlood";
	
}
