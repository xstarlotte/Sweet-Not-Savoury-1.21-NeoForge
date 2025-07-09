package net.xstarlotte.snsnf.entity.client.cake;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.cake.SquirrollEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class SquirrollModel<T extends SquirrollEntity> extends DefaultedEntityGeoModel<T> {
    public SquirrollModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "cake/squirroll"), false);

    }

}
