package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.CandyflossSheepEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CandyflossSheepModel<T extends CandyflossSheepEntity> extends DefaultedEntityGeoModel<T> {
    public CandyflossSheepModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/candyfloss_sheep"), false);

    }

}
