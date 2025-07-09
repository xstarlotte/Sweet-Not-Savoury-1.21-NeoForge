package net.xstarlotte.snsnf.entity.client.ice_cream;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import net.xstarlotte.snsnf.entity.custom.ice_cream.IceCreamCowEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class IceCreamCowModel<T extends IceCreamCowEntity> extends DefaultedEntityGeoModel<T> {
    public IceCreamCowModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "ice_cream/ice_cream_cow"), false);

    }

}
