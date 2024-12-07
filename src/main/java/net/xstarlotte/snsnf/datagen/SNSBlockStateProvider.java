package net.xstarlotte.snsnf.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.awt.*;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;



public class SNSBlockStateProvider extends BlockStateProvider {
    public SNSBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SNSNF.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(SNSBlock.CANDY_CANE_COBBLESTONE);
        buttonBlock(((ButtonBlock) SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        blockWithItem(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE);
        doorBlockWithRenderType(((DoorBlock) SNSBlock.CANDY_CANE_COBBLESTONE_DOOR.get()), modLoc("block/candy_cane_cobblestone_door_bottom"), modLoc("block/candy_cane_cobblestone_door_top"), "cutout");
        blockItem(SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE);
        pressurePlateBlock(((PressurePlateBlock) SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        blockItem(SNSBlock.CANDY_CANE_COBBLESTONE_SLAB);
        slabBlock(((SlabBlock) SNSBlock.CANDY_CANE_COBBLESTONE_SLAB.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        blockItem(SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS);
        stairsBlock(((StairBlock) SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        blockItem(SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR, "_bottom");
        trapdoorBlockWithRenderType(((TrapDoorBlock) SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR.get()), modLoc("block/candy_cane_cobblestone_trapdoor"), true, "cutout");
        wallBlock(((WallBlock) SNSBlock.CANDY_CANE_COBBLESTONE_WALL.get()), blockTexture(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
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
