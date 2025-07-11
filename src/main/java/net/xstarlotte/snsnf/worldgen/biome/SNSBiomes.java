package net.xstarlotte.snsnf.worldgen.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.worldgen.biome.region.OverworldRegion;
import terrablender.api.Regions;

public class SNSBiomes {
    public static final ResourceKey<Biome> CINNAMON_CRAIG = registerBiomeKey("cinnamon_craig");
    public static final ResourceKey<Biome> PEPPERMINT_PLAINS = registerBiomeKey("peppermint_plains");

    public static void registerBiomes() {
        Regions.register(new OverworldRegion(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "snsnf_overworld"), 20));
    }

    public static void bootstrap(BootstrapContext<Biome> context) {
        var carver = context.lookup(Registries.CONFIGURED_CARVER);
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, CINNAMON_CRAIG, SNSOverworldBiomes.cinnamonCraig(placedFeatures, carver));
        register(context, PEPPERMINT_PLAINS, SNSOverworldBiomes.peppermintPlains(placedFeatures, carver));
    }


    private static void register(BootstrapContext<Biome> context, ResourceKey<Biome> key, Biome biome) {
        context.register(key, biome);
    }

    private static ResourceKey<Biome> registerBiomeKey(String name) {
        return ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, name));
    }
}
