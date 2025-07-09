package net.xstarlotte.snsnf.entity.client.sweet;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import net.xstarlotte.snsnf.entity.custom.sweet.ChocolateChickenEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class ChocolateChickenModel<T extends ChocolateChickenEntity> extends DefaultedEntityGeoModel<T> {
    public ChocolateChickenModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "sweet/chocolate_chicken"), false);

    }

}
