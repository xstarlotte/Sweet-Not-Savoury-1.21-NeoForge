package net.xstarlotte.snsnf.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.server.command.ConfigCommand;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.item.SNSItem;

import java.util.List;

@EventBusSubscriber(modid = SNSNF.MOD_ID, bus = EventBusSubscriber.Bus.GAME)

public class SNSEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 1),
                    new ItemStack(SNSItem.CANDY_CANE_SUGAR_CANE.get(), 1), 2, 10, 0.05f
            ));
        }
        if (event.getType() == VillagerProfession.SHEPHERD) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 5),
                    new ItemStack(SNSBlock.CANDY_CANE_CAT_TEDDY.get(), 1), 2, 10, 0.05f
            ));
        }

        if (event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.COBBLESTONE, 5),
                    new ItemStack(SNSBlock.PEPPERMINT_SWIRL_STONE.get(), 4), 999999, 10, 0.00f
            ));
        }
        if (event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.COBBLESTONE, 5),
                    new ItemStack(SNSBlock.MINT_BLOCK.get(), 4), 999999, 10, 0.00f
            ));
        }

    }

    @SubscribeEvent
    public static void addWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 1),
                new ItemStack(SNSItem.CANDY_CANE_SUGAR_CANE.get(), 1), 1, 10, 0.2f
        ));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 1),
                new ItemStack(SNSItem.HUMBUG.get(), 4), 1, 10, 0.2f
        ));

        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 1),
                new ItemStack(SNSItem.PEPPERMINT_SWIRL.get(), 4), 1, 10, 0.2f
        ));

    }

}
