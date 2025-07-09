package net.xstarlotte.snsnf.block.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.block.entity.custom.bed.WaffleBedBE;

import java.util.function.Supplier;

public class SNSBE {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SNSNF.MOD_ID);

    public static final Supplier<BlockEntityType<WaffleBedBE>> WAFFLE_BED_BE =
            BLOCK_ENTITIES.register("waffle_bed_be", () -> BlockEntityType.Builder.of(
                    WaffleBedBE::new, SNSBlock.WAFFLE_BED.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
