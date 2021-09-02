package multiteam.prehistorian.data;

import multiteam.prehistorian.data.client.ModBlockStateProvider;
import multiteam.prehistorian.data.client.ModItemModelProvider;
import mcp.MethodsReturnNonnullByDefault;
import multiteam.prehistorian.Prehistorian;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@Mod.EventBusSubscriber(modid = Prehistorian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    private DataGen() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
    }
}
