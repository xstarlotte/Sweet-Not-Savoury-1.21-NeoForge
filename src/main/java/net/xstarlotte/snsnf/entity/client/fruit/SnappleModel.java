package net.xstarlotte.snsnf.entity.client.fruit;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.fruit.SnappleEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class SnappleModel<T extends SnappleEntity> extends DefaultedEntityGeoModel<T> {
    public SnappleModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "fruit/snapple"), false);

    }

}
