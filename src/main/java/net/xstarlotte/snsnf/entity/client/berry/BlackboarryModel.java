package net.xstarlotte.snsnf.entity.client.berry;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.berry.BlackboarryEntity;
import net.xstarlotte.snsnf.entity.custom.fruit.DuckanaEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class BlackboarryModel<T extends BlackboarryEntity> extends DefaultedEntityGeoModel<T> {
    public BlackboarryModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "berry/blackboarry"), false);

    }

}
