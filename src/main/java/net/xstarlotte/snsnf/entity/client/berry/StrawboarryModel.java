package net.xstarlotte.snsnf.entity.client.berry;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.berry.BlackboarryEntity;
import net.xstarlotte.snsnf.entity.custom.berry.StrawboarryEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class StrawboarryModel<T extends StrawboarryEntity> extends DefaultedEntityGeoModel<T> {
    public StrawboarryModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "berry/strawboarry"), false);

    }

}
