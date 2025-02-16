package net.xstarlotte.snsnf.mob_effects;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;

public class SNSEffect {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, SNSNF.MOD_ID);

    public static final Holder<MobEffect> HERB_EFFECT = MOB_EFFECTS.register("herb",
            () -> new HerbEffect(MobEffectCategory.NEUTRAL, 0x36ebab)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED,
                            ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb"), -0.25f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
