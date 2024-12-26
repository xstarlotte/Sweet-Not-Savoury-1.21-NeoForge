package net.xstarlotte.snsnf.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.xstarlotte.snsnf.SNSNF;

import java.util.List;

public class SNSPlacedFeatures {

    public static final ResourceKey<PlacedFeature> CANDY_CANE_PLACED_KEY = registerKey("candy_cane_placed");
    public static final ResourceKey<PlacedFeature> CANDY_CANE_PLACED_KEY_2 = registerKey("candy_cane_placed_2");
    public static final ResourceKey<PlacedFeature> CANDY_CANE_PLACED_KEY_3 = registerKey("candy_cane_placed_3");
    public static final ResourceKey<PlacedFeature> CANDY_CANE_PLACED_KEY_4 = registerKey("candy_cane_placed_4");
    public static final ResourceKey<PlacedFeature> CANDY_CANE_PLACED_KEY_5 = registerKey("candy_cane_placed_5");
    public static final ResourceKey<PlacedFeature> CANDY_CANE_PLACED_KEY_6 = registerKey("candy_cane_placed_6");
    public static final ResourceKey<PlacedFeature> CANDY_CANE_PLACED_KEY_7 = registerKey("candy_cane_placed_7");
    public static final ResourceKey<PlacedFeature> CANDY_CANE_PLACED_KEY_8 = registerKey("candy_cane_placed_8");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CANDY_CANE_PLACED_KEY, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CANDY_CANE_PLACED_KEY_2, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_KEY_2),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CANDY_CANE_PLACED_KEY_3, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_KEY_3),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CANDY_CANE_PLACED_KEY_4, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_KEY_4),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CANDY_CANE_PLACED_KEY_5, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_KEY_5),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CANDY_CANE_PLACED_KEY_6, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_KEY_6),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CANDY_CANE_PLACED_KEY_7, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_KEY_7),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CANDY_CANE_PLACED_KEY_8, configuredFeatures.getOrThrow(SNSConfiguredFeatures.CANDY_CANE_KEY_8),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, name));
    }
    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
