package net.xstarlotte.snsnf.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
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



    public static final DeferredBlock<Block> CANDYFLOSS_BLOCK = registerBlock("candyfloss_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_BUTTON = registerBlock("candyfloss_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> CANDYFLOSS_DOOR = registerBlock("candyfloss_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_FENCE = registerBlock("candyfloss_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_FENCE_GATE = registerBlock("candyfloss_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_PRESSURE_PLATE = registerBlock("candyfloss_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_SLAB = registerBlock("candyfloss_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_STAIRS = registerBlock("candyfloss_stairs",
            () -> new StairBlock(SNSBlock.CANDYFLOSS_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_TRAPDOOR = registerBlock("candyfloss_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CANDYFLOSS_WALL = registerBlock("candyfloss_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_BLOCK = registerBlock("candyfloss_blue_raspberry_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_BUTTON = registerBlock("candyfloss_blue_raspberry_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_DOOR = registerBlock("candyfloss_blue_raspberry_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_FENCE = registerBlock("candyfloss_blue_raspberry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_FENCE_GATE = registerBlock("candyfloss_blue_raspberry_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_PRESSURE_PLATE = registerBlock("candyfloss_blue_raspberry_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_SLAB = registerBlock("candyfloss_blue_raspberry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_STAIRS = registerBlock("candyfloss_blue_raspberry_stairs",
            () -> new StairBlock(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_TRAPDOOR = registerBlock("candyfloss_blue_raspberry_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CANDYFLOSS_BLUE_RASPBERRY_WALL = registerBlock("candyfloss_blue_raspberry_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

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

    public static final DeferredBlock<Block> CANDY_CANE_LOG = registerBlock("candy_cane_log",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDY_CANE_PLANKS = registerBlock("candy_cane_planks",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_BUTTON = registerBlock("candy_cane_plank_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_DOOR = registerBlock("candy_cane_plank_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_FENCE = registerBlock("candy_cane_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_FENCE_GATE = registerBlock("candy_cane_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_PRESSURE_PLATE = registerBlock("candy_cane_plank_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_SLAB = registerBlock("candy_cane_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_STAIRS = registerBlock("candy_cane_plank_stairs",
            () -> new StairBlock(SNSBlock.CANDY_CANE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_TRAPDOOR = registerBlock("candy_cane_plank_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CANDY_CANE_PLANK_WALL = registerBlock("candy_cane_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final DeferredBlock<Block> CANDY_CANE_CAT_TEDDY = registerBlock("candy_cane_cat_teddy",
            () -> new CatTeddyBlock());

    public static final DeferredBlock<Block> CANDY_CANE_SUGAR_CANE = BLOCKS.register("candy_cane_sugar_cane",
            () -> new CandyCaneCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SUGAR_CANE)));

    public static final DeferredBlock<Block> GUMMY_APPLE_BLOCK = registerBlock("gummy_apple_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_APPLE_BUTTON = registerBlock("gummy_apple_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> GUMMY_APPLE_DOOR = registerBlock("gummy_apple_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_APPLE_FENCE = registerBlock("gummy_apple_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_APPLE_FENCE_GATE = registerBlock("gummy_apple_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_APPLE_PRESSURE_PLATE = registerBlock("gummy_apple_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_APPLE_SLAB = registerBlock("gummy_apple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_APPLE_STAIRS = registerBlock("gummy_apple_stairs",
            () -> new StairBlock(SNSBlock.GUMMY_APPLE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_APPLE_TRAPDOOR = registerBlock("gummy_apple_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GUMMY_APPLE_WALL = registerBlock("gummy_apple_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final DeferredBlock<Block> GUMMY_BANANA_BLOCK = registerBlock("gummy_banana_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BANANA_BUTTON = registerBlock("gummy_banana_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> GUMMY_BANANA_DOOR = registerBlock("gummy_banana_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BANANA_FENCE = registerBlock("gummy_banana_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BANANA_FENCE_GATE = registerBlock("gummy_banana_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BANANA_PRESSURE_PLATE = registerBlock("gummy_banana_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BANANA_SLAB = registerBlock("gummy_banana_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BANANA_STAIRS = registerBlock("gummy_banana_stairs",
            () -> new StairBlock(SNSBlock.GUMMY_BANANA_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BANANA_TRAPDOOR = registerBlock("gummy_banana_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GUMMY_BANANA_WALL = registerBlock("gummy_banana_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_BLOCK = registerBlock("gummy_blackberry_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_BUTTON = registerBlock("gummy_blackberry_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_DOOR = registerBlock("gummy_blackberry_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_FENCE = registerBlock("gummy_blackberry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_FENCE_GATE = registerBlock("gummy_blackberry_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_PRESSURE_PLATE = registerBlock("gummy_blackberry_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_SLAB = registerBlock("gummy_blackberry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_STAIRS = registerBlock("gummy_blackberry_stairs",
            () -> new StairBlock(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_TRAPDOOR = registerBlock("gummy_blackberry_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GUMMY_BLACKBERRY_WALL = registerBlock("gummy_blackberry_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_BLOCK = registerBlock("gummy_blueberry_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_BUTTON = registerBlock("gummy_blueberry_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_DOOR = registerBlock("gummy_blueberry_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_FENCE = registerBlock("gummy_blueberry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_FENCE_GATE = registerBlock("gummy_blueberry_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_PRESSURE_PLATE = registerBlock("gummy_blueberry_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_SLAB = registerBlock("gummy_blueberry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_STAIRS = registerBlock("gummy_blueberry_stairs",
            () -> new StairBlock(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_TRAPDOOR = registerBlock("gummy_blueberry_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GUMMY_BLUEBERRY_WALL = registerBlock("gummy_blueberry_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final DeferredBlock<Block> GUMMY_RASPBERRY_BLOCK = registerBlock("gummy_raspberry_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_BUTTON = registerBlock("gummy_raspberry_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_DOOR = registerBlock("gummy_raspberry_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_FENCE = registerBlock("gummy_raspberry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_FENCE_GATE = registerBlock("gummy_raspberry_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_PRESSURE_PLATE = registerBlock("gummy_raspberry_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_SLAB = registerBlock("gummy_raspberry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_STAIRS = registerBlock("gummy_raspberry_stairs",
            () -> new StairBlock(SNSBlock.GUMMY_RASPBERRY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_TRAPDOOR = registerBlock("gummy_raspberry_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GUMMY_RASPBERRY_WALL = registerBlock("gummy_raspberry_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_BLOCK = registerBlock("gummy_strawberry_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_BUTTON = registerBlock("gummy_strawberry_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_DOOR = registerBlock("gummy_strawberry_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_FENCE = registerBlock("gummy_strawberry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_FENCE_GATE = registerBlock("gummy_strawberry_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_PRESSURE_PLATE = registerBlock("gummy_strawberry_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_SLAB = registerBlock("gummy_strawberry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_STAIRS = registerBlock("gummy_strawberry_stairs",
            () -> new StairBlock(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_TRAPDOOR = registerBlock("gummy_strawberry_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GUMMY_STRAWBERRY_WALL = registerBlock("gummy_strawberry_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));



    public static final DeferredBlock<Block> CHOCOLATE_BRICKS = registerBlock("chocolate_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_BUTTON = registerBlock("chocolate_brick_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_DOOR = registerBlock("chocolate_brick_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_FENCE = registerBlock("chocolate_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_FENCE_GATE = registerBlock("chocolate_brick_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_PRESSURE_PLATE = registerBlock("chocolate_brick_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_SLAB = registerBlock("chocolate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_STAIRS = registerBlock("chocolate_brick_stairs",
            () -> new StairBlock(SNSBlock.CHOCOLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_TRAPDOOR = registerBlock("chocolate_brick_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> CHOCOLATE_BRICK_WALL = registerBlock("chocolate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICKS = registerBlock("chocolate_white_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_BUTTON = registerBlock("chocolate_white_brick_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_DOOR = registerBlock("chocolate_white_brick_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_FENCE = registerBlock("chocolate_white_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_FENCE_GATE = registerBlock("chocolate_white_brick_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_PRESSURE_PLATE = registerBlock("chocolate_white_brick_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_SLAB = registerBlock("chocolate_white_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_STAIRS = registerBlock("chocolate_white_brick_stairs",
            () -> new StairBlock(SNSBlock.CHOCOLATE_WHITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_TRAPDOOR = registerBlock("chocolate_white_brick_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> CHOCOLATE_WHITE_BRICK_WALL = registerBlock("chocolate_white_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CINNAMON_GRASS_BLOCK = registerBlock("cinnamon_grass_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> HUMBUG_BRICK = registerBlock("humbug_brick",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HUMBUG_BRICK_BUTTON = registerBlock("humbug_brick_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> HUMBUG_BRICK_DOOR = registerBlock("humbug_brick_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> HUMBUG_BRICK_PRESSURE_PLATE = registerBlock("humbug_brick_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HUMBUG_BRICK_SLAB = registerBlock("humbug_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HUMBUG_BRICK_STAIRS = registerBlock("humbug_brick_stairs",
            () -> new StairBlock(SNSBlock.HUMBUG_BRICK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HUMBUG_BRICK_TRAPDOOR = registerBlock("humbug_brick_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> HUMBUG_BRICK_WALL = registerBlock("humbug_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MINT_BLOCK = registerBlock("mint_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> MINT_BLOCK_BUTTON = registerBlock("mint_block_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> MINT_BLOCK_DOOR = registerBlock("mint_block_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> MINT_BLOCK_PRESSURE_PLATE = registerBlock("mint_block_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MINT_BLOCK_SLAB = registerBlock("mint_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MINT_BLOCK_STAIRS = registerBlock("mint_block_stairs",
            () -> new StairBlock(SNSBlock.MINT_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MINT_BLOCK_TRAPDOOR = registerBlock("mint_block_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> MINT_BLOCK_WALL = registerBlock("mint_block_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MINT_BRICK = registerBlock("mint_brick",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> MINT_BRICK_BUTTON = registerBlock("mint_brick_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> MINT_BRICK_DOOR = registerBlock("mint_brick_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> MINT_BRICK_PRESSURE_PLATE = registerBlock("mint_brick_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MINT_BRICK_SLAB = registerBlock("mint_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MINT_BRICK_STAIRS = registerBlock("mint_brick_stairs",
            () -> new StairBlock(SNSBlock.MINT_BRICK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MINT_BRICK_TRAPDOOR = registerBlock("mint_brick_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> MINT_BRICK_WALL = registerBlock("mint_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MINT_GRASS_BLOCK = registerBlock("mint_grass_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(1f)));

    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_BRICK = registerBlock("peppermint_swirl_brick",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_BRICK_BUTTON = registerBlock("peppermint_swirl_brick_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_BRICK_DOOR = registerBlock("peppermint_swirl_brick_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_BRICK_PRESSURE_PLATE = registerBlock("peppermint_swirl_brick_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_BRICK_SLAB = registerBlock("peppermint_swirl_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_BRICK_STAIRS = registerBlock("peppermint_swirl_brick_stairs",
            () -> new StairBlock(SNSBlock.PEPPERMINT_SWIRL_BRICK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_BRICK_TRAPDOOR = registerBlock("peppermint_swirl_brick_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_BRICK_WALL = registerBlock("peppermint_swirl_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE = registerBlock("peppermint_swirl_stone",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE_BUTTON = registerBlock("peppermint_swirl_stone_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE_COAL_ORE = registerBlock("peppermint_swirl_stone_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE_DOOR = registerBlock("peppermint_swirl_stone_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE_PRESSURE_PLATE = registerBlock("peppermint_swirl_stone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE_SLAB = registerBlock("peppermint_swirl_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE_STAIRS = registerBlock("peppermint_swirl_stone_stairs",
            () -> new StairBlock(SNSBlock.PEPPERMINT_SWIRL_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE_TRAPDOOR = registerBlock("peppermint_swirl_stone_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> PEPPERMINT_SWIRL_STONE_WALL = registerBlock("peppermint_swirl_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));





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

    public static final DeferredBlock<Block> WAFFLE_BLOCK = registerBlock("waffle_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_BUTTON = registerBlock("waffle_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(2f).noCollission()));
    public static final DeferredBlock<Block> WAFFLE_DOOR = registerBlock("waffle_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_FENCE = registerBlock("waffle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_FENCE_GATE = registerBlock("waffle_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_PRESSURE_PLATE = registerBlock("waffle_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_SLAB = registerBlock("waffle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_STAIRS = registerBlock("waffle_stairs",
            () -> new StairBlock(SNSBlock.WAFFLE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_TRAPDOOR = registerBlock("waffle_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WAFFLE_WALL = registerBlock("waffle_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final DeferredBlock<Block> WAFFLE_BRICKS = registerBlock("waffle_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> WAFFLE_BRICK_BUTTON = registerBlock("waffle_brick_button",
            () -> new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<Block> WAFFLE_BRICK_DOOR = registerBlock("waffle_brick_door",
            () -> new DoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> WAFFLE_BRICK_FENCE = registerBlock("waffle_brick_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_BRICK_FENCE_GATE = registerBlock("waffle_brick_fence_gate",
            () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2f)));
    public static final DeferredBlock<Block> WAFFLE_BRICK_PRESSURE_PLATE = registerBlock("waffle_brick_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WAFFLE_BRICK_SLAB = registerBlock("waffle_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WAFFLE_BRICK_STAIRS = registerBlock("waffle_brick_stairs",
            () -> new StairBlock(SNSBlock.WAFFLE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WAFFLE_BRICK_TRAPDOOR = registerBlock("waffle_brick_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> WAFFLE_BRICK_WALL = registerBlock("waffle_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

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
