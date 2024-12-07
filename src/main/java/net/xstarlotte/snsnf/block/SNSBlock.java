package net.xstarlotte.snsnf.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.item.SNSItem;

import java.util.function.Supplier;

public class SNSBlock {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SNSNF.MOD_ID);



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
