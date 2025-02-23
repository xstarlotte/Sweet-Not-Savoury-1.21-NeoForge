package net.xstarlotte.snsnf.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.xstarlotte.snsnf.block.SNSBlock;

public class BedItemRightclickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if ((entity.getDirection()) == Direction.NORTH && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) && !((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.AIR)
                && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x, y + 1, z), SNSBlock.BED_FEET.get().defaultBlockState(), 3);
            {
                Direction _dir = Direction.SOUTH;
                BlockPos _pos = BlockPos.containing(x, y + 1, z);
                BlockState _bs = world.getBlockState(_pos);
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
                } else {
                    _property = _bs.getBlock().getStateDefinition().getProperty("axis");
                    if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
                        world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
            world.setBlock(BlockPos.containing(x, y + 1, z - 1), SNSBlock.BED_HEAD.get().defaultBlockState(), 3);
            {
                Direction _dir = Direction.SOUTH;
                BlockPos _pos = BlockPos.containing(x, y + 1, z - 1);
                BlockState _bs = world.getBlockState(_pos);
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
                } else {
                    _property = _bs.getBlock().getStateDefinition().getProperty("axis");
                    if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
                        world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
        } else if ((entity.getDirection()) == Direction.EAST && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) && !((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.AIR)
                && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x, y + 1, z), SNSBlock.BED_FEET.get().defaultBlockState(), 3);
            {
                Direction _dir = Direction.WEST;
                BlockPos _pos = BlockPos.containing(x, y + 1, z);
                BlockState _bs = world.getBlockState(_pos);
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
                } else {
                    _property = _bs.getBlock().getStateDefinition().getProperty("axis");
                    if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
                        world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
            world.setBlock(BlockPos.containing(x + 1, y + 1, z), SNSBlock.BED_HEAD.get().defaultBlockState(), 3);
            {
                Direction _dir = Direction.WEST;
                BlockPos _pos = BlockPos.containing(x + 1, y + 1, z);
                BlockState _bs = world.getBlockState(_pos);
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
                } else {
                    _property = _bs.getBlock().getStateDefinition().getProperty("axis");
                    if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
                        world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
        } else if ((entity.getDirection()) == Direction.SOUTH && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) && !((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.AIR)
                && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x, y + 1, z), SNSBlock.BED_FEET.get().defaultBlockState(), 3);
            {
                Direction _dir = Direction.NORTH;
                BlockPos _pos = BlockPos.containing(x, y + 1, z);
                BlockState _bs = world.getBlockState(_pos);
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
                } else {
                    _property = _bs.getBlock().getStateDefinition().getProperty("axis");
                    if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
                        world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
            world.setBlock(BlockPos.containing(x, y + 1, z + 1), SNSBlock.BED_HEAD.get().defaultBlockState(), 3);
            {
                Direction _dir = Direction.NORTH;
                BlockPos _pos = BlockPos.containing(x, y + 1, z + 1);
                BlockState _bs = world.getBlockState(_pos);
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
                } else {
                    _property = _bs.getBlock().getStateDefinition().getProperty("axis");
                    if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
                        world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
        } else if ((entity.getDirection()) == Direction.WEST && !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) && !((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.AIR)
                && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR) {
            world.setBlock(BlockPos.containing(x, y + 1, z), SNSBlock.BED_FEET.get().defaultBlockState(), 3);
            {
                Direction _dir = Direction.EAST;
                BlockPos _pos = BlockPos.containing(x, y + 1, z);
                BlockState _bs = world.getBlockState(_pos);
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
                } else {
                    _property = _bs.getBlock().getStateDefinition().getProperty("axis");
                    if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
                        world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
            world.setBlock(BlockPos.containing(x - 1, y + 1, z), SNSBlock.BED_HEAD.get().defaultBlockState(), 3);
            {
                Direction _dir = Direction.EAST;
                BlockPos _pos = BlockPos.containing(x - 1, y + 1, z);
                BlockState _bs = world.getBlockState(_pos);
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
                } else {
                    _property = _bs.getBlock().getStateDefinition().getProperty("axis");
                    if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
                        world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
        }
    }
}
