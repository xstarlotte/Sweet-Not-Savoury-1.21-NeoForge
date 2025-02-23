package net.xstarlotte.snsnf;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.util.Tuple;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.entity.SNSEntity;
import net.xstarlotte.snsnf.entity.client.herb.*;
import net.xstarlotte.snsnf.item.SNSItem;
import net.xstarlotte.snsnf.item.SNSTab;
import net.xstarlotte.snsnf.mob_effects.SNSEffect;
import net.xstarlotte.snsnf.network.SNSNFModVariables;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;


@Mod(SNSNF.MOD_ID)
public class SNSNF
{

    public static final String MOD_ID = "snsnf";

    private static final Logger LOGGER = LogUtils.getLogger();

    public SNSNF(IEventBus modEventBus, ModContainer modContainer) {

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::commonSetup);

        SNSBlock.register(modEventBus);
        SNSEntity.register(modEventBus);
        SNSItem.register(modEventBus);
        SNSEffect.register(modEventBus);
        SNSTab.register(modEventBus);


        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::registerNetworking);

        SNSNFModVariables.ATTACHMENT_TYPES.register(modEventBus);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlock.CANDY_CANE_BUSH.getId(), SNSBlock.POTTED_CANDY_CANE_BUSH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlock.CANDY_CANE_CARNATION.getId(), SNSBlock.POTTED_CANDY_CANE_CARNATION);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlock.CANDY_CANE_FLOWER.getId(), SNSBlock.POTTED_CANDY_CANE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlock.CANDY_CANE_FLOWER_2.getId(), SNSBlock.POTTED_CANDY_CANE_FLOWER_2);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlock.CANDY_CANE_FLOWER_3.getId(), SNSBlock.POTTED_CANDY_CANE_FLOWER_3);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlock.CANDY_CANE_FLOWER_4.getId(), SNSBlock.POTTED_CANDY_CANE_FLOWER_4);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlock.CANDY_CANE_GRASS.getId(), SNSBlock.POTTED_CANDY_CANE_GRASS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SNSBlock.CANDY_CANE_GRASS_LONG.getId(), SNSBlock.POTTED_CANDY_CANE_GRASS_LONG);
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());

            EntityRenderers.register(SNSEntity.CANDY_CANE_CAT.get(), CandyCaneCatRenderer::new);
            EntityRenderers.register(SNSEntity.CANDY_CANE_CROOK.get(), CandyCaneCrookRenderer::new);
            EntityRenderers.register(SNSEntity.CANDY_CANE_FLY.get(), CandyCaneFlyRenderer::new);

            EntityRenderers.register(SNSEntity.HUMBUG.get(), HumbugRenderer::new);
            EntityRenderers.register(SNSEntity.HUMPUG.get(), HumpugRenderer::new);

            EntityRenderers.register(SNSEntity.MINTMUNK.get(), MintmunkRenderer::new);
            EntityRenderers.register(SNSEntity.MINT_IMPERIAL.get(), MintImperialRenderer::new);
            EntityRenderers.register(SNSEntity.MINT_MARSHMALLOW_SHEEP.get(), MintMarshmallowSheepRenderer::new);

            EntityRenderers.register(SNSEntity.PEPPERMINT_CHURL.get(), PeppermintChurlRenderer::new);
        }
    }

    private static boolean networkingRegistered = false;
    private static final Map<CustomPacketPayload.Type<?>, NetworkMessage<?>> MESSAGES = new HashMap<>();

    private record NetworkMessage<T extends CustomPacketPayload>(StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
    }

    public static <T extends CustomPacketPayload> void addNetworkMessage(CustomPacketPayload.Type<T> id, StreamCodec<? extends FriendlyByteBuf, T> reader, IPayloadHandler<T> handler) {
        if (networkingRegistered)
            throw new IllegalStateException("Cannot register new network messages after networking has been registered");
        MESSAGES.put(id, new NetworkMessage<>(reader, handler));
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private void registerNetworking(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar(MOD_ID);
        MESSAGES.forEach((id, networkMessage) -> registrar.playBidirectional(id, ((NetworkMessage) networkMessage).reader(), ((NetworkMessage) networkMessage).handler()));
        networkingRegistered = true;
    }

    private static final Collection<Tuple<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

    public static void queueServerWork(int tick, Runnable action) {
        if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
            workQueue.add(new Tuple<>(action, tick));
    }

    @SubscribeEvent
    public void tick(ServerTickEvent.Post event) {
        List<Tuple<Runnable, Integer>> actions = new ArrayList<>();
        workQueue.forEach(work -> {
            work.setB(work.getB() - 1);
            if (work.getB() == 0)
                actions.add(work);
        });
        actions.forEach(e -> e.getA().run());
        workQueue.removeAll(actions);
    }
}