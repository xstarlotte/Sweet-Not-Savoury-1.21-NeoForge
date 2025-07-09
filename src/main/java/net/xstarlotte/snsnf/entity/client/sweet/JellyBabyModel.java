package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.JellyBabyEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class JellyBabyModel<T extends JellyBabyEntity> extends DefaultedEntityGeoModel<T> {
    public JellyBabyModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/jelly_baby"), false);

    }

}
