package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCrookEntity;
import net.xstarlotte.snsnf.entity.custom.herb.PeppermintChurlEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class PeppermintChurlModel<T extends PeppermintChurlEntity> extends DefaultedEntityGeoModel<T> {
    public PeppermintChurlModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/peppermint_churl"), false);

    }

}
