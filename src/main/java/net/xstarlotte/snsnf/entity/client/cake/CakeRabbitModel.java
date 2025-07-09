package net.xstarlotte.snsnf.entity.client.cake;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.cake.CakeRabbitEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CakeRabbitModel<T extends CakeRabbitEntity> extends DefaultedEntityGeoModel<T> {
    public CakeRabbitModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "cake/cake_rabbit"), false);

    }

}
