package net.xstarlotte.snsnf;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.util.Tuple;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadHandler;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.block.entity.SNSBE;
import net.xstarlotte.snsnf.entity.SNSEntity;
import net.xstarlotte.snsnf.entity.client.berry.BlackboarryRenderer;
import net.xstarlotte.snsnf.entity.client.berry.BlueboarryRenderer;
import net.xstarlotte.snsnf.entity.client.berry.RaspboarryRenderer;
import net.xstarlotte.snsnf.entity.client.berry.StrawboarryRenderer;
import net.xstarlotte.snsnf.entity.client.berry.JamsterRenderer;
import net.xstarlotte.snsnf.entity.client.cake.CakeRabbitRenderer;
import net.xstarlotte.snsnf.entity.client.cake.CheesecakeMouseRenderer;
import net.xstarlotte.snsnf.entity.client.cake.SquirrollRenderer;
import net.xstarlotte.snsnf.entity.client.fruit.*;
import net.xstarlotte.snsnf.entity.client.herb.*;
import net.xstarlotte.snsnf.entity.client.ice_cream.IceCreamCowRenderer;
import net.xstarlotte.snsnf.entity.client.ice_cream.ParfaitPixieRenderer;
import net.xstarlotte.snsnf.entity.client.ice_cream.WaferWitchRenderer;
import net.xstarlotte.snsnf.entity.client.sweet.*;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneTigerEntity;
import net.xstarlotte.snsnf.item.SNSItem;
import net.xstarlotte.snsnf.item.SNSTab;
import net.xstarlotte.snsnf.mob_effects.SNSEffect;
import net.xstarlotte.snsnf.network.SNSNFModVariables;
import net.xstarlotte.snsnf.worldgen.biome.SNSBiomes;
import net.xstarlotte.snsnf.worldgen.biome.SNSSurfaceRules;
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
import terrablender.api.SurfaceRuleManager;

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
        modEventBus.addListener(this::registerNetworking);

        SNSBlock.register(modEventBus);
        SNSBE.register(modEventBus);
        SNSEntity.register(modEventBus);
        SNSItem.register(modEventBus);
        SNSEffect.register(modEventBus);
        SNSTab.register(modEventBus);

        SNSNFModVariables.ATTACHMENT_TYPES.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);



    }


    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            SNSBiomes.registerBiomes();

            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, SNSSurfaceRules.makeCinnamonCraigRules());
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, SNSSurfaceRules.makePeppermintPlainsRules());

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

            //berry

            EntityRenderers.register(SNSEntity.BLACKBOARRY.get(), BlackboarryRenderer::new);
            EntityRenderers.register(SNSEntity.BLUEBOARRY.get(), BlueboarryRenderer::new);
            EntityRenderers.register(SNSEntity.RASPBOARRY.get(), RaspboarryRenderer::new);
            EntityRenderers.register(SNSEntity.STRAWBOARRY.get(), StrawboarryRenderer::new);
            EntityRenderers.register(SNSEntity.JAMSTER.get(), JamsterRenderer::new);

            //cake

            EntityRenderers.register(SNSEntity.CAKE_RABBIT.get(), CakeRabbitRenderer::new);
            EntityRenderers.register(SNSEntity.CHEESECAKE_MOUSE.get(), CheesecakeMouseRenderer::new);

            EntityRenderers.register(SNSEntity.SQUIRROLL.get(), SquirrollRenderer::new);

            //fruit

            EntityRenderers.register(SNSEntity.BUNANA.get(), BunanaRenderer::new);
            EntityRenderers.register(SNSEntity.DUCKANA.get(), DuckanaRenderer::new);
            EntityRenderers.register(SNSEntity.FRUIT_ELF.get(), FruitElfRenderer::new);
            EntityRenderers.register(SNSEntity.FRUIT_PUG.get(), FruitPugRenderer::new);
            EntityRenderers.register(SNSEntity.HAPPLE.get(), HappleRenderer::new);
            EntityRenderers.register(SNSEntity.SNAPPLE.get(), SnappleRenderer::new);

            //herb

            EntityRenderers.register(SNSEntity.CANDY_CANE_CAT.get(), CandyCaneCatRenderer::new);
            EntityRenderers.register(SNSEntity.CANDY_CANE_CROOK.get(), CandyCaneCrookRenderer::new);
            EntityRenderers.register(SNSEntity.CANDY_CANE_FLY.get(), CandyCaneFlyRenderer::new);
            EntityRenderers.register(SNSEntity.CANDY_CANE_TIGER.get(), CandyCaneTigerRenderer::new);
            EntityRenderers.register(SNSEntity.CINNABUN.get(), CinnabunRenderer::new);

            EntityRenderers.register(SNSEntity.GINGERBREAD_MAN.get(), GingerbreadManRenderer::new);

            EntityRenderers.register(SNSEntity.HUMBUG.get(), HumbugRenderer::new);
            EntityRenderers.register(SNSEntity.HUMPUG.get(), HumpugRenderer::new);

            EntityRenderers.register(SNSEntity.MINTMUNK.get(), MintmunkRenderer::new);
            EntityRenderers.register(SNSEntity.MINT_IMPERIAL.get(), MintImperialRenderer::new);
            EntityRenderers.register(SNSEntity.MINT_MARSHMALLOW_SHEEP.get(), MintMarshmallowSheepRenderer::new);

            EntityRenderers.register(SNSEntity.PEPPERMINT_CHURL.get(), PeppermintChurlRenderer::new);
            EntityRenderers.register(SNSEntity.PEPPERMINT_TWIRL.get(), PeppermintTwirlRenderer::new);

            //ice_cream

            EntityRenderers.register(SNSEntity.ICE_CREAM_COW.get(), IceCreamCowRenderer::new);

            EntityRenderers.register(SNSEntity.PARFAIT_PIXIE.get(), ParfaitPixieRenderer::new);

            EntityRenderers.register(SNSEntity.WAFER_WITCH.get(), WaferWitchRenderer::new);

            //sweet


            EntityRenderers.register(SNSEntity.BONBONBINI.get(), BonbonbiniRenderer::new);
            EntityRenderers.register(SNSEntity.CANDYFLOSS_LION.get(), CandyflossLionRenderer::new);
            EntityRenderers.register(SNSEntity.CANDYFLOSS_SHEEP.get(), CandyflossSheepRenderer::new);
            EntityRenderers.register(SNSEntity.CHOCOLATE_CHICKEN.get(), ChocolateChickenRenderer::new);
            EntityRenderers.register(SNSEntity.CHOCOLATE_PENGUIN.get(), ChocolatePenguinRenderer::new);

            EntityRenderers.register(SNSEntity.GUMMY_BEAR.get(), GummyBearRenderer::new);

            EntityRenderers.register(SNSEntity.JELLY_BABY.get(), JellyBabyRenderer::new);

            EntityRenderers.register(SNSEntity.SUGARGLIDER.get(), SugargliderRenderer::new);

            EntityRenderers.register(SNSEntity.TREAT_TOAD.get(), TreatToadRenderer::new);

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