package net.xstarlotte.snsnf.block.custom.bed;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BaseBedBlock extends BedBlock {
    public BaseBedBlock(DyeColor color, Properties properties) {
        super(color, properties);
    }

    @Override
    public boolean isBed(BlockState state, BlockGetter level, BlockPos pos, LivingEntity sleeper) {
        return true;
    }
}
