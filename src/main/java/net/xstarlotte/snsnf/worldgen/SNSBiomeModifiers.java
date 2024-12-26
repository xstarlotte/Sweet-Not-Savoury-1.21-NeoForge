package net.xstarlotte.snsnf.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.xstarlotte.snsnf.SNSNF;

public class SNSBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_CANDY_CANE = registerKey("add_candy_cane");
    public static final ResourceKey<BiomeModifier> ADD_CANDY_CANE_2 = registerKey("add_candy_cane_2");
    public static final ResourceKey<BiomeModifier> ADD_CANDY_CANE_3 = registerKey("add_candy_cane_3");
    public static final ResourceKey<BiomeModifier> ADD_CANDY_CANE_4 = registerKey("add_candy_cane_4");
    public static final ResourceKey<BiomeModifier> ADD_CANDY_CANE_5 = registerKey("add_candy_cane_5");
    public static final ResourceKey<BiomeModifier> ADD_CANDY_CANE_6 = registerKey("add_candy_cane_6");
    public static final ResourceKey<BiomeModifier> ADD_CANDY_CANE_7 = registerKey("add_candy_cane_7");
    public static final ResourceKey<BiomeModifier> ADD_CANDY_CANE_8 = registerKey("add_candy_cane_8");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_CANDY_CANE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES)),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CANDY_CANE_2, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES)),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_PLACED_KEY_2)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CANDY_CANE_3, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES)),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_PLACED_KEY_3)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CANDY_CANE_4, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES)),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_PLACED_KEY_4)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CANDY_CANE_5, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES)),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_PLACED_KEY_5)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CANDY_CANE_6, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES)),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_PLACED_KEY_6)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CANDY_CANE_7, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES)),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_PLACED_KEY_7)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_CANDY_CANE_8, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES)),
                HolderSet.direct(placedFeatures.getOrThrow(SNSPlacedFeatures.CANDY_CANE_PLACED_KEY_8)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }
    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, name));
    }
}
