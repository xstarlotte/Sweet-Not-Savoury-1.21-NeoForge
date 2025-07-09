package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.ice_cream.WaferWitchEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class BonbonbiniModel<T extends BonbonbiniEntity> extends DefaultedEntityGeoModel<T> {
    public BonbonbiniModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/bonbonbini"), false);

    }

}
