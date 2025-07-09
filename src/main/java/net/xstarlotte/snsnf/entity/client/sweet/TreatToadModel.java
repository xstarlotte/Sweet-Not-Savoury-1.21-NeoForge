package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.TreatToadEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class TreatToadModel<T extends TreatToadEntity> extends DefaultedEntityGeoModel<T> {
    public TreatToadModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/treat_toad"), false);

    }

}
