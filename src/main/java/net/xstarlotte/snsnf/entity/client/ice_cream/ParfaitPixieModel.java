package net.xstarlotte.snsnf.entity.client.ice_cream;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.ice_cream.IceCreamCowEntity;
import net.xstarlotte.snsnf.entity.custom.ice_cream.ParfaitPixieEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ParfaitPixieModel<T extends ParfaitPixieEntity> extends DefaultedEntityGeoModel<T> {
    public ParfaitPixieModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "ice_cream/parfait_pixie"), false);

    }

}
