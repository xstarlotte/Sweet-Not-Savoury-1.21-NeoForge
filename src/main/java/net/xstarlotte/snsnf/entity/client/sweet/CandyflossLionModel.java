package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.CandyflossLionEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyflossLionModel<T extends CandyflossLionEntity> extends DefaultedEntityGeoModel<T> {
    public CandyflossLionModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/candyfloss_lion"), false);

    }

}
