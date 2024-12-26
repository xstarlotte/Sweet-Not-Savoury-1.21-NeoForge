package net.xstarlotte.snsnf.block.custom.teddy;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class CatTeddyBlock extends BaseTeddyBlock {
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH, SOUTH:
                return Shapes.box(0.35f, 0f, 0f, 0.65f, 0.25f, 1f);
            case EAST, WEST:
                return Shapes.box(0f, 0f, 0.35f, 1f, 0.25f, 0.65f);
            default:
                return Shapes.block();
        }
    }
}