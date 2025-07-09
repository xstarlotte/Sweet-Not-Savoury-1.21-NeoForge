package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.SugargliderEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class SugargliderModel<T extends SugargliderEntity> extends DefaultedEntityGeoModel<T> {
    public SugargliderModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/sugarglider"), false);

    }

}
