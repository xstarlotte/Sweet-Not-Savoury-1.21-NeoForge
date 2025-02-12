package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneflyEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyCaneflyModel<T extends CandyCaneflyEntity> extends DefaultedEntityGeoModel<T> {
    public CandyCaneflyModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/candycanefly"), false);

    }

}
