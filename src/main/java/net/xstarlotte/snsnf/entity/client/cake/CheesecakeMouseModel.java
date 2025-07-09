package net.xstarlotte.snsnf.entity.client.cake;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.cake.CheesecakeMouseEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class CheesecakeMouseModel<T extends CheesecakeMouseEntity> extends DefaultedEntityGeoModel<T> {
    public CheesecakeMouseModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "cake/cheesecake_mouse"), false);

    }

}
