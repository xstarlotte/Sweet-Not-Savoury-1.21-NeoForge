package net.xstarlotte.snsnf.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
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
                .add(SNSBlock.CANDY_CANE_BRICK.get())
                .add(SNSBlock.CANDY_CANE_BRICK_BUTTON.get())
                .add(SNSBlock.CANDY_CANE_BRICK_DOOR.get())
                .add(SNSBlock.CANDY_CANE_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.CANDY_CANE_BRICK_SLAB.get())
                .add(SNSBlock.CANDY_CANE_BRICK_STAIRS.get())
                .add(SNSBlock.CANDY_CANE_BRICK_TRAPDOOR.get())
                .add(SNSBlock.CANDY_CANE_BRICK_WALL.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_DOOR.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_SLAB.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_WALL.get())

                .add(SNSBlock.HUMBUG_BRICK.get())
                .add(SNSBlock.HUMBUG_BRICK_BUTTON.get())
                .add(SNSBlock.HUMBUG_BRICK_DOOR.get())
                .add(SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.HUMBUG_BRICK_SLAB.get())
                .add(SNSBlock.HUMBUG_BRICK_STAIRS.get())
                .add(SNSBlock.HUMBUG_BRICK_TRAPDOOR.get())
                .add(SNSBlock.HUMBUG_BRICK_WALL.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_BUTTON.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_DOOR.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_PRESSURE_PLATE.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_SLAB.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_STAIRS.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_TRAPDOOR.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_WALL.get())

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
                .add(SNSBlock.CANDY_CANE_BRICK.get())
                .add(SNSBlock.CANDY_CANE_BRICK_BUTTON.get())
                .add(SNSBlock.CANDY_CANE_BRICK_DOOR.get())
                .add(SNSBlock.CANDY_CANE_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.CANDY_CANE_BRICK_SLAB.get())
                .add(SNSBlock.CANDY_CANE_BRICK_STAIRS.get())
                .add(SNSBlock.CANDY_CANE_BRICK_TRAPDOOR.get())
                .add(SNSBlock.CANDY_CANE_BRICK_WALL.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_DOOR.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_SLAB.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_WALL.get())

                .add(SNSBlock.HUMBUG_BRICK.get())
                .add(SNSBlock.HUMBUG_BRICK_BUTTON.get())
                .add(SNSBlock.HUMBUG_BRICK_DOOR.get())
                .add(SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE.get())
                .add(SNSBlock.HUMBUG_BRICK_SLAB.get())
                .add(SNSBlock.HUMBUG_BRICK_STAIRS.get())
                .add(SNSBlock.HUMBUG_BRICK_TRAPDOOR.get())
                .add(SNSBlock.HUMBUG_BRICK_WALL.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_BUTTON.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_DOOR.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_PRESSURE_PLATE.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_SLAB.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_STAIRS.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_TRAPDOOR.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_WALL.get())

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
                .add(SNSBlock.MINT_BRICK_WALL.get());;



        tag(BlockTags.WALLS)
                .add(SNSBlock.CANDY_CANE_BRICK_WALL.get())
                .add(SNSBlock.CANDY_CANE_COBBLESTONE_WALL.get())
                .add(SNSBlock.HUMBUG_BRICK_WALL.get())
                .add(SNSBlock.HUMBUG_COBBLESTONE_WALL.get())
                .add(SNSBlock.MINT_BLOCK_WALL.get())
                .add(SNSBlock.MINT_BRICK_WALL.get());
    }
}
