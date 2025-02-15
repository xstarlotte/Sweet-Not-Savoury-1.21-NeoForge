package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCrookEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyCaneCrookModel<T extends CandyCaneCrookEntity> extends DefaultedEntityGeoModel<T> {
    public CandyCaneCrookModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/candy_cane_crook"), false);

    }

}
