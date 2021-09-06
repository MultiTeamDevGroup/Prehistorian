package multiteam.prehistorian;

import multiteam.multicore_lib.setup.utilities.ItemGroupTool;
import multiteam.prehistorian.main.Registration;
import multiteam.prehistorian.main.block.ModBlocks;
import multiteam.prehistorian.main.entity.ModEntities;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("prehistorian")
public class Prehistorian
{
    public static final String MOD_ID = "prehistorian";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final ItemGroupTool PREHISTORIAN_MAIN = new ItemGroupTool("prehistorian_main", () -> new ItemStack(ModBlocks.FOSSIL_ANCIENT_STONE.get()));
    public static final ItemGroupTool PREHISTORIAN_CREATURES = new ItemGroupTool("prehistorian_creatures", () -> new ItemStack(Items.AIR));

    public Prehistorian() {

        Registration.register();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        ModEntities.applyAttributes();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        ModEntities.clientSetup(event);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }

    private void processIMC(final InterModProcessEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {

        }
    }
}
