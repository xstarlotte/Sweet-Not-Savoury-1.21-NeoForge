package net.xstarlotte.snsnf.entity.client.herb;

import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneflyVariant;
import net.xstarlotte.snsnf.entity.client.variant.CatVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneflyEntity;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

import java.util.Map;

public class CandyCaneflyModel<T extends CandyCaneflyEntity> extends DefaultedEntityGeoModel<T> {
    public CandyCaneflyModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/candycanefly"), false);

    }

}
