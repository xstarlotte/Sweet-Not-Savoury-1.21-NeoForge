package net.xstarlotte.snsnf.item;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class HerbEffectSwordItem extends SwordItem {
    private final Holder<MobEffect> effect;

    public HerbEffectSwordItem(Tier pTier, Properties pProperties, Holder<MobEffect> effect) {
        super(pTier, pProperties);
        this.effect = effect;
    }

}
