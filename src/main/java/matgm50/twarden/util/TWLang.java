package matgm50.twarden.util;

import cpw.mods.fml.common.registry.LanguageRegistry;
import matgm50.twarden.config.TWModConfig;

public class TWLang {
	
	public static void Init () {
		
		for(String Locale : TWModConfig.TWMOD_LANGS) {
			
            LanguageRegistry.instance().loadLocalization( "/assets/twarden/lang/" + Locale + ".lang", Locale, false);
            
		}
		
	}
	
}
