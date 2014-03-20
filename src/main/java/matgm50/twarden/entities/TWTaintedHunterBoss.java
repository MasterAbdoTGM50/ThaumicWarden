package matgm50.twarden.entities;

import matgm50.twarden.items.TWItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import thaumcraft.common.entities.ITaintedMob;

public class TWTaintedHunterBoss extends EntityMob implements ITaintedMob{
	
	public TWTaintedHunterBoss(World World) {
		
		super(World);
		setCurrentItemOrArmor(0, new ItemStack(TWItems.TWTaintedBlade));
		setCurrentItemOrArmor(1, new ItemStack(TWItems.TWTaintedHelm));
		setCurrentItemOrArmor(2, new ItemStack(TWItems.TWTaintedChest));
		setCurrentItemOrArmor(3, new ItemStack(TWItems.TWTaintedLegs));
		setCurrentItemOrArmor(4, new ItemStack(TWItems.TWTaintedBoots));
		this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 1.0D, 32.0F));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 16.0F));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		
	}
	
	@Override
	protected void applyEntityAttributes() {
		
		super.applyEntityAttributes();
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(80.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(5.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.4D);
	    
	}
	
	@Override
	protected boolean isAIEnabled(){return true;}
	
	@Override
	protected boolean canDespawn() {return this.isDead;}
	
	@Override
	protected Entity findPlayerToAttack() {
		
		double Range = 16.0D;
		return this.worldObj.getClosestVulnerablePlayerToEntity(this, Range);
		
    }
	
}
