package net.xstarlotte.snsnf.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BedFeetOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
            if ((new Object() {
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
            }.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH) {
                if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x + 1, y, z), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x - 1, y, z), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x - 1, y, z + 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x + 1, y, z + 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else {
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("You can't sleep, no valid spawn point location."), true);
                }
            } else if ((new Object() {
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
            }.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH) {
                if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x + 1, y, z), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x - 1, y, z), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x - 1, y, z - 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x + 1, y, z - 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else {
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("You can't sleep, no valid spawn point location."), true);
                }
            } else if ((new Object() {
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
            }.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST) {
                if (!((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x, y, z + 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x, y, z - 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z - 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x - 1, y, z - 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x - 1, y - 1, z + 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x - 1, y, z + 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else {
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("You can't sleep, no valid spawn point location."), true);
                }
            } else if ((new Object() {
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
            }.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST) {
                if (!((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x, y, z + 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x, y, z - 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z - 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x + 1, y, z - 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else if (!((world.getBlockState(BlockPos.containing(x + 1, y - 1, z + 1))).getBlock() == Blocks.AIR) && (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.AIR
                        && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.AIR) {
                    if (world instanceof ServerLevel _level)
                        _level.setDayTime(0);
                    if (entity instanceof ServerPlayer _serverPlayer)
                        _serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(x + 1, y, z + 1), _serverPlayer.getYRot(), true, false);
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("Time has passed, your spawn point was set!"), true);
                } else {
                    if (entity instanceof Player _player && !_player.level().isClientSide())
                        _player.displayClientMessage(Component.literal("You can't sleep, no valid spawn point location."), true);
                }
            }
        } else {
            if (entity instanceof Player _player && !_player.level().isClientSide())
                _player.displayClientMessage(Component.literal("You can sleep only at night or during thunderstorms"), true);
        }
    }
}
