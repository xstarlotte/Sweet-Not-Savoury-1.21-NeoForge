package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.ChocolatePenguinEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ChocolatePenguinModel<T extends ChocolatePenguinEntity> extends DefaultedEntityGeoModel<T> {
    public ChocolatePenguinModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/chocolate_penguin"), false);

    }

}
