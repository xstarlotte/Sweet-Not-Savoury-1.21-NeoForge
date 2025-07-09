package net.xstarlotte.snsnf.entity.client.fruit;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitPugEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class FruitPugModel<T extends FruitPugEntity> extends DefaultedEntityGeoModel<T> {
    public FruitPugModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "fruit/fruit_pug"), false);

    }

}
