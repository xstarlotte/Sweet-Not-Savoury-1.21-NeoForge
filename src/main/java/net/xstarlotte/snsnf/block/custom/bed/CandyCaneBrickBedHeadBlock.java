package net.xstarlotte.snsnf.block.custom.bed;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.xstarlotte.snsnf.item.SNSItem;
import net.xstarlotte.snsnf.procedures.BedTimerProcedure;
import net.xstarlotte.snsnf.procedures.BedHeadOnBlockRightClickedProcedure;
import net.xstarlotte.snsnf.procedures.BedHeadBlockDestroyedByPlayerProcedure;
import net.xstarlotte.snsnf.procedures.BedHeadBlockDestroyedByExplosionProcedure;

public class CandyCaneBrickBedHeadBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public CandyCaneBrickBedHeadBlock() {
        super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.COLOR_PINK).sound(SoundType.WOOD).strength(0.2f).noOcclusion().pushReaction(PushReaction.BLOCK)
                .isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(box(0, 0, 0, 16, 3, 16), box(0, 3, 2, 16, 5, 16), box(0, 5, 5.5, 16, 5.5, 16), box(0, 3, 0, 16, 11, 2), box(0.25, 5.25, 2.75, 7.75, 10.25, 4.75), box(0.075, 5, 5, 15.95, 5.75, 7.25),
                    box(8.25, 5.25, 2.75, 15.75, 10.25, 4.75));
            case NORTH -> Shapes.or(box(0, 0, 0, 16, 3, 16), box(0, 3, 0, 16, 5, 14), box(0, 5, 0, 16, 5.5, 10.5), box(0, 3, 14, 16, 11, 16), box(8.25, 5.25, 11.25, 15.75, 10.25, 13.25), box(0.05, 5, 8.75, 15.925, 5.75, 11),
                    box(0.25, 5.25, 11.25, 7.75, 10.25, 13.25));
            case EAST -> Shapes.or(box(0, 0, 0, 16, 3, 16), box(2, 3, 0, 16, 5, 16), box(5.5, 5, 0, 16, 5.5, 16), box(0, 3, 0, 2, 11, 16), box(2.75, 5.25, 8.25, 4.75, 10.25, 15.75), box(5, 5, 0.05, 7.25, 5.75, 15.925),
                    box(2.75, 5.25, 0.25, 4.75, 10.25, 7.75));
            case WEST -> Shapes.or(box(0, 0, 0, 16, 3, 16), box(0, 3, 0, 14, 5, 16), box(0, 5, 0, 10.5, 5.5, 16), box(14, 3, 0, 16, 11, 16), box(11.25, 5.25, 0.25, 13.25, 10.25, 7.75), box(8.75, 5, 0.075, 11, 5.75, 15.95),
                    box(11.25, 5.25, 8.25, 13.25, 10.25, 15.75));
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return new ItemStack(SNSItem.CANDY_CANE_BRICK_BED_ITEM.get());
    }

    @Override
    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 1);
    }

    @Override
    public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
        super.tick(blockstate, world, pos, random);
        BedTimerProcedure.execute(world);
        world.scheduleTick(pos, this, 1);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
        boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
        BedHeadBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
        return retval;
    }

    @Override
    public void wasExploded(Level world, BlockPos pos, Explosion e) {
        super.wasExploded(world, pos, e);
        BedHeadBlockDestroyedByExplosionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
        super.useWithoutItem(blockstate, world, pos, entity, hit);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        double hitX = hit.getLocation().x;
        double hitY = hit.getLocation().y;
        double hitZ = hit.getLocation().z;
        Direction direction = hit.getDirection();
        BedHeadOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
        return InteractionResult.SUCCESS;
    }
}
