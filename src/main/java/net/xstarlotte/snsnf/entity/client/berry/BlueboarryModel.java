package net.xstarlotte.snsnf.entity.client.berry;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.berry.BlackboarryEntity;
import net.xstarlotte.snsnf.entity.custom.berry.BlueboarryEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class BlueboarryModel<T extends BlueboarryEntity> extends DefaultedEntityGeoModel<T> {
    public BlueboarryModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "berry/blueboarry"), false);

    }

}
