package net.xstarlotte.snsnf.block.custom.bed;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;

public class BaseBedBlock extends BedBlock {

    public BaseBedBlock(DyeColor colorIn, Properties properties){
        super(colorIn, properties);
    }

    public boolean isBed(BlockState state, BlockGetter world, BlockPos pos, Entity player) {
        return true;
    }
}
