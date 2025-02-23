package net.xstarlotte.snsnf.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.xstarlotte.snsnf.block.SNSBlock;

public class BedHeadBlockDestroyedByExplosionProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SNSBlock.BED_FEET.get() && (new Object() {
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (property != null && _bs.getValue(property) instanceof Direction _dir)
                    return _dir;
                else if (_bs.hasProperty(BlockStateProperties.AXIS))
                    return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
                else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
                    return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
                return Direction.NORTH;
            }
        }.getDirection(BlockPos.containing(x, y, z - 1))) == Direction.NORTH) {
            world.destroyBlock(BlockPos.containing(x, y, z - 1), false);
        } else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SNSBlock.BED_FEET.get() && (new Object() {
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (property != null && _bs.getValue(property) instanceof Direction _dir)
                    return _dir;
                else if (_bs.hasProperty(BlockStateProperties.AXIS))
                    return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
                else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
                    return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
                return Direction.NORTH;
            }
        }.getDirection(BlockPos.containing(x + 1, y, z))) == Direction.EAST) {
            world.destroyBlock(BlockPos.containing(x + 1, y, z), false);
        } else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SNSBlock.BED_FEET.get() && (new Object() {
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (property != null && _bs.getValue(property) instanceof Direction _dir)
                    return _dir;
                else if (_bs.hasProperty(BlockStateProperties.AXIS))
                    return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
                else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
                    return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
                return Direction.NORTH;
            }
        }.getDirection(BlockPos.containing(x, y, z + 1))) == Direction.SOUTH) {
            world.destroyBlock(BlockPos.containing(x, y, z + 1), false);
        } else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SNSBlock.BED_FEET.get() && (new Object() {
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (property != null && _bs.getValue(property) instanceof Direction _dir)
                    return _dir;
                else if (_bs.hasProperty(BlockStateProperties.AXIS))
                    return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
                else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
                    return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
                return Direction.NORTH;
            }
        }.getDirection(BlockPos.containing(x - 1, y, z))) == Direction.WEST) {
            world.destroyBlock(BlockPos.containing(x - 1, y, z), false);
        }
    }
}
