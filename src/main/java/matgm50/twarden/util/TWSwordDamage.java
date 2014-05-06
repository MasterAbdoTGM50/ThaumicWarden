package matgm50.twarden.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.EntityDamageSource;

public class TWSwordDamage extends EntityDamageSource {

	public TWSwordDamage(String name, Entity source) {
		
		super(name, source);
		setDamageBypassesArmor();
		
	}
	
}
