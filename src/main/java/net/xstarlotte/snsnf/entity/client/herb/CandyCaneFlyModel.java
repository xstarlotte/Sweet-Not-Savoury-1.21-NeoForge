package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneFlyEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyCaneFlyModel<T extends CandyCaneFlyEntity> extends DefaultedEntityGeoModel<T> {
    public CandyCaneFlyModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/candy_cane_fly"), false);

    }

}
