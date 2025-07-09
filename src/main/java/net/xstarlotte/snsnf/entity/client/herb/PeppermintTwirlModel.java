package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.PeppermintChurlEntity;
import net.xstarlotte.snsnf.entity.custom.herb.PeppermintTwirlEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class PeppermintTwirlModel<T extends PeppermintTwirlEntity> extends DefaultedEntityGeoModel<T> {
    public PeppermintTwirlModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/peppermint_twirl"), false);

    }

}
