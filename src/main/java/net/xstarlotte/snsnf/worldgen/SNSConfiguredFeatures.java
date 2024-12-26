package net.xstarlotte.snsnf.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseProvider;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;

import java.util.List;

public class SNSConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_KEY = registerKey("candy_cane");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_KEY_2 = registerKey("candy_cane_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_KEY_3 = registerKey("candy_cane_3");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_KEY_4 = registerKey("candy_cane_4");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_KEY_5 = registerKey("candy_cane_5");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_KEY_6 = registerKey("candy_cane_6");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_KEY_7 = registerKey("candy_cane_7");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CANDY_CANE_KEY_8 = registerKey("candy_cane_8");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, CANDY_CANE_KEY, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlock.CANDY_CANE_BUSH.get()))))
        );
        register(context, CANDY_CANE_KEY_2, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlock.CANDY_CANE_CARNATION.get()))))
        );
        register(context, CANDY_CANE_KEY_3, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlock.CANDY_CANE_FLOWER.get()))))
        );
        register(context, CANDY_CANE_KEY_4, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlock.CANDY_CANE_FLOWER_2.get()))))
        );
        register(context, CANDY_CANE_KEY_5, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlock.CANDY_CANE_FLOWER_3.get()))))
        );
        register(context, CANDY_CANE_KEY_6, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlock.CANDY_CANE_FLOWER_4.get()))))
        );
        register(context, CANDY_CANE_KEY_7, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlock.CANDY_CANE_GRASS.get()))))
        );
        register(context, CANDY_CANE_KEY_8, Feature.FLOWER, new RandomPatchConfiguration(32, 1, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SNSBlock.CANDY_CANE_GRASS_LONG.get()))))
        );

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}