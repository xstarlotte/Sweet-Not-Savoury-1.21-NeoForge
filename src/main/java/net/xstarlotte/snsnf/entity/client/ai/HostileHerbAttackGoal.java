package net.xstarlotte.snsnf.entity.client.ai;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.monster.Monster;

public class HostileHerbAttackGoal extends MeleeAttackGoal {
    private int random;

    public HostileHerbAttackGoal(Monster creature, double speedIn , boolean useLongMemory ){
        super( creature , speedIn , useLongMemory );

        this.random = 0;
    }

    protected double getAttackReachSqr(LivingEntity attackTarget ){
        return 8.0F + attackTarget.getBbWidth();
    }

    protected void checkAndPerformAttack( LivingEntity enemy){
        this.random = getRandomNumber( 0 , 40 );
        double d0 = this.getAttackReachSqr( enemy );
        super.checkAndPerformAttack( enemy);
    }

    private int getRandomNumber( int min , int max ){
        return (int) ((Math.random() * (max - min)) + min);
    }

}
