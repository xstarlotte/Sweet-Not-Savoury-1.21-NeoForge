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
import net.xstarlotte.snsnf.entity.custom.berry.*;
import net.xstarlotte.snsnf.entity.custom.cake.CakeRabbitEntity;
import net.xstarlotte.snsnf.entity.custom.cake.CheesecakeMouseEntity;
import net.xstarlotte.snsnf.entity.custom.cake.SquirrollEntity;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitPugEntity;
import net.xstarlotte.snsnf.entity.custom.herb.*;
import net.xstarlotte.snsnf.entity.custom.ice_cream.IceCreamCowEntity;
import net.xstarlotte.snsnf.entity.custom.ice_cream.ParfaitPixieEntity;
import net.xstarlotte.snsnf.entity.custom.ice_cream.WaferWitchEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.*;

@EventBusSubscriber(modid = SNSNF.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class SNSEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {

        //berry

        event.put(SNSEntity.BLACKBOARRY.get(), BlackboarryEntity.createAttributes().build());
        event.put(SNSEntity.BLUEBOARRY.get(), BlueboarryEntity.createAttributes().build());
        event.put(SNSEntity.RASPBOARRY.get(), RaspboarryEntity.createAttributes().build());
        event.put(SNSEntity.STRAWBOARRY.get(), StrawboarryEntity.createAttributes().build());
        event.put(SNSEntity.JAMSTER.get(), JamsterEntity.createAttributes().build());

        //cake

        event.put(SNSEntity.CAKE_RABBIT.get(), CakeRabbitEntity.createAttributes().build());
        event.put(SNSEntity.CHEESECAKE_MOUSE.get(), CheesecakeMouseEntity.createAttributes().build());

        event.put(SNSEntity.SQUIRROLL.get(), SquirrollEntity.createAttributes().build());

        //fruit

        event.put(SNSEntity.BUNANA.get(), FruitElfEntity.createAttributes().build());
        event.put(SNSEntity.DUCKANA.get(), FruitElfEntity.createAttributes().build());
        event.put(SNSEntity.FRUIT_ELF.get(), FruitElfEntity.createAttributes().build());
        event.put(SNSEntity.FRUIT_PUG.get(), FruitPugEntity.createAttributes().build());
        event.put(SNSEntity.HAPPLE.get(), FruitPugEntity.createAttributes().build());
        event.put(SNSEntity.SNAPPLE.get(), FruitPugEntity.createAttributes().build());

        //herb

        event.put(SNSEntity.CANDY_CANE_CAT.get(), CandyCaneCatEntity.createAttributes().build());
        event.put(SNSEntity.CANDY_CANE_CROOK.get(), CandyCaneCrookEntity.createAttributes().build());
        event.put(SNSEntity.CANDY_CANE_FLY.get(), CandyCaneFlyEntity.createAttributes().build());
        event.put(SNSEntity.CANDY_CANE_TIGER.get(), CandyCaneTigerEntity.createAttributes().build());
        event.put(SNSEntity.CINNABUN.get(), CandyCaneTigerEntity.createAttributes().build());

        event.put(SNSEntity.GINGERBREAD_MAN.get(), GingerbreadManEntity.createAttributes().build());

        event.put(SNSEntity.HUMBUG.get(), HumbugEntity.createAttributes().build());
        event.put(SNSEntity.HUMPUG.get(), HumpugEntity.createAttributes().build());

        event.put(SNSEntity.MINTMUNK.get(), MintmunkEntity.createAttributes().build());
        event.put(SNSEntity.MINT_IMPERIAL.get(), MintImperialEntity.createAttributes().build());
        event.put(SNSEntity.MINT_MARSHMALLOW_SHEEP.get(), MintMarshmallowSheepEntity.createAttributes().build());

        event.put(SNSEntity.PEPPERMINT_CHURL.get(), PeppermintChurlEntity.createAttributes().build());
        event.put(SNSEntity.PEPPERMINT_TWIRL.get(), PeppermintChurlEntity.createAttributes().build());

        //ice_cream

        event.put(SNSEntity.ICE_CREAM_COW.get(), IceCreamCowEntity.createAttributes().build());

        event.put(SNSEntity.PARFAIT_PIXIE.get(), ParfaitPixieEntity.createAttributes().build());

        event.put(SNSEntity.WAFER_WITCH.get(), WaferWitchEntity.createAttributes().build());

        //sweet

        event.put(SNSEntity.BONBONBINI.get(), BonbonbiniEntity.createAttributes().build());

        event.put(SNSEntity.CANDYFLOSS_LION.get(), CandyflossLionEntity.createAttributes().build());
        event.put(SNSEntity.CANDYFLOSS_SHEEP.get(), CandyflossSheepEntity.createAttributes().build());
        event.put(SNSEntity.CHOCOLATE_CHICKEN.get(), ChocolateChickenEntity.createAttributes().build());
        event.put(SNSEntity.CHOCOLATE_PENGUIN.get(), ChocolatePenguinEntity.createAttributes().build());

        event.put(SNSEntity.GUMMY_BEAR.get(), GummyBearEntity.createAttributes().build());

        event.put(SNSEntity.JELLY_BABY.get(), JellyBabyEntity.createAttributes().build());

        event.put(SNSEntity.SUGARGLIDER.get(), SugargliderEntity.createAttributes().build());

        event.put(SNSEntity.TREAT_TOAD.get(),TreatToadEntity.createAttributes().build());

    }
    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {

        //berry

        event.register(SNSEntity.JAMSTER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        //cake

        event.register(SNSEntity.CAKE_RABBIT.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CHEESECAKE_MOUSE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.SQUIRROLL.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        //fruit

        event.register(SNSEntity.BUNANA.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.DUCKANA.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.FRUIT_ELF.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.FRUIT_PUG.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.HAPPLE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.SNAPPLE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        //herb

        event.register(SNSEntity.CANDY_CANE_CAT.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CANDY_CANE_CROOK.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CANDY_CANE_FLY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Mob::checkMobSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CANDY_CANE_TIGER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CINNABUN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.GINGERBREAD_MAN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

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
        event.register(SNSEntity.PEPPERMINT_TWIRL.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        //ice_cream

        event.register(SNSEntity.ICE_CREAM_COW.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.PARFAIT_PIXIE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.WAFER_WITCH.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        //sweet

        event.register(SNSEntity.BONBONBINI.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.CANDYFLOSS_LION.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CANDYFLOSS_SHEEP.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CHOCOLATE_CHICKEN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(SNSEntity.CHOCOLATE_PENGUIN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.GUMMY_BEAR.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.JELLY_BABY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.SUGARGLIDER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(SNSEntity.TREAT_TOAD.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

    }
}
