package net.xstarlotte.snsnf.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class SNSFoodProperties {

    public static final FoodProperties HERB = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 0.65f).build();

    public static final FoodProperties SWEET = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600), 0.65f).build();
    public static final FoodProperties SWEET_II = new FoodProperties.Builder().nutrition(6).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200), 0.85f).build();
}
