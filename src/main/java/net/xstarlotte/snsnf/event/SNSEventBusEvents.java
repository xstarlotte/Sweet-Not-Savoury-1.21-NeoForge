package net.xstarlotte.snsnf.event;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.SNSEntity;
import net.xstarlotte.snsnf.entity.custom.herb.*;

@EventBusSubscriber(modid = SNSNF.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class SNSEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(SNSEntity.CANDY_CANE_CAT.get(), CandyCaneCatEntity.createAttributes().build());
        event.put(SNSEntity.CANDY_CANE_CROOK.get(), CandyCaneCrookEntity.createAttributes().build());
        event.put(SNSEntity.CANDY_CANE_FLY.get(), CandyCaneFlyEntity.createAttributes().build());

        event.put(SNSEntity.HUMBUG.get(), HumbugEntity.createAttributes().build());
        event.put(SNSEntity.HUMPUG.get(), HumpugEntity.createAttributes().build());

        event.put(SNSEntity.MINTMUNK.get(), MintmunkEntity.createAttributes().build());
        event.put(SNSEntity.MINT_IMPERIAL.get(), MintImperialEntity.createAttributes().build());
        event.put(SNSEntity.MINT_MARSHMALLOW_SHEEP.get(), MintMarshmallowSheepEntity.createAttributes().build());

        event.put(SNSEntity.PEPPERMINT_CHURL.get(), PeppermintChurlEntity.createAttributes().build());
    }
    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(SNSEntity.CANDY_CANE_CAT.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CANDY_CANE_CROOK.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CANDY_CANE_FLY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.HUMBUG.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.HUMPUG.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.MINTMUNK.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.MINT_IMPERIAL.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.MINT_MARSHMALLOW_SHEEP.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.PEPPERMINT_CHURL.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }
}
