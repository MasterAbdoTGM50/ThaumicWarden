package matgm50.twarden.util;

import matgm50.twarden.config.TWModConfig;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TWLang {
	
	public static void Init () {
		
		for(String Locale : TWModConfig.TWMOD_LANGS) {
			
            LanguageRegistry.instance().loadLocalization( "/assets/twarden/lang/" + Locale + ".lang", Locale, false);
            
		}
		
	}
	
}
