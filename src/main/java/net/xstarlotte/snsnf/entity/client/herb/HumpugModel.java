package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.HumpugEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class HumpugModel<T extends HumpugEntity> extends DefaultedEntityGeoModel<T> {
    public HumpugModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/humpug"), false);

    }

}
