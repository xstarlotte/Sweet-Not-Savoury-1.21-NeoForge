package net.xstarlotte.snsnf.datagen;

import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.worldgen.SNSBiomeModifiers;
import net.xstarlotte.snsnf.worldgen.SNSConfiguredFeatures;
import net.xstarlotte.snsnf.worldgen.SNSPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;


import java.util.Set;
import java.util.concurrent.CompletableFuture;


public class SNSWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, SNSConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, SNSPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, SNSBiomeModifiers::bootstrap);

    public SNSWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(SNSNF.MOD_ID));
    }
}
