package net.xstarlotte.snsnf.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.xstarlotte.snsnf.util.SNSTag;

public class SNSToolTiers {
    public static final Tier HERB = new SimpleTier(SNSTag.Blocks.INCORRECT_FOR_HERB_TOOL, 2064, 9f, 1f, 15,
            () -> Ingredient.of(SNSItem.CANDY_CANE.get()));
}
