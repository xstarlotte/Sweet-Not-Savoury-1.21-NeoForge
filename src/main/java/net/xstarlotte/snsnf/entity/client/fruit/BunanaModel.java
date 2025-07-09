package net.xstarlotte.snsnf.entity.client.fruit;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.fruit.BunanaEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class BunanaModel<T extends BunanaEntity> extends DefaultedEntityGeoModel<T> {
    public BunanaModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "fruit/bunana"), false);

    }

}
