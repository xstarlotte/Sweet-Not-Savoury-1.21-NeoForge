package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.MintMarshmallowSheepEntity;
import net.xstarlotte.snsnf.entity.custom.herb.MintmunkEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class MintmunkModel<T extends MintmunkEntity> extends DefaultedEntityGeoModel<T> {
    public MintmunkModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/mintmunk"), false);

    }

}
