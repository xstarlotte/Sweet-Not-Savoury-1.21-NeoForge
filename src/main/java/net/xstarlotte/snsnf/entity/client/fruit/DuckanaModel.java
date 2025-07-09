package net.xstarlotte.snsnf.entity.client.fruit;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.fruit.DuckanaEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class DuckanaModel<T extends DuckanaEntity> extends DefaultedEntityGeoModel<T> {
    public DuckanaModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "fruit/duckana"), false);

    }

}
