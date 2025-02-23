package net.xstarlotte.snsnf.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.xstarlotte.snsnf.network.SNSNFModVariables;

public class BedTimerProcedure {
    public static void execute(LevelAccessor world) {
        if (SNSNFModVariables.WorldVariables.get(world).bedTimerEnabled) {
            SNSNFModVariables.WorldVariables.get(world).bedTimer = SNSNFModVariables.WorldVariables.get(world).bedTimer + 1;
            SNSNFModVariables.WorldVariables.get(world).syncData(world);
            if (SNSNFModVariables.WorldVariables.get(world).bedTimer >= 1000) {
                if (world instanceof ServerLevel _level)
                    _level.setDayTime(0);
                SNSNFModVariables.WorldVariables.get(world).bedTimerEnabled = false;
                SNSNFModVariables.WorldVariables.get(world).syncData(world);
                SNSNFModVariables.WorldVariables.get(world).bedTimer = 0;
                SNSNFModVariables.WorldVariables.get(world).syncData(world);
            }
        }
    }
}
