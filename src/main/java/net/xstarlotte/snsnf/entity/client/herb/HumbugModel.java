package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.HumbugEntity;
import net.xstarlotte.snsnf.entity.custom.herb.PeppermintChurlEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class HumbugModel<T extends HumbugEntity> extends DefaultedEntityGeoModel<T> {
    public HumbugModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/humbug"), false);

    }

}
