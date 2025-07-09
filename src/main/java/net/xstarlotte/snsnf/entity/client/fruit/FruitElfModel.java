package net.xstarlotte.snsnf.entity.client.fruit;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class FruitElfModel<T extends FruitElfEntity> extends DefaultedEntityGeoModel<T> {
    public FruitElfModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "fruit/fruit_elf"), false);

    }

}
