package net.xstarlotte.snsnf.entity.client.berry;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.berry.BlackboarryEntity;
import net.xstarlotte.snsnf.entity.custom.berry.RaspboarryEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class RaspboarryModel<T extends RaspboarryEntity> extends DefaultedEntityGeoModel<T> {
    public RaspboarryModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "berry/raspboarry"), false);

    }

}
