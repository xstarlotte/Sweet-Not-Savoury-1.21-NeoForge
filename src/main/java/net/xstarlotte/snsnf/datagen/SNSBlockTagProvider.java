package net.xstarlotte.snsnf.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import org.jetbrains.annotations.Nullable;
import java.util.concurrent.CompletableFuture;

public class SNSBlockTagProvider extends BlockTagsProvider {
    public SNSBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SNSNF.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.CROPS)

                .add(SNSBlock.CANDY_CANE_SUGAR_CANE.get());

        this.tag(BlockTags.FENCES)
                .add(SNSBlock.CANDYFLOSS_FENCE.get())
                .add(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE.get())
                .add(SNSBlock.CANDY_CANE_PLANK_FENCE.get())
                .add(SNSBlock.CHOCOLATE_BRICK_FENCE.get())
                .add(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE.get())
                .add(SNSBlock.GUMMY_APPLE_FENCE.get())
                .add(SNSBlock.GUMMY_BANANA_FENCE.get())
                .add(SNSBlock.GUMMY_BLACKBERRY_FENCE.get())
                .add(SNSBlock.GUMMY_BLUEBERRY_FENCE.get())
                .add(SNSBlock.GUMMY_RASPBERRY_FENCE.get())
                .add(SNSBlock.GUMMY_STRAWBERRY_FENCE.get())
                .add(SNSBlock.WAFFLE_FENCE.get())
                .add(SNSBlock.WAFFLE_BRICK_FENCE.get())
        ;

        this.tag(BlockTags.FENCE_GATES)
                .add(SNSBlock.CANDYFLOSS_FENCE_GATE.get())
                .add(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE_GATE.get())
                .add(SNSBlock.CANDY_CANE_PLANK_FENCE_GATE.get())
                .add(SNSBlock.CHOCOLATE_BRICK_FENCE_GATE.get())
                .add(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE_GATE.get())
                .add(SNSBlock.GUMMY_APPLE_FENCE_GATE.get())
                .add(SNSBlock.GUMMY_BANANA_FENCE_GATE.get())
                .add(SNSBlock.GUMMY_BLACKBERRY_FENCE_GATE.get())
                .add(SNSBlock.GUMMY_BLUEBERRY_FENCE_GATE.get())
                .add(SNSBlock.GUMMY_RASPBERRY_FENCE_GATE.get())
                .add(SNSBlock.GUMMY_STRAWBERRY_FENCE_GATE.get())
                .add(SNSBlock.WAFFLE_FENCE_GATE.get())
                .add(SNSBlock.WAFFLE_BRICK_FENCE_GATE.get())
        ;

        this.tag(BlockTags.FLOWERS)

                .add(SNSBlock.CANDY_CANE_BUSH.get())
                .add(SNSBlock.CANDY_CANE_CARNATION.get())
                .add(SNSBlock.CANDY_CANE_FLOWER.get())
                .add(SNSBlock.CANDY_CANE_FLOWER_2.get())
                .add(SNSBlock.CANDY_CANE_FLOWER_3.get())
                .add(SNSBlock.CANDY_CANE_FLOWER_4.get())
                .add(SNSBlock.CANDY_CANE_GRASS.get())
                .add(SNSBlock.CANDY_CANE_GRASS_LONG.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)

                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_BUTTON.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_DOOR.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_SLAB.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_STAIRS.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_TRAPDOOR.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_WALL.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_BUTTON.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_COAL_ORE.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_DOOR.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_PRESSURE_PLATE.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_SLAB.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_STAIRS.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_TRAPDOOR.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_WALL.get())

                .add(SNSBlock.HUMBUG_BRICK.get())
                .add(SNSBlock.HUMBUG_BRICK_BUTTON.get())
                .add(SNSBlock.HUMBUG_BRICK_DOOR.get())
                .add(SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.HUMBUG_BRICK_SLAB.get())
                .add(SNSBlock.HUMBUG_BRICK_STAIRS.get())
                .add(SNSBlock.HUMBUG_BRICK_TRAPDOOR.get())
                .add(SNSBlock.HUMBUG_BRICK_WALL.get())

                .add(SNSBlock.MINT_BLOCK.get())
                .add(SNSBlock.MINT_BLOCK_BUTTON.get())
                .add(SNSBlock.MINT_BLOCK_DOOR.get())
                .add(SNSBlock.MINT_BLOCK_PRESSURE_PLATE.get())
                .add(SNSBlock.MINT_BLOCK_SLAB.get())
                .add(SNSBlock.MINT_BLOCK_STAIRS.get())
                .add(SNSBlock.MINT_BLOCK_TRAPDOOR.get())
                .add(SNSBlock.MINT_BLOCK_WALL.get())
                .add(SNSBlock.MINT_BRICK.get())
                .add(SNSBlock.MINT_BRICK_BUTTON.get())
                .add(SNSBlock.MINT_BRICK_DOOR.get())
                .add(SNSBlock.MINT_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.MINT_BRICK_SLAB.get())
                .add(SNSBlock.MINT_BRICK_STAIRS.get())
                .add(SNSBlock.MINT_BRICK_TRAPDOOR.get())
                .add(SNSBlock.MINT_BRICK_WALL.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)

                .add(SNSBlock.HUMBUG_BRICK.get())
                .add(SNSBlock.HUMBUG_BRICK_BUTTON.get())
                .add(SNSBlock.HUMBUG_BRICK_DOOR.get())
                .add(SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.HUMBUG_BRICK_SLAB.get())
                .add(SNSBlock.HUMBUG_BRICK_STAIRS.get())
                .add(SNSBlock.HUMBUG_BRICK_TRAPDOOR.get())
                .add(SNSBlock.HUMBUG_BRICK_WALL.get())

                .add(SNSBlock.MINT_BLOCK.get())
                .add(SNSBlock.MINT_BLOCK_BUTTON.get())
                .add(SNSBlock.MINT_BLOCK_DOOR.get())
                .add(SNSBlock.MINT_BLOCK_PRESSURE_PLATE.get())
                .add(SNSBlock.MINT_BLOCK_SLAB.get())
                .add(SNSBlock.MINT_BLOCK_STAIRS.get())
                .add(SNSBlock.MINT_BLOCK_TRAPDOOR.get())
                .add(SNSBlock.MINT_BLOCK_WALL.get())
                .add(SNSBlock.MINT_BRICK.get())
                .add(SNSBlock.MINT_BRICK_BUTTON.get())
                .add(SNSBlock.MINT_BRICK_DOOR.get())
                .add(SNSBlock.MINT_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.MINT_BRICK_SLAB.get())
                .add(SNSBlock.MINT_BRICK_STAIRS.get())
                .add(SNSBlock.MINT_BRICK_TRAPDOOR.get())
                .add(SNSBlock.MINT_BRICK_WALL.get())

                 .add(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_BUTTON.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_DOOR.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_SLAB.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_STAIRS.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_TRAPDOOR.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_WALL.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_BUTTON.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_COAL_ORE.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_DOOR.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_PRESSURE_PLATE.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_SLAB.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_STAIRS.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_TRAPDOOR.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_WALL.get());;



        tag(BlockTags.WALLS)

                .add(SNSBlock.CANDYFLOSS_WALL.get())
                .add(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_WALL.get())
                .add(SNSBlock.CANDY_CANE_PLANK_WALL.get())
                .add(SNSBlock.CHOCOLATE_BRICK_WALL.get())
                .add(SNSBlock.CHOCOLATE_WHITE_BRICK_WALL.get())
                .add(SNSBlock.GUMMY_APPLE_WALL.get())
                .add(SNSBlock.GUMMY_BANANA_WALL.get())
                .add(SNSBlock.GUMMY_BLACKBERRY_WALL.get())
                .add(SNSBlock.GUMMY_BLUEBERRY_WALL.get())
                .add(SNSBlock.GUMMY_RASPBERRY_WALL.get())
                .add(SNSBlock.GUMMY_STRAWBERRY_WALL.get())
                .add(SNSBlock.HUMBUG_BRICK_WALL.get())
                .add(SNSBlock.MINT_BLOCK_WALL.get())
                .add(SNSBlock.MINT_BRICK_WALL.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_BRICK_WALL.get())
                .add(SNSBlock.PEPPERMINT_SWIRL_STONE_WALL.get())
                .add(SNSBlock.WAFFLE_WALL.get())
                .add(SNSBlock.WAFFLE_BRICK_WALL.get());
    }
}
