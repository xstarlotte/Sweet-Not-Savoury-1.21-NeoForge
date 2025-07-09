package net.xstarlotte.snsnf.datagen;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.item.SNSItem;

import java.util.Set;

public class SNSBlockLootTableProvider extends BlockLootSubProvider {
    protected SNSBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }
    @Override
    protected void generate() {




        dropSelf(SNSBlock.CANDYFLOSS_BLOCK.get());
        dropSelf(SNSBlock.CANDYFLOSS_BUTTON.get());
        this.add(SNSBlock.CANDYFLOSS_DOOR.get(),
                block -> createDoorTable(SNSBlock.CANDYFLOSS_DOOR.get()));
        dropSelf(SNSBlock.CANDYFLOSS_FENCE.get());
        dropSelf(SNSBlock.CANDYFLOSS_FENCE_GATE.get());
        dropSelf(SNSBlock.CANDYFLOSS_PRESSURE_PLATE.get());
        this.add(SNSBlock.CANDYFLOSS_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.CANDYFLOSS_SLAB.get()));
        dropSelf(SNSBlock.CANDYFLOSS_STAIRS.get());
        dropSelf(SNSBlock.CANDYFLOSS_TRAPDOOR.get());
        dropSelf(SNSBlock.CANDYFLOSS_WALL.get());

        dropSelf(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get());
        dropSelf(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BUTTON.get());
        this.add(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_DOOR.get(),
                block -> createDoorTable(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_DOOR.get()));
        dropSelf(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE.get());
        dropSelf(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE_GATE.get());
        dropSelf(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_PRESSURE_PLATE.get());
        this.add(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_SLAB.get()));
        dropSelf(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_STAIRS.get());
        dropSelf(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_TRAPDOOR.get());
        dropSelf(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_WALL.get());

        dropSelf(SNSBlock.CANDY_CANE_BUSH.get());
        dropSelf(SNSBlock.CANDY_CANE_CARNATION.get());
        dropSelf(SNSBlock.CANDY_CANE_CAT_TEDDY.get());
        dropSelf(SNSBlock.CANDY_CANE_FLOWER.get());
        dropSelf(SNSBlock.CANDY_CANE_FLOWER_2.get());
        dropSelf(SNSBlock.CANDY_CANE_FLOWER_3.get());
        dropSelf(SNSBlock.CANDY_CANE_FLOWER_4.get());
        dropSelf(SNSBlock.CANDY_CANE_GRASS.get());
        dropSelf(SNSBlock.CANDY_CANE_GRASS_LONG.get());
        dropSelf(SNSBlock.CANDY_CANE_LOG.get());
        dropSelf(SNSBlock.CANDY_CANE_PLANKS.get());
        dropSelf(SNSBlock.CANDY_CANE_PLANK_BUTTON.get());
        this.add(SNSBlock.CANDY_CANE_PLANK_DOOR.get(),
                block -> createDoorTable(SNSBlock.CANDY_CANE_PLANK_DOOR.get()));
        dropSelf(SNSBlock.CANDY_CANE_PLANK_FENCE.get());
        dropSelf(SNSBlock.CANDY_CANE_PLANK_FENCE_GATE.get());
        dropSelf(SNSBlock.CANDY_CANE_PLANK_PRESSURE_PLATE.get());
        this.add(SNSBlock.CANDY_CANE_PLANK_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.CANDY_CANE_PLANK_SLAB.get()));
        dropSelf(SNSBlock.CANDY_CANE_PLANK_STAIRS.get());
        dropSelf(SNSBlock.CANDY_CANE_PLANK_TRAPDOOR.get());
        dropSelf(SNSBlock.CANDY_CANE_PLANK_WALL.get());
        dropOther(SNSBlock.CANDY_CANE_SUGAR_CANE.get(), SNSItem.CANDY_CANE_SUGAR_CANE);


        dropSelf(SNSBlock.CINNAMON_GRASS_BLOCK.get());

        dropSelf(SNSBlock.CHOCOLATE_BRICKS.get());
        dropSelf(SNSBlock.CHOCOLATE_BRICK_BUTTON.get());
        this.add(SNSBlock.CHOCOLATE_BRICK_DOOR.get(),
                block -> createDoorTable(SNSBlock.CHOCOLATE_BRICK_DOOR.get()));
        dropSelf(SNSBlock.CHOCOLATE_BRICK_FENCE.get());
        dropSelf(SNSBlock.CHOCOLATE_BRICK_FENCE_GATE.get());
        dropSelf(SNSBlock.CHOCOLATE_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlock.CHOCOLATE_BRICK_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.CHOCOLATE_BRICK_SLAB.get()));
        dropSelf(SNSBlock.CHOCOLATE_BRICK_STAIRS.get());
        dropSelf(SNSBlock.CHOCOLATE_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlock.CHOCOLATE_BRICK_WALL.get());

        dropSelf(SNSBlock.CHOCOLATE_WHITE_BRICKS.get());
        dropSelf(SNSBlock.CHOCOLATE_WHITE_BRICK_BUTTON.get());
        this.add(SNSBlock.CHOCOLATE_WHITE_BRICK_DOOR.get(),
                block -> createDoorTable(SNSBlock.CHOCOLATE_WHITE_BRICK_DOOR.get()));
        dropSelf(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE.get());
        dropSelf(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE_GATE.get());
        dropSelf(SNSBlock.CHOCOLATE_WHITE_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlock.CHOCOLATE_WHITE_BRICK_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.CHOCOLATE_WHITE_BRICK_SLAB.get()));
        dropSelf(SNSBlock.CHOCOLATE_WHITE_BRICK_STAIRS.get());
        dropSelf(SNSBlock.CHOCOLATE_WHITE_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlock.CHOCOLATE_WHITE_BRICK_WALL.get());

        dropSelf(SNSBlock.GUMMY_APPLE_BLOCK.get());
        dropSelf(SNSBlock.GUMMY_APPLE_BUTTON.get());
        this.add(SNSBlock.GUMMY_APPLE_DOOR.get(),
                block -> createDoorTable(SNSBlock.GUMMY_APPLE_DOOR.get()));
        dropSelf(SNSBlock.GUMMY_APPLE_FENCE.get());
        dropSelf(SNSBlock.GUMMY_APPLE_FENCE_GATE.get());
        dropSelf(SNSBlock.GUMMY_APPLE_PRESSURE_PLATE.get());
        this.add(SNSBlock.GUMMY_APPLE_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.GUMMY_APPLE_SLAB.get()));
        dropSelf(SNSBlock.GUMMY_APPLE_STAIRS.get());
        dropSelf(SNSBlock.GUMMY_APPLE_TRAPDOOR.get());
        dropSelf(SNSBlock.GUMMY_APPLE_WALL.get());

        dropSelf(SNSBlock.GUMMY_BANANA_BLOCK.get());
        dropSelf(SNSBlock.GUMMY_BANANA_BUTTON.get());
        this.add(SNSBlock.GUMMY_BANANA_DOOR.get(),
                block -> createDoorTable(SNSBlock.GUMMY_BANANA_DOOR.get()));
        dropSelf(SNSBlock.GUMMY_BANANA_FENCE.get());
        dropSelf(SNSBlock.GUMMY_BANANA_FENCE_GATE.get());
        dropSelf(SNSBlock.GUMMY_BANANA_PRESSURE_PLATE.get());
        this.add(SNSBlock.GUMMY_BANANA_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.GUMMY_BANANA_SLAB.get()));
        dropSelf(SNSBlock.GUMMY_BANANA_STAIRS.get());
        dropSelf(SNSBlock.GUMMY_BANANA_TRAPDOOR.get());
        dropSelf(SNSBlock.GUMMY_BANANA_WALL.get());

        dropSelf(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get());
        dropSelf(SNSBlock.GUMMY_BLACKBERRY_BUTTON.get());
        this.add(SNSBlock.GUMMY_BLACKBERRY_DOOR.get(),
                block -> createDoorTable(SNSBlock.GUMMY_BLACKBERRY_DOOR.get()));
        dropSelf(SNSBlock.GUMMY_BLACKBERRY_FENCE.get());
        dropSelf(SNSBlock.GUMMY_BLACKBERRY_FENCE_GATE.get());
        dropSelf(SNSBlock.GUMMY_BLACKBERRY_PRESSURE_PLATE.get());
        this.add(SNSBlock.GUMMY_BLACKBERRY_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.GUMMY_BLACKBERRY_SLAB.get()));
        dropSelf(SNSBlock.GUMMY_BLACKBERRY_STAIRS.get());
        dropSelf(SNSBlock.GUMMY_BLACKBERRY_TRAPDOOR.get());
        dropSelf(SNSBlock.GUMMY_BLACKBERRY_WALL.get());

        dropSelf(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get());
        dropSelf(SNSBlock.GUMMY_BLUEBERRY_BUTTON.get());
        this.add(SNSBlock.GUMMY_BLUEBERRY_DOOR.get(),
                block -> createDoorTable(SNSBlock.GUMMY_BLUEBERRY_DOOR.get()));
        dropSelf(SNSBlock.GUMMY_BLUEBERRY_FENCE.get());
        dropSelf(SNSBlock.GUMMY_BLUEBERRY_FENCE_GATE.get());
        dropSelf(SNSBlock.GUMMY_BLUEBERRY_PRESSURE_PLATE.get());
        this.add(SNSBlock.GUMMY_BLUEBERRY_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.GUMMY_BLUEBERRY_SLAB.get()));
        dropSelf(SNSBlock.GUMMY_BLUEBERRY_STAIRS.get());
        dropSelf(SNSBlock.GUMMY_BLUEBERRY_TRAPDOOR.get());
        dropSelf(SNSBlock.GUMMY_BLUEBERRY_WALL.get());

        dropSelf(SNSBlock.GUMMY_RASPBERRY_BLOCK.get());
        dropSelf(SNSBlock.GUMMY_RASPBERRY_BUTTON.get());
        this.add(SNSBlock.GUMMY_RASPBERRY_DOOR.get(),
                block -> createDoorTable(SNSBlock.GUMMY_RASPBERRY_DOOR.get()));
        dropSelf(SNSBlock.GUMMY_RASPBERRY_FENCE.get());
        dropSelf(SNSBlock.GUMMY_RASPBERRY_FENCE_GATE.get());
        dropSelf(SNSBlock.GUMMY_RASPBERRY_PRESSURE_PLATE.get());
        this.add(SNSBlock.GUMMY_RASPBERRY_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.GUMMY_RASPBERRY_SLAB.get()));
        dropSelf(SNSBlock.GUMMY_RASPBERRY_STAIRS.get());
        dropSelf(SNSBlock.GUMMY_RASPBERRY_TRAPDOOR.get());
        dropSelf(SNSBlock.GUMMY_RASPBERRY_WALL.get());

        dropSelf(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get());
        dropSelf(SNSBlock.GUMMY_STRAWBERRY_BUTTON.get());
        this.add(SNSBlock.GUMMY_STRAWBERRY_DOOR.get(),
                block -> createDoorTable(SNSBlock.GUMMY_STRAWBERRY_DOOR.get()));
        dropSelf(SNSBlock.GUMMY_STRAWBERRY_FENCE.get());
        dropSelf(SNSBlock.GUMMY_STRAWBERRY_FENCE_GATE.get());
        dropSelf(SNSBlock.GUMMY_STRAWBERRY_PRESSURE_PLATE.get());
        this.add(SNSBlock.GUMMY_STRAWBERRY_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.GUMMY_STRAWBERRY_SLAB.get()));
        dropSelf(SNSBlock.GUMMY_STRAWBERRY_STAIRS.get());
        dropSelf(SNSBlock.GUMMY_STRAWBERRY_TRAPDOOR.get());
        dropSelf(SNSBlock.GUMMY_STRAWBERRY_WALL.get());

        dropSelf(SNSBlock.HUMBUG_BRICK.get());
        dropSelf(SNSBlock.HUMBUG_BRICK_BUTTON.get());
        this.add(SNSBlock.HUMBUG_BRICK_DOOR.get(),
                block -> createDoorTable(SNSBlock.HUMBUG_BRICK_DOOR.get()));
        dropSelf(SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlock.HUMBUG_BRICK_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.HUMBUG_BRICK_SLAB.get()));
        dropSelf(SNSBlock.HUMBUG_BRICK_STAIRS.get());
        dropSelf(SNSBlock.HUMBUG_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlock.HUMBUG_BRICK_WALL.get());

        dropSelf(SNSBlock.MINT_BLOCK.get());
        dropSelf(SNSBlock.MINT_BLOCK_BUTTON.get());
        this.add(SNSBlock.MINT_BLOCK_DOOR.get(),
                block -> createDoorTable(SNSBlock.MINT_BLOCK_DOOR.get()));
        dropSelf(SNSBlock.MINT_BLOCK_PRESSURE_PLATE.get());
        this.add(SNSBlock.MINT_BLOCK_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.MINT_BLOCK_SLAB.get()));
        dropSelf(SNSBlock.MINT_BLOCK_STAIRS.get());
        dropSelf(SNSBlock.MINT_BLOCK_TRAPDOOR.get());
        dropSelf(SNSBlock.MINT_BLOCK_WALL.get());
        dropSelf(SNSBlock.MINT_BRICK.get());
        dropSelf(SNSBlock.MINT_BRICK_BUTTON.get());
        this.add(SNSBlock.MINT_BRICK_DOOR.get(),
                block -> createDoorTable(SNSBlock.MINT_BRICK_DOOR.get()));
        dropSelf(SNSBlock.MINT_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlock.MINT_BRICK_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.MINT_BRICK_SLAB.get()));
        dropSelf(SNSBlock.MINT_BRICK_STAIRS.get());
        dropSelf(SNSBlock.MINT_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlock.MINT_BRICK_WALL.get());
        dropSelf(SNSBlock.MINT_GRASS_BLOCK.get());

        dropSelf(SNSBlock.PEPPERMINT_SWIRL_BRICK.get());
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_BRICK_BUTTON.get());
        this.add(SNSBlock.PEPPERMINT_SWIRL_BRICK_DOOR.get(),
                block -> createDoorTable(SNSBlock.PEPPERMINT_SWIRL_BRICK_DOOR.get()));
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlock.PEPPERMINT_SWIRL_BRICK_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.PEPPERMINT_SWIRL_BRICK_SLAB.get()));
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_BRICK_STAIRS.get());
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_BRICK_WALL.get());

        dropSelf(SNSBlock.PEPPERMINT_SWIRL_STONE.get());
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_STONE_BUTTON.get());
        this.add(SNSBlock.PEPPERMINT_SWIRL_STONE_COAL_ORE.get(),
                block -> createMultipleOreDrops(SNSBlock.PEPPERMINT_SWIRL_STONE_COAL_ORE.get(), Items.COAL, 2, 5));
        this.add(SNSBlock.PEPPERMINT_SWIRL_STONE_DOOR.get(),
                block -> createDoorTable(SNSBlock.PEPPERMINT_SWIRL_STONE_DOOR.get()));
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_STONE_PRESSURE_PLATE.get());
        this.add(SNSBlock.PEPPERMINT_SWIRL_STONE_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.PEPPERMINT_SWIRL_STONE_SLAB.get()));
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_STONE_STAIRS.get());
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_STONE_TRAPDOOR.get());
        dropSelf(SNSBlock.PEPPERMINT_SWIRL_STONE_WALL.get());

        this.add(SNSBlock.POTTED_CANDY_CANE_BUSH.get(), createPotFlowerItemTable(SNSBlock.CANDY_CANE_BUSH));
        this.add(SNSBlock.POTTED_CANDY_CANE_CARNATION.get(), createPotFlowerItemTable(SNSBlock.CANDY_CANE_CARNATION));
        this.add(SNSBlock.POTTED_CANDY_CANE_FLOWER.get(), createPotFlowerItemTable(SNSBlock.CANDY_CANE_FLOWER));
        this.add(SNSBlock.POTTED_CANDY_CANE_FLOWER_2.get(), createPotFlowerItemTable(SNSBlock.CANDY_CANE_FLOWER_2));
        this.add(SNSBlock.POTTED_CANDY_CANE_FLOWER_3.get(), createPotFlowerItemTable(SNSBlock.CANDY_CANE_FLOWER_3));
        this.add(SNSBlock.POTTED_CANDY_CANE_FLOWER_4.get(), createPotFlowerItemTable(SNSBlock.CANDY_CANE_FLOWER_4));
        this.add(SNSBlock.POTTED_CANDY_CANE_GRASS.get(), createPotFlowerItemTable(SNSBlock.CANDY_CANE_GRASS));
        this.add(SNSBlock.POTTED_CANDY_CANE_GRASS_LONG.get(), createPotFlowerItemTable(SNSBlock.CANDY_CANE_GRASS_LONG));

        dropSelf(SNSBlock.WAFFLE_BLOCK.get());
        dropSelf(SNSBlock.WAFFLE_BUTTON.get());
        this.add(SNSBlock.WAFFLE_DOOR.get(),
                block -> createDoorTable(SNSBlock.WAFFLE_DOOR.get()));
        dropSelf(SNSBlock.WAFFLE_FENCE.get());
        dropSelf(SNSBlock.WAFFLE_FENCE_GATE.get());
        dropSelf(SNSBlock.WAFFLE_PRESSURE_PLATE.get());
        this.add(SNSBlock.WAFFLE_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.WAFFLE_SLAB.get()));
        dropSelf(SNSBlock.WAFFLE_STAIRS.get());
        dropSelf(SNSBlock.WAFFLE_TRAPDOOR.get());
        dropSelf(SNSBlock.WAFFLE_WALL.get());

        dropSelf(SNSBlock.WAFFLE_BRICKS.get());
        dropSelf(SNSBlock.WAFFLE_BRICK_BUTTON.get());
        this.add(SNSBlock.WAFFLE_BRICK_DOOR.get(),
                block -> createDoorTable(SNSBlock.WAFFLE_BRICK_DOOR.get()));
        dropSelf(SNSBlock.WAFFLE_BRICK_FENCE.get());
        dropSelf(SNSBlock.WAFFLE_BRICK_FENCE_GATE.get());
        dropSelf(SNSBlock.WAFFLE_BRICK_PRESSURE_PLATE.get());
        this.add(SNSBlock.WAFFLE_BRICK_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.WAFFLE_BRICK_SLAB.get()));
        dropSelf(SNSBlock.WAFFLE_BRICK_STAIRS.get());
        dropSelf(SNSBlock.WAFFLE_BRICK_TRAPDOOR.get());
        dropSelf(SNSBlock.WAFFLE_BRICK_WALL.get());

    }
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SNSBlock.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
