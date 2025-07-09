package net.xstarlotte.snsnf.entity.client.fruit;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.fruit.HappleEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class HappleModel<T extends HappleEntity> extends DefaultedEntityGeoModel<T> {
    public HappleModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "fruit/happle"), false);

    }

}
