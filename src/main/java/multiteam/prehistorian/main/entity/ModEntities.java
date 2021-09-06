package multiteam.prehistorian.main.entity;

import multiteam.multicore_lib.setup.utilities.RegistrationTool;
import multiteam.prehistorian.main.Registration;
import multiteam.prehistorian.main.entity.pterofly.Pterofly;
import multiteam.prehistorian.main.entity.pterofly.PteroflyRenderer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ModEntities {

    public static final RegistryObject<EntityType<Pterofly>> PTEROFLY = RegistrationTool.buildEntity(Pterofly::new, Pterofly.class, 0.7F, 0.4F, EntityClassification.CREATURE, 8, 3, Registration.ENTITY_TYPES); //3 for update interval is default


    public static void clientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(PTEROFLY.get(), PteroflyRenderer::new);
    }

    public static void applyAttributes(){
        GlobalEntityTypeAttributes.put(PTEROFLY.get(), Pterofly.createAttributes().build());
    }

    public static void register() { }

}
