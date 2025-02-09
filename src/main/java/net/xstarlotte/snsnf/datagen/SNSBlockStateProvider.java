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
        simpleBlock(SNSBlock.CANDY_CANE_BUSH.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_BUSH.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_BUSH.get())).renderType("cutout"));
        simpleBlock(SNSBlock.CANDY_CANE_CARNATION.get(),
                models().cross(blockTexture(SNSBlock.CANDY_CANE_CARNATION.get()).getPath(), blockTexture(SNSBlock.CANDY_CANE_CARNATION.get())).renderType("cutout"));
        blockWithItem(SNSBlock.CANDY_CANE_COBBLESTONE);
        buttonBlock(((ButtonBlock) SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        blockWithItem(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE);
        doorBlockWithRenderType(((DoorBlock) SNSBlock.CANDY_CANE_COBBLESTONE_DOOR.get()), modLoc("block/candy_cane_cobblestone_door_bottom"), modLoc("block/candy_cane_cobblestone_door_top"), "translucent");
        blockItem(SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        blockItem(SNSBlock.CANDY_CANE_COBBLESTONE_SLAB);
        slabBlock(((SlabBlock) SNSBlock.CANDY_CANE_COBBLESTONE_SLAB.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        blockItem(SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        blockItem(SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR.get()), modLoc("block/candy_cane_cobblestone_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.CANDY_CANE_COBBLESTONE_WALL.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
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

        blockWithItem(SNSBlock.CINNAMON_GRASS_BLOCK);

        blockWithItem(SNSBlock.HUMBUG_COBBLESTONE);
        buttonBlock(((ButtonBlock) SNSBlock.HUMBUG_COBBLESTONE_BUTTON.get()), blockTexture(SNSBlock.HUMBUG_COBBLESTONE.get()));
        doorBlockWithRenderType(((DoorBlock) SNSBlock.HUMBUG_COBBLESTONE_DOOR.get()), modLoc("block/humbug_cobblestone_door_bottom"), modLoc("block/humbug_cobblestone_door_top"), "translucent");
        blockItem(SNSBlock.HUMBUG_COBBLESTONE_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.HUMBUG_COBBLESTONE_PRESSURE_PLATE.get()), blockTexture(SNSBlock.HUMBUG_COBBLESTONE.get()));
        blockItem(SNSBlock.HUMBUG_COBBLESTONE_SLAB);
        slabBlock(((SlabBlock) SNSBlock.HUMBUG_COBBLESTONE_SLAB.get()), blockTexture(SNSBlock.HUMBUG_COBBLESTONE.get()), blockTexture(SNSBlock.HUMBUG_COBBLESTONE.get()));
        blockItem(SNSBlock.HUMBUG_COBBLESTONE_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.HUMBUG_COBBLESTONE_STAIRS.get()), blockTexture(SNSBlock.HUMBUG_COBBLESTONE.get()));
        blockItem(SNSBlock.HUMBUG_COBBLESTONE_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.HUMBUG_COBBLESTONE_TRAPDOOR.get()), modLoc("block/humbug_cobblestone_trapdoor"), true, "translucent");
        wallBlock(((WallBlock) SNSBlock.HUMBUG_COBBLESTONE_WALL.get()), blockTexture(SNSBlock.HUMBUG_COBBLESTONE.get()));

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
