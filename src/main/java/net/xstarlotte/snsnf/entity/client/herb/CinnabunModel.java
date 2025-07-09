package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CinnabunEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CinnabunModel<T extends CinnabunEntity> extends DefaultedEntityGeoModel<T> {
    public CinnabunModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/cinnabun"), false);

    }

}
