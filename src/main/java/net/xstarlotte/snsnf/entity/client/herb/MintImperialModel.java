package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.MintImperialEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class MintImperialModel<T extends MintImperialEntity> extends DefaultedEntityGeoModel<T> {
    public MintImperialModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/mint_imperial"), false);

    }

}
