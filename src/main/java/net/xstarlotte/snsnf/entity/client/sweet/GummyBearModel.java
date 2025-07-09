package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.GummyBearEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class GummyBearModel<T extends GummyBearEntity> extends DefaultedEntityGeoModel<T> {
    public GummyBearModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/gummy_bear"), false);

    }

}
