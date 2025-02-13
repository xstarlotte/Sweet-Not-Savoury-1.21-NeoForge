package net.xstarlotte.snsnf.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;


public class SNSTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SNSNF.MOD_ID);

    public static final Supplier<CreativeModeTab> SNS_BLOCK =
            CREATIVE_MODE_TABS.register("sns_block", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.snsnf.sns_block"))
                    .icon(() -> new ItemStack(SNSBlock.CANDY_CANE_COBBLESTONE.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(SNSBlock.CANDY_CANE_BUSH);
                        pOutput.accept(SNSBlock.CANDY_CANE_CARNATION);
                        pOutput.accept(SNSBlock.CANDY_CANE_FLOWER);
                        pOutput.accept(SNSBlock.CANDY_CANE_FLOWER_2);
                        pOutput.accept(SNSBlock.CANDY_CANE_FLOWER_3);
                        pOutput.accept(SNSBlock.CANDY_CANE_FLOWER_4);
                        pOutput.accept(SNSBlock.CANDY_CANE_GRASS);
                        pOutput.accept(SNSBlock.CANDY_CANE_GRASS_LONG);
                        pOutput.accept(SNSBlock.CANDY_CANE_CAT_TEDDY);
                        pOutput.accept(SNSBlock.CANDY_CANE_CAT_TEDDY_APPLE);
                        pOutput.accept(SNSBlock.CANDY_CANE_CAT_TEDDY_ICE);
                        pOutput.accept(SNSBlock.CANDY_CANE_CAT_TEDDY_PEPPER);
                        pOutput.accept(SNSBlock.CANDY_CANE_CAT_TEDDY_SPEAR);
                        pOutput.accept(SNSBlock.CANDY_CANE_CAT_TEDDY_WATERMELON);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_DOOR);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_SLAB);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_WALL);

                        pOutput.accept(SNSBlock.CINNAMON_GRASS_BLOCK);

                        pOutput.accept(SNSBlock.HUMBUG_COBBLESTONE);
                        pOutput.accept(SNSBlock.HUMBUG_COBBLESTONE_BUTTON);
                        pOutput.accept(SNSBlock.HUMBUG_COBBLESTONE_DOOR);
                        pOutput.accept(SNSBlock.HUMBUG_COBBLESTONE_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.HUMBUG_COBBLESTONE_SLAB);
                        pOutput.accept(SNSBlock.HUMBUG_COBBLESTONE_STAIRS);
                        pOutput.accept(SNSBlock.HUMBUG_COBBLESTONE_TRAPDOOR);
                        pOutput.accept(SNSBlock.HUMBUG_COBBLESTONE_WALL);

                        pOutput.accept(SNSBlock.MINT_GRASS_BLOCK);
                        pOutput.accept(SNSBlock.MINT_BLOCK);
                        pOutput.accept(SNSBlock.MINT_BLOCK_BUTTON);
                        pOutput.accept(SNSBlock.MINT_BLOCK_DOOR);
                        pOutput.accept(SNSBlock.MINT_BLOCK_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.MINT_BLOCK_SLAB);
                        pOutput.accept(SNSBlock.MINT_BLOCK_STAIRS);
                        pOutput.accept(SNSBlock.MINT_BLOCK_TRAPDOOR);
                        pOutput.accept(SNSBlock.MINT_BLOCK_WALL);
                        pOutput.accept(SNSBlock.MINT_BRICK);
                        pOutput.accept(SNSBlock.MINT_BRICK_BUTTON);
                        pOutput.accept(SNSBlock.MINT_BRICK_DOOR);
                        pOutput.accept(SNSBlock.MINT_BRICK_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.MINT_BRICK_SLAB);
                        pOutput.accept(SNSBlock.MINT_BRICK_STAIRS);
                        pOutput.accept(SNSBlock.MINT_BRICK_TRAPDOOR);
                        pOutput.accept(SNSBlock.MINT_BRICK_WALL);

                        pOutput.accept(SNSBlock.MINT_HUMBUG_CAT_TEDDY);
                    }).build());

    public static final Supplier<CreativeModeTab> SNS_ITEM =
            CREATIVE_MODE_TABS.register("sns_item", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.snsnf.sns_item"))
                    .icon(() -> new ItemStack(SNSItem.CANDY_CANE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sns_block"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(SNSItem.CANDY_CANE_SWORD);

                        pOutput.accept(SNSItem.CANDY_CANE);
                        pOutput.accept(SNSItem.CANDY_CANE_SUGAR);
                        pOutput.accept(SNSItem.CANDY_CANE_SUGAR_CANE);

                        pOutput.accept(SNSItem.HUMBUG);

                        pOutput.accept(SNSItem.MINT_MARSHMALLOW);

                        pOutput.accept(SNSItem.CANDY_CANE_CAT_SPAWN_EGG);
                        pOutput.accept(SNSItem.CANDY_CANE_CROOK_SPAWN_EGG);
                        pOutput.accept(SNSItem.CANDY_CANE_FLY_SPAWN_EGG);

                        pOutput.accept(SNSItem.MINT_IMPERIAL_SPAWN_EGG);
                        pOutput.accept(SNSItem.MINT_MARSHMALLOW_SHEEP_SPAWN_EGG);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
