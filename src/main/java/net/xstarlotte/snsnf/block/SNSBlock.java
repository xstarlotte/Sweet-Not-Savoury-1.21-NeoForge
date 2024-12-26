package net.xstarlotte.snsnf.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.custom.teddy.CatTeddyBlock;
import net.xstarlotte.snsnf.block.custom.CandyCaneCropBlock;
import net.xstarlotte.snsnf.item.SNSItem;

import java.util.function.Supplier;

public class SNSBlock {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SNSNF.MOD_ID);

    public static final DeferredBlock<Block> CANDY_CANE_BUSH = registerBlock("candy_cane_bush",
            () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<Block> CANDY_CANE_CARNATION = registerBlock("candy_cane_carnation",
            () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<Block> CANDY_CANE_FLOWER = registerBlock("candy_cane_flower",
            () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<Block> CANDY_CANE_FLOWER_2 = registerBlock("candy_cane_flower_2",
            () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<Block> CANDY_CANE_FLOWER_3 = registerBlock("candy_cane_flower_3",
            () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<Block> CANDY_CANE_FLOWER_4 = registerBlock("candy_cane_flower_4",
            () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<Block> CANDY_CANE_GRASS = registerBlock("candy_cane_grass",
            () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));
    public static final DeferredBlock<Block> CANDY_CANE_GRASS_LONG = registerBlock("candy_cane_grass_long",
            () -> new FlowerBlock(MobEffects.REGENERATION, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)));

    public static final DeferredBlock<Block> CANDY_CANE_CAT_TEDDY = registerBlock("candy_cane_cat_teddy",
            () -> new CatTeddyBlock());
    public static final DeferredBlock<Block> CANDY_CANE_CAT_TEDDY_APPLE = registerBlock("candy_cane_cat_teddy_apple",
            () -> new CatTeddyBlock());
    public static final DeferredBlock<Block> CANDY_CANE_CAT_TEDDY_ICE = registerBlock("candy_cane_cat_teddy_ice",
            () -> new CatTeddyBlock());
    public static final DeferredBlock<Block> CANDY_CANE_CAT_TEDDY_PEPPER = registerBlock("candy_cane_cat_teddy_pepper",
            () -> new CatTeddyBlock());
    public static final DeferredBlock<Block> CANDY_CANE_CAT_TEDDY_SPEAR = registerBlock("candy_cane_cat_teddy_spear",
            () -> new CatTeddyBlock());
    public static final DeferredBlock<Block> CANDY_CANE_CAT_TEDDY_WATERMELON = registerBlock("candy_cane_cat_teddy_watermelon",
            () -> new CatTeddyBlock());


    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE = registerBlock("candy_cane_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE_BUTTON = registerBlock("candy_cane_cobblestone_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE_COAL_ORE = registerBlock("candy_cane_cobblestone_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE_DOOR = registerBlock("candy_cane_cobblestone_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE_PRESSURE_PLATE = registerBlock("candy_cane_cobblestone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE_SLAB = registerBlock("candy_cane_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE_STAIRS = registerBlock("candy_cane_cobblestone_stairs",
            () -> new StairBlock(SNSBlock.CANDY_CANE_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE_TRAPDOOR = registerBlock("candy_cane_cobblestone_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> CANDY_CANE_COBBLESTONE_WALL = registerBlock("candy_cane_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CANDY_CANE_SUGAR_CANE = BLOCKS.register("candy_cane_sugar_cane",
            () -> new CandyCaneCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUGAR_CANE)));

    public static final DeferredBlock<Block> MINT_HUMBUG_CAT_TEDDY = registerBlock("mint_humbug_cat_teddy",
            () -> new CatTeddyBlock());

    public static final DeferredBlock<Block> POTTED_CANDY_CANE_BUSH = BLOCKS.register("potted_candy_cane_bush",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_BUSH, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> POTTED_CANDY_CANE_CARNATION = BLOCKS.register("potted_candy_cane_carnation",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_CARNATION, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> POTTED_CANDY_CANE_FLOWER = BLOCKS.register("potted_candy_cane_flower",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_FLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> POTTED_CANDY_CANE_FLOWER_2 = BLOCKS.register("potted_candy_cane_flower_2",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_FLOWER_2, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> POTTED_CANDY_CANE_FLOWER_3 = BLOCKS.register("potted_candy_cane_flower_3",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_FLOWER_3, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> POTTED_CANDY_CANE_FLOWER_4 = BLOCKS.register("potted_candy_cane_flower_4",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_FLOWER_4, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> POTTED_CANDY_CANE_GRASS = BLOCKS.register("potted_candy_cane_grass",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_GRASS, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));
    public static final DeferredBlock<Block> POTTED_CANDY_CANE_GRASS_LONG = BLOCKS.register("potted_candy_cane_grass_long",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), CANDY_CANE_GRASS_LONG, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_DANDELION)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        SNSItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
