package net.xstarlotte.snsnf.block.entity.custom.bed;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.xstarlotte.snsnf.block.custom.bed.WaffleBedBlock;
import net.xstarlotte.snsnf.block.entity.SNSBE;

public class WaffleBedBE extends BlockEntity {
    private DyeColor color;

    public WaffleBedBE(BlockPos pos, BlockState blockState) {
        super(SNSBE.WAFFLE_BED_BE.get(), pos, blockState);
        this.color = ((WaffleBedBlock)blockState.getBlock()).getColor();
    }

    public WaffleBedBE(BlockPos pos, BlockState blockState, DyeColor color) {
        super(SNSBE.WAFFLE_BED_BE.get(), pos, blockState);
        this.color = color;
    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public DyeColor getColor() {
        return this.color;
    }

    public void setColor(DyeColor color) {
        this.color = color;
    }
}
