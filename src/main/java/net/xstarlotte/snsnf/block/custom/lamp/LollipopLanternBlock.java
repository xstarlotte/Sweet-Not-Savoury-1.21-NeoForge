package net.xstarlotte.snsnf.block.custom.lamp;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;


public class LollipopLanternBlock extends BaseLampBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty HANGING = BlockStateProperties.HANGING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape SHAPE_NT = createShape(Direction.NORTH, true);
    protected static final VoxelShape SHAPE_NF = createShape(Direction.NORTH, false);
    protected static final VoxelShape SHAPE_ST = createShape(Direction.SOUTH, true);
    protected static final VoxelShape SHAPE_SF = createShape(Direction.SOUTH, false);
    protected static final VoxelShape SHAPE_ET = createShape(Direction.EAST, true);
    protected static final VoxelShape SHAPE_EF = createShape(Direction.EAST, false);
    protected static final VoxelShape SHAPE_WT = createShape(Direction.WEST, true);
    protected static final VoxelShape SHAPE_WF = createShape(Direction.WEST, false);

    private static VoxelShape createShape(Direction facing, boolean hanging) {
        VoxelShape base = Block.box(
                7, hanging ? 6 : 0, 7,
                9, hanging ? 20 : 3, 9
        );
        int dx = facing.getStepX();
        int dz = facing.getStepZ();
        int adx = Math.abs(dx);
        int adz = Math.abs(dz);

        int sx = dx < 0 ? 9 : 7;
        int ex = dx < 0 ? 7 : 9;
        int sz = dz < 0 ? 9 : 7;
        int ez = dz < 0 ? 7 : 9;

        return Shapes.or(base);
    }

    private static VoxelShape safeBox(double x0, double y0, double z0, double x1, double y1, double z1) {
        return Block.box(
                Math.min(x0, x1), Math.min(y0, y1), Math.min(z0, z1),
                Math.max(x0, x1), Math.max(y0, y1), Math.max(z0, z1)
        );
    }

    public LollipopLanternBlock(Properties p_153465_) {
        super(p_153465_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(HANGING, false).setValue(WATERLOGGED, false));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection().getOpposite();

        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        boolean waterlogged = fluidstate.getType() == Fluids.WATER;

        boolean hanging = context.getClickedFace() == Direction.DOWN;

        return this.defaultBlockState()
                .setValue(FACING, facing)
                .setValue(WATERLOGGED, waterlogged)
                .setValue(HANGING, hanging);
    }

    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        Direction facing = state.getValue(FACING);
        boolean hanging = state.getValue(HANGING);
        return switch (facing) {
            case NORTH -> hanging ? SHAPE_NT : SHAPE_NF;
            case SOUTH -> hanging ? SHAPE_ST : SHAPE_SF;
            case EAST -> hanging ? SHAPE_ET : SHAPE_EF;
            case WEST -> hanging ? SHAPE_WT : SHAPE_WF;
            default -> throw new RuntimeException("Unexpected facing");
        };
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, HANGING, WATERLOGGED);
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Direction direction = getConnectedDirection(state);
        return Block.canSupportCenter(level, pos.relative(direction), direction.getOpposite());
    }

    protected static Direction getConnectedDirection(BlockState p_153496_) {
        return p_153496_.getValue(HANGING) ? Direction.UP : Direction.DOWN;
    }

    public PushReaction getPistonPushReaction(BlockState p_153494_) {
        return PushReaction.DESTROY;
    }

    public BlockState updateShape(BlockState p_153483_, Direction p_153484_, BlockState p_153485_, LevelAccessor p_153486_, BlockPos p_153487_, BlockPos p_153488_) {
        if (p_153483_.getValue(WATERLOGGED)) {
            p_153486_.scheduleTick(p_153487_, Fluids.WATER, Fluids.WATER.getTickDelay(p_153486_));
        }

        return getConnectedDirection(p_153483_) == p_153484_ && !p_153483_.canSurvive(p_153486_, p_153487_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_153483_, p_153484_, p_153485_, p_153486_, p_153487_, p_153488_);
    }

    public FluidState getFluidState(BlockState p_153492_) {
        return p_153492_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_153492_);
    }

    public boolean isPathfindable(BlockState p_153469_, BlockGetter p_153470_, BlockPos p_153471_, PathComputationType p_153472_) {
        return false;
    }
}

