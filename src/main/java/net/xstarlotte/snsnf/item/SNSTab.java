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
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_DOOR);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_SLAB);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR);
                        pOutput.accept(SNSBlock.CANDY_CANE_COBBLESTONE_WALL);
                    }).build());

    public static final Supplier<CreativeModeTab> SNS_ITEM =
            CREATIVE_MODE_TABS.register("sns_item", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.snsnf.sns_item"))
                    .icon(() -> new ItemStack(SNSItem.CANDY_CANE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sns_block"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(SNSItem.CANDY_CANE);
                        pOutput.accept(SNSItem.CANDY_CANE_SUGAR);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
