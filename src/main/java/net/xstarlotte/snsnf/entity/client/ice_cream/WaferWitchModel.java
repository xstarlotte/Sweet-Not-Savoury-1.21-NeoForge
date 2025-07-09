package net.xstarlotte.snsnf.entity.client.ice_cream;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.ice_cream.IceCreamCowEntity;
import net.xstarlotte.snsnf.entity.custom.ice_cream.WaferWitchEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class WaferWitchModel<T extends WaferWitchEntity> extends DefaultedEntityGeoModel<T> {
    public WaferWitchModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "ice_cream/wafer_witch"), false);

    }

}
