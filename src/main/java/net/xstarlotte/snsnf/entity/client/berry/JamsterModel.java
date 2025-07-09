package net.xstarlotte.snsnf.entity.client.berry;

import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.berry.JamsterEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class JamsterModel<T extends JamsterEntity> extends DefaultedEntityGeoModel<T> {
    public JamsterModel() {
        super(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "berry/jamster"), false);

    }

}
