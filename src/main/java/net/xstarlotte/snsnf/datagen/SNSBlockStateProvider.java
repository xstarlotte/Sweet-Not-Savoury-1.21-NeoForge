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
