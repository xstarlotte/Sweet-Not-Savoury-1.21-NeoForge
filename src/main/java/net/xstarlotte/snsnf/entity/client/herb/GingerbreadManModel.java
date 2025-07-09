package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.GingerbreadManEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class GingerbreadManModel<T extends GingerbreadManEntity> extends DefaultedEntityGeoModel<T> {
    public GingerbreadManModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/gingerbread_man"), false);

    }

}
