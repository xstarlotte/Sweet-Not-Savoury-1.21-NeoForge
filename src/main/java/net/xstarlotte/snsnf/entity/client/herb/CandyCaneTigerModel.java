package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneTigerEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyCaneTigerModel<T extends CandyCaneTigerEntity> extends DefaultedEntityGeoModel<T> {
    public CandyCaneTigerModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/candy_cane_tiger"), false);

    }

}
