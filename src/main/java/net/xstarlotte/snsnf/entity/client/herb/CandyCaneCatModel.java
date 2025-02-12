package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneflyEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyCaneCatModel<T extends CandyCaneCatEntity> extends DefaultedEntityGeoModel<T> {
    public CandyCaneCatModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/candycanecat"), false);

    }

}
