package matgm50.twarden.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.EntityDamageSource;

public class TWCrossDamage extends EntityDamageSource {

	public TWCrossDamage(String Name, Entity Source) {
		
		super(Name, Source);
		setDamageBypassesArmor();
		
	}
	
}
