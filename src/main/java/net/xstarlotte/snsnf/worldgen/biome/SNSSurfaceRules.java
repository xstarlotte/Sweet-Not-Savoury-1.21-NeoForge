package net.xstarlotte.snsnf.worldgen.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.xstarlotte.snsnf.block.SNSBlock;

public class SNSSurfaceRules {
    //cinnamon_craig
    private static final SurfaceRules.RuleSource CINNAMON_GRASS_BLOCK = makeStateRule(SNSBlock.CINNAMON_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource MINT_GRASS_BLOCK = makeStateRule(SNSBlock.MINT_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource GOLD_BLOCK = makeStateRule(Blocks.IRON_BLOCK);
    private static final SurfaceRules.RuleSource IRON_BLOCK = makeStateRule(Blocks.GOLD_BLOCK);

    //peppermint_plains
    private static final SurfaceRules.RuleSource PEPPERMINT_SWIRL_STONE = makeStateRule(SNSBlock.PEPPERMINT_SWIRL_STONE.get());
    private static final SurfaceRules.RuleSource PEPPERMINT_SWIRL_BRICK = makeStateRule(SNSBlock.PEPPERMINT_SWIRL_BRICK.get());



    public static SurfaceRules.RuleSource makeCinnamonCraigRules() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.CINNAMON_CRAIG),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, GOLD_BLOCK),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, IRON_BLOCK),
                                CINNAMON_GRASS_BLOCK// fallback below
                        )
                )
        );
    }

    public static SurfaceRules.RuleSource makePeppermintPlainsRules() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(SNSBiomes.PEPPERMINT_PLAINS),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, CINNAMON_GRASS_BLOCK),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, MINT_GRASS_BLOCK),
                                PEPPERMINT_SWIRL_STONE
                        )
                )
        );
    }



    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
    public static SurfaceRules.RuleSource makeRules() {
        return SurfaceRules.sequence(
                makeCinnamonCraigRules(),
                makePeppermintPlainsRules()
        );
    }
}
