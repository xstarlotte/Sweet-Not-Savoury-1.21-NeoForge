package net.xstarlotte.snsnf.entity.client.herb;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.MintMarshmallowSheepEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class MintMarshmallowSheepModel<T extends MintMarshmallowSheepEntity> extends DefaultedEntityGeoModel<T> {
    public MintMarshmallowSheepModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "herb/mint_marshmallow_sheep"), false);

    }

}
