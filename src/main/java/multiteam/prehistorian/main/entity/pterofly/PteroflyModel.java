package multiteam.prehistorian.main.entity.pterofly;

import multiteam.prehistorian.Prehistorian;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PteroflyModel extends AnimatedGeoModel<Pterofly> implements IAnimatable {

    private final AnimationFactory factory = new AnimationFactory(this);

    @Override
    public void registerControllers(AnimationData data) {

    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public ResourceLocation getModelLocation(Pterofly entity) {
        return new ResourceLocation(Prehistorian.MOD_ID, "geo/entity/pterofly.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Pterofly entity) {
        String tex = "";
        switch (entity.getVariant()){
            default:
                tex = "textures/entity/pterofly/aurora_wing.png";
                break;
            case 0:
                tex = "textures/entity/pterofly/aurora_wing.png";
                break;
            case 1:
                tex = "textures/entity/pterofly/green_wing.png";
                break;
            case 2:
                tex = "textures/entity/pterofly/rain_wing.png";
                break;
        }
        return new ResourceLocation(Prehistorian.MOD_ID, tex);
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Pterofly animatable) {
        return new ResourceLocation(Prehistorian.MOD_ID, "animations/entity/pterofly.animation.json");
    }
}
