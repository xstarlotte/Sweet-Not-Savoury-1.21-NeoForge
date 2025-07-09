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
                    .icon(() -> new ItemStack(SNSBlock.PEPPERMINT_SWIRL_STONE.get()))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(SNSBlock.CANDYFLOSS_BLOCK);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BUTTON);
                        pOutput.accept(SNSBlock.CANDYFLOSS_DOOR);
                        pOutput.accept(SNSBlock.CANDYFLOSS_FENCE);
                        pOutput.accept(SNSBlock.CANDYFLOSS_FENCE_GATE);
                        pOutput.accept(SNSBlock.CANDYFLOSS_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.CANDYFLOSS_SLAB);
                        pOutput.accept(SNSBlock.CANDYFLOSS_STAIRS);
                        pOutput.accept(SNSBlock.CANDYFLOSS_TRAPDOOR);
                        pOutput.accept(SNSBlock.CANDYFLOSS_WALL);

                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BUTTON);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_DOOR);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE_GATE);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_SLAB);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_STAIRS);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_TRAPDOOR);
                        pOutput.accept(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_WALL);

                        pOutput.accept(SNSBlock.CANDY_CANE_BUSH);
                        pOutput.accept(SNSBlock.CANDY_CANE_CARNATION);
                        pOutput.accept(SNSBlock.CANDY_CANE_FLOWER);
                        pOutput.accept(SNSBlock.CANDY_CANE_FLOWER_2);
                        pOutput.accept(SNSBlock.CANDY_CANE_FLOWER_3);
                        pOutput.accept(SNSBlock.CANDY_CANE_FLOWER_4);
                        pOutput.accept(SNSBlock.CANDY_CANE_GRASS);
                        pOutput.accept(SNSBlock.CANDY_CANE_GRASS_LONG);
                        pOutput.accept(SNSBlock.CANDY_CANE_CAT_TEDDY);
                        pOutput.accept(SNSBlock.CANDY_CANE_LOG);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANKS);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_BUTTON);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_DOOR);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_FENCE);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_FENCE_GATE);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_SLAB);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_STAIRS);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_TRAPDOOR);
                        pOutput.accept(SNSBlock.CANDY_CANE_PLANK_WALL);


                        pOutput.accept(SNSBlock.CHOCOLATE_BRICKS);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_BUTTON);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_DOOR);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_FENCE);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_FENCE_GATE);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_SLAB);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_STAIRS);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_TRAPDOOR);
                        pOutput.accept(SNSBlock.CHOCOLATE_BRICK_WALL);

                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICKS);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_BUTTON);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_DOOR);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE_GATE);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_SLAB);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_STAIRS);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_TRAPDOOR);
                        pOutput.accept(SNSBlock.CHOCOLATE_WHITE_BRICK_WALL);

                        pOutput.accept(SNSBlock.CINNAMON_GRASS_BLOCK);

                        pOutput.accept(SNSBlock.GUMMY_APPLE_BLOCK);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_BUTTON);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_DOOR);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_FENCE);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_FENCE_GATE);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_SLAB);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_STAIRS);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_TRAPDOOR);
                        pOutput.accept(SNSBlock.GUMMY_APPLE_WALL);

                        pOutput.accept(SNSBlock.GUMMY_BANANA_BLOCK);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_BUTTON);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_DOOR);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_FENCE);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_FENCE_GATE);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_SLAB);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_STAIRS);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_TRAPDOOR);
                        pOutput.accept(SNSBlock.GUMMY_BANANA_WALL);

                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_BLOCK);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_BUTTON);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_DOOR);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_FENCE);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_FENCE_GATE);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_SLAB);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_STAIRS);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_TRAPDOOR);
                        pOutput.accept(SNSBlock.GUMMY_BLACKBERRY_WALL);

                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_BLOCK);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_BUTTON);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_DOOR);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_FENCE);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_FENCE_GATE);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_SLAB);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_STAIRS);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_TRAPDOOR);
                        pOutput.accept(SNSBlock.GUMMY_BLUEBERRY_WALL);

                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_BLOCK);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_BUTTON);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_DOOR);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_FENCE);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_FENCE_GATE);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_SLAB);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_STAIRS);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_TRAPDOOR);
                        pOutput.accept(SNSBlock.GUMMY_RASPBERRY_WALL);

                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_BLOCK);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_BUTTON);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_DOOR);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_FENCE);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_FENCE_GATE);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_SLAB);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_STAIRS);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_TRAPDOOR);
                        pOutput.accept(SNSBlock.GUMMY_STRAWBERRY_WALL);

                        pOutput.accept(SNSBlock.HUMBUG_BRICK);
                        pOutput.accept(SNSBlock.HUMBUG_BRICK_BUTTON);
                        pOutput.accept(SNSBlock.HUMBUG_BRICK_DOOR);
                        pOutput.accept(SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.HUMBUG_BRICK_SLAB);
                        pOutput.accept(SNSBlock.HUMBUG_BRICK_STAIRS);
                        pOutput.accept(SNSBlock.HUMBUG_BRICK_TRAPDOOR);
                        pOutput.accept(SNSBlock.HUMBUG_BRICK_WALL);

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

                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_BRICK);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_BRICK_BUTTON);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_BRICK_DOOR);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_BRICK_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_BRICK_SLAB);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_BRICK_STAIRS);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_BRICK_TRAPDOOR);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_BRICK_WALL);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE_BUTTON);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE_DOOR);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE_COAL_ORE);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE_SLAB);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE_STAIRS);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE_TRAPDOOR);
                        pOutput.accept(SNSBlock.PEPPERMINT_SWIRL_STONE_WALL);

                        pOutput.accept(SNSBlock.WAFFLE_BLOCK);
                        pOutput.accept(SNSBlock.WAFFLE_BUTTON);
                        pOutput.accept(SNSBlock.WAFFLE_DOOR);
                        pOutput.accept(SNSBlock.WAFFLE_FENCE);
                        pOutput.accept(SNSBlock.WAFFLE_FENCE_GATE);
                        pOutput.accept(SNSBlock.WAFFLE_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.WAFFLE_SLAB);
                        pOutput.accept(SNSBlock.WAFFLE_STAIRS);
                        pOutput.accept(SNSBlock.WAFFLE_TRAPDOOR);
                        pOutput.accept(SNSBlock.WAFFLE_WALL);

                        pOutput.accept(SNSBlock.WAFFLE_BRICKS);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_BUTTON);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_DOOR);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_FENCE);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_FENCE_GATE);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_PRESSURE_PLATE);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_SLAB);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_STAIRS);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_TRAPDOOR);
                        pOutput.accept(SNSBlock.WAFFLE_BRICK_WALL);

                    }).build());

    public static final Supplier<CreativeModeTab> SNS_ITEM =
            CREATIVE_MODE_TABS.register("sns_item", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.snsnf.sns_item"))
                    .icon(() -> new ItemStack(SNSItem.CANDY_CANE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sns_block"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(SNSItem.BONBONBINI_SPAWN_EGG);
                        pOutput.accept(SNSItem.BUNANA_SPAWN_EGG);

                        pOutput.accept(SNSItem.CAKE_RABBIT_SPAWN_EGG);
                        pOutput.accept(SNSItem.CANDYFLOSS_LION_SPAWN_EGG);
                        pOutput.accept(SNSItem.CANDYFLOSS_SHEEP_SPAWN_EGG);
                        pOutput.accept(SNSItem.CANDY_CANE_CAT_SPAWN_EGG);
                        pOutput.accept(SNSItem.CANDY_CANE_CROOK_SPAWN_EGG);
                        pOutput.accept(SNSItem.CANDY_CANE_FLY_SPAWN_EGG);
                        pOutput.accept(SNSItem.CANDY_CANE_TIGER_SPAWN_EGG);
                        pOutput.accept(SNSItem.CHEESECAKE_MOUSE_SPAWN_EGG);
                        pOutput.accept(SNSItem.CHOCOLATE_CHICKEN_SPAWN_EGG);
                        pOutput.accept(SNSItem.CHOCOLATE_PENGUIN_SPAWN_EGG);
                        pOutput.accept(SNSItem.CINNABUN_SPAWN_EGG);

                        pOutput.accept(SNSItem.DUCKANA_SPAWN_EGG);

                        pOutput.accept(SNSItem.FRUIT_ELF_SPAWN_EGG);
                        pOutput.accept(SNSItem.FRUIT_PUG_SPAWN_EGG);

                        pOutput.accept(SNSItem.GINGERBREAD_MAN_SPAWN_EGG);
                        pOutput.accept(SNSItem.GUMMY_BEAR_SPAWN_EGG);

                        pOutput.accept(SNSItem.HAPPLE_SPAWN_EGG);
                        pOutput.accept(SNSItem.HUMBUG_SPAWN_EGG);
                        pOutput.accept(SNSItem.HUMPUG_SPAWN_EGG);

                        pOutput.accept(SNSItem.ICE_CREAM_COW_SPAWN_EGG);

                        pOutput.accept(SNSItem.JAMSTER_SPAWN_EGG);
                        pOutput.accept(SNSItem.JELLY_BABY_SPAWN_EGG);

                        pOutput.accept(SNSItem.MINTMUNK_SPAWN_EGG);
                        pOutput.accept(SNSItem.MINT_IMPERIAL_SPAWN_EGG);
                        pOutput.accept(SNSItem.MINT_MARSHMALLOW_SHEEP_SPAWN_EGG);

                        pOutput.accept(SNSItem.PARFAIT_PIXIE_SPAWN_EGG);
                        pOutput.accept(SNSItem.PEPPERMINT_CHURL_SPAWN_EGG);
                        pOutput.accept(SNSItem.PEPPERMINT_TWIRL_SPAWN_EGG);

                        pOutput.accept(SNSItem.SNAPPLE_SPAWN_EGG);
                        pOutput.accept(SNSItem.SQUIRROLL_SPAWN_EGG);
                        pOutput.accept(SNSItem.SUGARGLIDER_SPAWN_EGG);

                        pOutput.accept(SNSItem.TREAT_TOAD_SPAWN_EGG);

                        pOutput.accept(SNSItem.WAFER_WITCH_SPAWN_EGG);




                        pOutput.accept(SNSItem.CANDYFLOSS);
                        pOutput.accept(SNSItem.CANDYFLOSS_BLUE_RASPBERRY);
                        pOutput.accept(SNSItem.CANDY_CANE);
                        pOutput.accept(SNSItem.CANDY_CANE_SUGAR);
                        pOutput.accept(SNSItem.CANDY_CANE_SUGAR_CANE);
                        pOutput.accept(SNSItem.CANDY_CANE_SWORD);
                        pOutput.accept(SNSItem.CHOCOLATE_EGG);
                        pOutput.accept(SNSItem.CHOCOLATE_WHITE_EGG);
                        pOutput.accept(SNSItem.CINNAMON);
                        pOutput.accept(SNSItem.CINNAMON_BUN);
                        pOutput.accept(SNSItem.CONE);

                        pOutput.accept(SNSItem.GELATIN);
                        pOutput.accept(SNSItem.GUMMY_APPLE);
                        pOutput.accept(SNSItem.GUMMY_BANANA);
                        pOutput.accept(SNSItem.GUMMY_BLACKBERRY);
                        pOutput.accept(SNSItem.GUMMY_BLUEBERRY);
                        pOutput.accept(SNSItem.GUMMY_RASPBERRY);
                        pOutput.accept(SNSItem.GUMMY_STRAWBERRY);

                        pOutput.accept(SNSItem.HUMBUG);

                        pOutput.accept(SNSItem.ICE_CREAM);

                        pOutput.accept(SNSItem.MINT_MARSHMALLOW);

                        pOutput.accept(SNSItem.WAFFLE_STICK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
