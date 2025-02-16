package net.xstarlotte.snsnf;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.entity.SNSEntity;
import net.xstarlotte.snsnf.entity.client.herb.*;
import net.xstarlotte.snsnf.item.SNSItem;
import net.xstarlotte.snsnf.item.SNSTab;
import net.xstarlotte.snsnf.mob_effects.SNSEffects;
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
        SNSEffects.register(modEventBus);
        SNSTab.register(modEventBus);


        NeoForge.EVENT_BUS.register(this);
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

            EntityRenderers.register(SNSEntity.MINT_IMPERIAL.get(), MintImperialRenderer::new);
            EntityRenderers.register(SNSEntity.MINT_MARSHMALLOW_SHEEP.get(), MintMarshmallowSheepRenderer::new);
        }
    }
}