package net.xstarlotte.snsnf.block.custom.bed;


import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;



public class WaffleBedBlock extends BaseBedBlock{

    public WaffleBedBlock(DyeColor color, Properties properties) {
        super(color, properties);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

}
