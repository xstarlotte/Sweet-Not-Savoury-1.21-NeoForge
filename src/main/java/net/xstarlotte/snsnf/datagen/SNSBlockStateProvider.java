package net.xstarlotte.snsnf.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.awt.*;
import java.util.function.Function;

import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.block.custom.CandyCaneCropBlock;


public class SNSBlockStateProvider extends BlockStateProvider {
    public SNSBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SNSNF.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

        blockWithItem(SNSBlock.CANDYFLOSS_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.CANDYFLOSS_BUTTON.get()), blockTexture(SNSBlock.CANDYFLOSS_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.CANDYFLOSS_DOOR.get()), modLoc("block/candyfloss_door_bottom"), modLoc("block/candyfloss_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.CANDYFLOSS_FENCE.get()), blockTexture(SNSBlock.CANDYFLOSS_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.CANDYFLOSS_FENCE_GATE.get()), blockTexture(SNSBlock.CANDYFLOSS_BLOCK.get()));
        blockItem(SNSBlock.CANDYFLOSS_FENCE_GATE);
        blockItem(SNSBlock.CANDYFLOSS_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.CANDYFLOSS_PRESSURE_PLATE.get()), blockTexture(SNSBlock.CANDYFLOSS_BLOCK.get()));
        blockItem(SNSBlock.CANDYFLOSS_SLAB);
        slabBlock(((SlabBlock) SNSBlock.CANDYFLOSS_SLAB.get()), blockTexture(SNSBlock.CANDYFLOSS_BLOCK.get()), blockTexture(SNSBlock.CANDYFLOSS_BLOCK.get()));
        blockItem(SNSBlock.CANDYFLOSS_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.CANDYFLOSS_STAIRS.get()), blockTexture(SNSBlock.CANDYFLOSS_BLOCK.get()));
        blockItem(SNSBlock.CANDYFLOSS_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.CANDYFLOSS_TRAPDOOR.get()), modLoc("block/candyfloss_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.CANDYFLOSS_WALL.get()), blockTexture(SNSBlock.CANDYFLOSS_BLOCK.get()));

        blockWithItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BUTTON.get()), blockTexture(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_DOOR.get()), modLoc("block/candyfloss_blue_raspberry_door_bottom"), modLoc("block/candyfloss_blue_raspberry_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE.get()), blockTexture(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE_GATE.get()), blockTexture(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get()));
        blockItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE_GATE);
        blockItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_PRESSURE_PLATE.get()), blockTexture(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get()));
        blockItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_SLAB);
        slabBlock(((SlabBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_SLAB.get()), blockTexture(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get()), blockTexture(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get()));
        blockItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_STAIRS.get()), blockTexture(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get()));
        blockItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_TRAPDOOR.get()), modLoc("block/candyfloss_blue_raspberry_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_WALL.get()), blockTexture(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get()));


        simpleBlock(SNSBlock.CANDY_CANE_BUSH.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_BUSH.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_BUSH.get())).renderType("cutout"));
        simpleBlock(SNSBlock.CANDY_CANE_CARNATION.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_CARNATION.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_CARNATION.get())).renderType("cutout"));


        simpleBlock(SNSBlock.CANDY_CANE_FLOWER.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_FLOWER.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_FLOWER.get())).renderType("cutout"));
        simpleBlock(SNSBlock.CANDY_CANE_FLOWER_2.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_FLOWER_2.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_FLOWER_2.get())).renderType("cutout"));
        simpleBlock(SNSBlock.CANDY_CANE_FLOWER_3.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_FLOWER_3.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_FLOWER_3.get())).renderType("cutout"));
        simpleBlock(SNSBlock.CANDY_CANE_FLOWER_4.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_FLOWER_4.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_FLOWER_4.get())).renderType("cutout"));
        simpleBlock(SNSBlock.CANDY_CANE_GRASS.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_GRASS.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_GRASS.get())).renderType("cutout"));
        simpleBlock(SNSBlock.CANDY_CANE_GRASS_LONG.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_GRASS_LONG.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_GRASS_LONG.get())).renderType("cutout"));
        blockWithItem(SNSBlock.CANDY_CANE_LOG);
        blockWithItem(SNSBlock.CANDY_CANE_PLANKS);
        buttonBlock(((ButtonBlock) SNSBlock.CANDY_CANE_PLANK_BUTTON.get()), blockTexture(SNSBlock.CANDY_CANE_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.CANDY_CANE_PLANK_DOOR.get()), modLoc("block/candy_cane_plank_door_bottom"), modLoc("block/candy_cane_plank_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.CANDY_CANE_PLANK_FENCE.get()), blockTexture(SNSBlock.CANDY_CANE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.CANDY_CANE_PLANK_FENCE_GATE.get()), blockTexture(SNSBlock.CANDY_CANE_PLANKS.get()));
        blockItem(SNSBlock.CANDY_CANE_PLANK_FENCE_GATE);
        blockItem(SNSBlock.CANDY_CANE_PLANK_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.CANDY_CANE_PLANK_PRESSURE_PLATE.get()), blockTexture(SNSBlock.CANDY_CANE_PLANKS.get()));
        blockItem(SNSBlock.CANDY_CANE_PLANK_SLAB);
        slabBlock(((SlabBlock) SNSBlock.CANDY_CANE_PLANK_SLAB.get()), blockTexture(SNSBlock.CANDY_CANE_PLANKS.get()), blockTexture(SNSBlock.CANDY_CANE_PLANKS.get()));
        blockItem(SNSBlock.CANDY_CANE_PLANK_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.CANDY_CANE_PLANK_STAIRS.get()), blockTexture(SNSBlock.CANDY_CANE_PLANKS.get()));
        blockItem(SNSBlock.CANDY_CANE_PLANK_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.CANDY_CANE_PLANK_TRAPDOOR.get()), modLoc("block/candy_cane_plank_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.CANDY_CANE_PLANK_WALL.get()), blockTexture(SNSBlock.CANDY_CANE_PLANKS.get()));


        blockWithItem(SNSBlock.CHOCOLATE_BRICKS);
        buttonBlock(((ButtonBlock) SNSBlock.CHOCOLATE_BRICK_BUTTON.get()), blockTexture(SNSBlock.CHOCOLATE_BRICKS.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.CHOCOLATE_BRICK_DOOR.get()), modLoc("block/chocolate_brick_door_bottom"), modLoc("block/chocolate_brick_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.CHOCOLATE_BRICK_FENCE.get()), blockTexture(SNSBlock.CHOCOLATE_BRICKS.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.CHOCOLATE_BRICK_FENCE_GATE.get()), blockTexture(SNSBlock.CHOCOLATE_BRICKS.get()));
        blockItem(SNSBlock.CHOCOLATE_BRICK_FENCE_GATE);
        blockItem(SNSBlock.CHOCOLATE_BRICK_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.CHOCOLATE_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlock.CHOCOLATE_BRICKS.get()));
        blockItem(SNSBlock.CHOCOLATE_BRICK_SLAB);
        slabBlock(((SlabBlock) SNSBlock.CHOCOLATE_BRICK_SLAB.get()), blockTexture(SNSBlock.CHOCOLATE_BRICKS.get()), blockTexture(SNSBlock.CHOCOLATE_BRICKS.get()));
        blockItem(SNSBlock.CHOCOLATE_BRICK_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.CHOCOLATE_BRICK_STAIRS.get()), blockTexture(SNSBlock.CHOCOLATE_BRICKS.get()));
        blockItem(SNSBlock.CHOCOLATE_BRICK_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.CHOCOLATE_BRICK_TRAPDOOR.get()), modLoc("block/chocolate_brick_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.CHOCOLATE_BRICK_WALL.get()), blockTexture(SNSBlock.CHOCOLATE_BRICKS.get()));

        blockWithItem(SNSBlock.CHOCOLATE_WHITE_BRICKS);
        buttonBlock(((ButtonBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_BUTTON.get()), blockTexture(SNSBlock.CHOCOLATE_WHITE_BRICKS.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_DOOR.get()), modLoc("block/chocolate_white_brick_door_bottom"), modLoc("block/chocolate_white_brick_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE.get()), blockTexture(SNSBlock.CHOCOLATE_WHITE_BRICKS.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE_GATE.get()), blockTexture(SNSBlock.CHOCOLATE_WHITE_BRICKS.get()));
        blockItem(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE_GATE);
        blockItem(SNSBlock.CHOCOLATE_WHITE_BRICK_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlock.CHOCOLATE_WHITE_BRICKS.get()));
        blockItem(SNSBlock.CHOCOLATE_WHITE_BRICK_SLAB);
        slabBlock(((SlabBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_SLAB.get()), blockTexture(SNSBlock.CHOCOLATE_WHITE_BRICKS.get()), blockTexture(SNSBlock.CHOCOLATE_WHITE_BRICKS.get()));
        blockItem(SNSBlock.CHOCOLATE_WHITE_BRICK_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_STAIRS.get()), blockTexture(SNSBlock.CHOCOLATE_WHITE_BRICKS.get()));
        blockItem(SNSBlock.CHOCOLATE_WHITE_BRICK_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_TRAPDOOR.get()), modLoc("block/chocolate_white_brick_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.CHOCOLATE_WHITE_BRICK_WALL.get()), blockTexture(SNSBlock.CHOCOLATE_WHITE_BRICKS.get()));

        blockWithItem(SNSBlock.CINNAMON_GRASS_BLOCK);

        blockWithItem(SNSBlock.GUMMY_APPLE_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.GUMMY_APPLE_BUTTON.get()), blockTexture(SNSBlock.GUMMY_APPLE_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.GUMMY_APPLE_DOOR.get()), modLoc("block/gummy_apple_door_bottom"), modLoc("block/gummy_apple_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.GUMMY_APPLE_FENCE.get()), blockTexture(SNSBlock.GUMMY_APPLE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.GUMMY_APPLE_FENCE_GATE.get()), blockTexture(SNSBlock.GUMMY_APPLE_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_APPLE_FENCE_GATE);
        blockItem(SNSBlock.GUMMY_APPLE_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.GUMMY_APPLE_PRESSURE_PLATE.get()), blockTexture(SNSBlock.GUMMY_APPLE_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_APPLE_SLAB);
        slabBlock(((SlabBlock) SNSBlock.GUMMY_APPLE_SLAB.get()), blockTexture(SNSBlock.GUMMY_APPLE_BLOCK.get()), blockTexture(SNSBlock.GUMMY_APPLE_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_APPLE_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.GUMMY_APPLE_STAIRS.get()), blockTexture(SNSBlock.GUMMY_APPLE_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_APPLE_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.GUMMY_APPLE_TRAPDOOR.get()), modLoc("block/gummy_apple_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.GUMMY_APPLE_WALL.get()), blockTexture(SNSBlock.GUMMY_APPLE_BLOCK.get()));

        blockWithItem(SNSBlock.GUMMY_BANANA_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.GUMMY_BANANA_BUTTON.get()), blockTexture(SNSBlock.GUMMY_BANANA_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.GUMMY_BANANA_DOOR.get()), modLoc("block/gummy_banana_door_bottom"), modLoc("block/gummy_banana_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.GUMMY_BANANA_FENCE.get()), blockTexture(SNSBlock.GUMMY_BANANA_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.GUMMY_BANANA_FENCE_GATE.get()), blockTexture(SNSBlock.GUMMY_BANANA_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BANANA_FENCE_GATE);
        blockItem(SNSBlock.GUMMY_BANANA_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.GUMMY_BANANA_PRESSURE_PLATE.get()), blockTexture(SNSBlock.GUMMY_BANANA_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BANANA_SLAB);
        slabBlock(((SlabBlock) SNSBlock.GUMMY_BANANA_SLAB.get()), blockTexture(SNSBlock.GUMMY_BANANA_BLOCK.get()), blockTexture(SNSBlock.GUMMY_BANANA_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BANANA_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.GUMMY_BANANA_STAIRS.get()), blockTexture(SNSBlock.GUMMY_BANANA_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BANANA_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.GUMMY_BANANA_TRAPDOOR.get()), modLoc("block/gummy_banana_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.GUMMY_BANANA_WALL.get()), blockTexture(SNSBlock.GUMMY_BANANA_BLOCK.get()));

        blockWithItem(SNSBlock.GUMMY_BLACKBERRY_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.GUMMY_BLACKBERRY_BUTTON.get()), blockTexture(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.GUMMY_BLACKBERRY_DOOR.get()), modLoc("block/gummy_blackberry_door_bottom"), modLoc("block/gummy_blackberry_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.GUMMY_BLACKBERRY_FENCE.get()), blockTexture(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.GUMMY_BLACKBERRY_FENCE_GATE.get()), blockTexture(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BLACKBERRY_FENCE_GATE);
        blockItem(SNSBlock.GUMMY_BLACKBERRY_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.GUMMY_BLACKBERRY_PRESSURE_PLATE.get()), blockTexture(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BLACKBERRY_SLAB);
        slabBlock(((SlabBlock) SNSBlock.GUMMY_BLACKBERRY_SLAB.get()), blockTexture(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get()), blockTexture(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BLACKBERRY_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.GUMMY_BLACKBERRY_STAIRS.get()), blockTexture(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BLACKBERRY_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.GUMMY_BLACKBERRY_TRAPDOOR.get()), modLoc("block/gummy_blackberry_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.GUMMY_BLACKBERRY_WALL.get()), blockTexture(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get()));

        blockWithItem(SNSBlock.GUMMY_BLUEBERRY_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.GUMMY_BLUEBERRY_BUTTON.get()), blockTexture(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.GUMMY_BLUEBERRY_DOOR.get()), modLoc("block/gummy_blueberry_door_bottom"), modLoc("block/gummy_blueberry_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.GUMMY_BLUEBERRY_FENCE.get()), blockTexture(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.GUMMY_BLUEBERRY_FENCE_GATE.get()), blockTexture(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BLUEBERRY_FENCE_GATE);
        blockItem(SNSBlock.GUMMY_BLUEBERRY_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.GUMMY_BLUEBERRY_PRESSURE_PLATE.get()), blockTexture(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BLUEBERRY_SLAB);
        slabBlock(((SlabBlock) SNSBlock.GUMMY_BLUEBERRY_SLAB.get()), blockTexture(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get()), blockTexture(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BLUEBERRY_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.GUMMY_BLUEBERRY_STAIRS.get()), blockTexture(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_BLUEBERRY_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.GUMMY_BLUEBERRY_TRAPDOOR.get()), modLoc("block/gummy_blueberry_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.GUMMY_BLUEBERRY_WALL.get()), blockTexture(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get()));

        blockWithItem(SNSBlock.GUMMY_RASPBERRY_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.GUMMY_RASPBERRY_BUTTON.get()), blockTexture(SNSBlock.GUMMY_RASPBERRY_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.GUMMY_RASPBERRY_DOOR.get()), modLoc("block/gummy_raspberry_door_bottom"), modLoc("block/gummy_raspberry_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.GUMMY_RASPBERRY_FENCE.get()), blockTexture(SNSBlock.GUMMY_RASPBERRY_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.GUMMY_RASPBERRY_FENCE_GATE.get()), blockTexture(SNSBlock.GUMMY_RASPBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_RASPBERRY_FENCE_GATE);
        blockItem(SNSBlock.GUMMY_RASPBERRY_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.GUMMY_RASPBERRY_PRESSURE_PLATE.get()), blockTexture(SNSBlock.GUMMY_RASPBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_RASPBERRY_SLAB);
        slabBlock(((SlabBlock) SNSBlock.GUMMY_RASPBERRY_SLAB.get()), blockTexture(SNSBlock.GUMMY_RASPBERRY_BLOCK.get()), blockTexture(SNSBlock.GUMMY_RASPBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_RASPBERRY_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.GUMMY_RASPBERRY_STAIRS.get()), blockTexture(SNSBlock.GUMMY_RASPBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_RASPBERRY_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.GUMMY_RASPBERRY_TRAPDOOR.get()), modLoc("block/gummy_raspberry_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.GUMMY_RASPBERRY_WALL.get()), blockTexture(SNSBlock.GUMMY_RASPBERRY_BLOCK.get()));

        blockWithItem(SNSBlock.GUMMY_STRAWBERRY_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.GUMMY_STRAWBERRY_BUTTON.get()), blockTexture(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.GUMMY_STRAWBERRY_DOOR.get()), modLoc("block/gummy_strawberry_door_bottom"), modLoc("block/gummy_strawberry_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.GUMMY_STRAWBERRY_FENCE.get()), blockTexture(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.GUMMY_STRAWBERRY_FENCE_GATE.get()), blockTexture(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_STRAWBERRY_FENCE_GATE);
        blockItem(SNSBlock.GUMMY_STRAWBERRY_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.GUMMY_STRAWBERRY_PRESSURE_PLATE.get()), blockTexture(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_STRAWBERRY_SLAB);
        slabBlock(((SlabBlock) SNSBlock.GUMMY_STRAWBERRY_SLAB.get()), blockTexture(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get()), blockTexture(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_STRAWBERRY_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.GUMMY_STRAWBERRY_STAIRS.get()), blockTexture(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get()));
        blockItem(SNSBlock.GUMMY_STRAWBERRY_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.GUMMY_STRAWBERRY_TRAPDOOR.get()), modLoc("block/gummy_strawberry_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.GUMMY_STRAWBERRY_WALL.get()), blockTexture(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get()));

        blockWithItem(SNSBlock.HUMBUG_BRICK);
        buttonBlock(((ButtonBlock) SNSBlock.HUMBUG_BRICK_BUTTON.get()), blockTexture(SNSBlock.HUMBUG_BRICK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.HUMBUG_BRICK_DOOR.get()), modLoc("block/humbug_brick_door_bottom"), modLoc("block/humbug_brick_door_top"), "translucent");
        blockItem(SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlock.HUMBUG_BRICK.get()));
        blockItem(SNSBlock.HUMBUG_BRICK_SLAB);
        slabBlock(((SlabBlock) SNSBlock.HUMBUG_BRICK_SLAB.get()), blockTexture(SNSBlock.HUMBUG_BRICK.get()), blockTexture(SNSBlock.HUMBUG_BRICK.get()));
        blockItem(SNSBlock.HUMBUG_BRICK_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.HUMBUG_BRICK_STAIRS.get()), blockTexture(SNSBlock.HUMBUG_BRICK.get()));
        blockItem(SNSBlock.HUMBUG_BRICK_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.HUMBUG_BRICK_TRAPDOOR.get()), modLoc("block/humbug_brick_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.HUMBUG_BRICK_WALL.get()), blockTexture(SNSBlock.HUMBUG_BRICK.get()));

        blockWithItem(SNSBlock.MINT_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.MINT_BLOCK_BUTTON.get()), blockTexture(SNSBlock.MINT_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.MINT_BLOCK_DOOR.get()), modLoc("block/mint_block_door_bottom"), modLoc("block/mint_block_door_top"), "translucent");
        blockItem(SNSBlock.MINT_BLOCK_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.MINT_BLOCK_PRESSURE_PLATE.get()), blockTexture(SNSBlock.MINT_BLOCK.get()));
        blockItem(SNSBlock.MINT_BLOCK_SLAB);
        slabBlock(((SlabBlock) SNSBlock.MINT_BLOCK_SLAB.get()), blockTexture(SNSBlock.MINT_BLOCK.get()), blockTexture(SNSBlock.MINT_BLOCK.get()));
        blockItem(SNSBlock.MINT_BLOCK_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.MINT_BLOCK_STAIRS.get()), blockTexture(SNSBlock.MINT_BLOCK.get()));
        blockItem(SNSBlock.MINT_BLOCK_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.MINT_BLOCK_TRAPDOOR.get()), modLoc("block/mint_block_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.MINT_BLOCK_WALL.get()), blockTexture(SNSBlock.MINT_BLOCK.get()));
        blockWithItem(SNSBlock.MINT_BRICK);
        buttonBlock(((ButtonBlock) SNSBlock.MINT_BRICK_BUTTON.get()), blockTexture(SNSBlock.MINT_BRICK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.MINT_BRICK_DOOR.get()), modLoc("block/mint_brick_door_bottom"), modLoc("block/mint_brick_door_top"), "translucent");
        blockItem(SNSBlock.MINT_BRICK_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.MINT_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlock.MINT_BRICK.get()));
        blockItem(SNSBlock.MINT_BRICK_SLAB);
        slabBlock(((SlabBlock) SNSBlock.MINT_BRICK_SLAB.get()), blockTexture(SNSBlock.MINT_BRICK.get()), blockTexture(SNSBlock.MINT_BRICK.get()));
        blockItem(SNSBlock.MINT_BRICK_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.MINT_BRICK_STAIRS.get()), blockTexture(SNSBlock.MINT_BRICK.get()));
        blockItem(SNSBlock.MINT_BRICK_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.MINT_BRICK_TRAPDOOR.get()), modLoc("block/mint_brick_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.MINT_BRICK_WALL.get()), blockTexture(SNSBlock.MINT_BRICK.get()));
        blockWithItem(SNSBlock.MINT_GRASS_BLOCK);

        blockWithItem(SNSBlock.PEPPERMINT_SWIRL_BRICK);
        buttonBlock(((ButtonBlock) SNSBlock.PEPPERMINT_SWIRL_BRICK_BUTTON.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_BRICK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.PEPPERMINT_SWIRL_BRICK_DOOR.get()), modLoc("block/peppermint_swirl_brick_door_bottom"), modLoc("block/peppermint_swirl_brick_door_top"), "translucent");
        blockItem(SNSBlock.PEPPERMINT_SWIRL_BRICK_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.PEPPERMINT_SWIRL_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_BRICK.get()));
        blockItem(SNSBlock.PEPPERMINT_SWIRL_BRICK_SLAB);
        slabBlock(((SlabBlock) SNSBlock.PEPPERMINT_SWIRL_BRICK_SLAB.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_BRICK.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_BRICK.get()));
        blockItem(SNSBlock.PEPPERMINT_SWIRL_BRICK_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.PEPPERMINT_SWIRL_BRICK_STAIRS.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_BRICK.get()));
        blockItem(SNSBlock.PEPPERMINT_SWIRL_BRICK_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.PEPPERMINT_SWIRL_BRICK_TRAPDOOR.get()), modLoc("block/peppermint_swirl_brick_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.PEPPERMINT_SWIRL_BRICK_WALL.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_BRICK.get()));

        blockWithItem(SNSBlock.PEPPERMINT_SWIRL_STONE);
        buttonBlock(((ButtonBlock) SNSBlock.PEPPERMINT_SWIRL_STONE_BUTTON.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_STONE.get()));
        blockWithItem(SNSBlock.PEPPERMINT_SWIRL_STONE_COAL_ORE);
        doorBlockWithRenderType(((DoorBlock) SNSBlock.PEPPERMINT_SWIRL_STONE_DOOR.get()), modLoc("block/peppermint_swirl_stone_door_bottom"), modLoc("block/peppermint_swirl_stone_door_top"), "translucent");
        blockItem(SNSBlock.PEPPERMINT_SWIRL_STONE_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.PEPPERMINT_SWIRL_STONE_PRESSURE_PLATE.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_STONE.get()));
        blockItem(SNSBlock.PEPPERMINT_SWIRL_STONE_SLAB);
        slabBlock(((SlabBlock) SNSBlock.PEPPERMINT_SWIRL_STONE_SLAB.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_STONE.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_STONE.get()));
        blockItem(SNSBlock.PEPPERMINT_SWIRL_STONE_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.PEPPERMINT_SWIRL_STONE_STAIRS.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_STONE.get()));
        blockItem(SNSBlock.PEPPERMINT_SWIRL_STONE_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.PEPPERMINT_SWIRL_STONE_TRAPDOOR.get()), modLoc("block/peppermint_swirl_stone_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.PEPPERMINT_SWIRL_STONE_WALL.get()), blockTexture(SNSBlock.PEPPERMINT_SWIRL_STONE.get()));

        simpleBlock(SNSBlock.POTTED_CANDY_CANE_BUSH.get(), models().singleTexture("potted_candy_cane_bush", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(SNSBlock.CANDY_CANE_BUSH.get())).renderType("cutout"));
        simpleBlock(SNSBlock.POTTED_CANDY_CANE_CARNATION.get(), models().singleTexture("potted_candy_cane_carnation", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(SNSBlock.CANDY_CANE_CARNATION.get())).renderType("cutout"));
        simpleBlock(SNSBlock.POTTED_CANDY_CANE_FLOWER.get(), models().singleTexture("potted_candy_cane_flower", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(SNSBlock.CANDY_CANE_FLOWER.get())).renderType("cutout"));
        simpleBlock(SNSBlock.POTTED_CANDY_CANE_FLOWER_2.get(), models().singleTexture("potted_candy_cane_flower_2", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(SNSBlock.CANDY_CANE_FLOWER_2.get())).renderType("cutout"));
        simpleBlock(SNSBlock.POTTED_CANDY_CANE_FLOWER_3.get(), models().singleTexture("potted_candy_cane_flower_3", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(SNSBlock.CANDY_CANE_FLOWER_3.get())).renderType("cutout"));
        simpleBlock(SNSBlock.POTTED_CANDY_CANE_FLOWER_4.get(), models().singleTexture("potted_candy_cane_flower_4", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(SNSBlock.CANDY_CANE_FLOWER_4.get())).renderType("cutout"));
        simpleBlock(SNSBlock.POTTED_CANDY_CANE_GRASS.get(), models().singleTexture("potted_candy_cane_grass", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(SNSBlock.CANDY_CANE_GRASS.get())).renderType("cutout"));
        simpleBlock(SNSBlock.POTTED_CANDY_CANE_GRASS_LONG.get(), models().singleTexture("potted_candy_cane_grass_long", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(SNSBlock.CANDY_CANE_GRASS_LONG.get())).renderType("cutout"));

        blockWithItem(SNSBlock.WAFFLE_BLOCK);
        buttonBlock(((ButtonBlock) SNSBlock.WAFFLE_BUTTON.get()), blockTexture(SNSBlock.WAFFLE_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.WAFFLE_DOOR.get()), modLoc("block/waffle_door_bottom"), modLoc("block/waffle_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.WAFFLE_FENCE.get()), blockTexture(SNSBlock.WAFFLE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.WAFFLE_FENCE_GATE.get()), blockTexture(SNSBlock.WAFFLE_BLOCK.get()));
        blockItem(SNSBlock.WAFFLE_FENCE_GATE);
        blockItem(SNSBlock.WAFFLE_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.WAFFLE_PRESSURE_PLATE.get()), blockTexture(SNSBlock.WAFFLE_BLOCK.get()));
        blockItem(SNSBlock.WAFFLE_SLAB);
        slabBlock(((SlabBlock) SNSBlock.WAFFLE_SLAB.get()), blockTexture(SNSBlock.WAFFLE_BLOCK.get()), blockTexture(SNSBlock.WAFFLE_BLOCK.get()));
        blockItem(SNSBlock.WAFFLE_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.WAFFLE_STAIRS.get()), blockTexture(SNSBlock.WAFFLE_BLOCK.get()));
        blockItem(SNSBlock.WAFFLE_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.WAFFLE_TRAPDOOR.get()), modLoc("block/waffle_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.WAFFLE_WALL.get()), blockTexture(SNSBlock.WAFFLE_BLOCK.get()));

        blockWithItem(SNSBlock.WAFFLE_BRICKS);
        buttonBlock(((ButtonBlock) SNSBlock.WAFFLE_BRICK_BUTTON.get()), blockTexture(SNSBlock.WAFFLE_BRICKS.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.WAFFLE_BRICK_DOOR.get()), modLoc("block/waffle_brick_door_bottom"), modLoc("block/waffle_brick_door_top"), "translucent");
        fenceBlock(((FenceBlock) SNSBlock.WAFFLE_BRICK_FENCE.get()), blockTexture(SNSBlock.WAFFLE_BRICKS.get()));
        fenceGateBlock(((FenceGateBlock) SNSBlock.WAFFLE_BRICK_FENCE_GATE.get()), blockTexture(SNSBlock.WAFFLE_BRICKS.get()));
        blockItem(SNSBlock.WAFFLE_BRICK_FENCE_GATE);
        blockItem(SNSBlock.WAFFLE_BRICK_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.WAFFLE_BRICK_PRESSURE_PLATE.get()), blockTexture(SNSBlock.WAFFLE_BRICKS.get()));
        blockItem(SNSBlock.WAFFLE_BRICK_SLAB);
        slabBlock(((SlabBlock) SNSBlock.WAFFLE_BRICK_SLAB.get()), blockTexture(SNSBlock.WAFFLE_BRICKS.get()), blockTexture(SNSBlock.WAFFLE_BRICKS.get()));
        blockItem(SNSBlock.WAFFLE_BRICK_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.WAFFLE_BRICK_STAIRS.get()), blockTexture(SNSBlock.WAFFLE_BRICKS.get()));
        blockItem(SNSBlock.WAFFLE_BRICK_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.WAFFLE_BRICK_TRAPDOOR.get()), modLoc("block/waffle_brick_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.WAFFLE_BRICK_WALL.get()), blockTexture(SNSBlock.WAFFLE_BRICKS.get()));


    }


    private void blockItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("snsnf:block/" + deferredBlock.getId().getPath()));
    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    private void blockItem(DeferredBlock<Block> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("snsnf:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
