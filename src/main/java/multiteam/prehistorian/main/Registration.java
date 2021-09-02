package multiteam.prehistorian.main;

import multiteam.prehistorian.Prehistorian;
import multiteam.prehistorian.main.block.ModBlocks;
import multiteam.prehistorian.main.entity.ModEntities;
import multiteam.prehistorian.main.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Prehistorian.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Prehistorian.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Prehistorian.MOD_ID);
    //public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Prehistorian.MOD_ID);
    //public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Prehistorian.MOD_ID);

    public static void register(){
        IEventBus modeEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modeEventBus);
        ITEMS.register(modeEventBus);
        ENTITY_TYPES.register(modeEventBus);
        //SOUND_EVENTS.register(modeEventBus);
        //TILE_ENTITY_TYPES.register(modeEventBus);

        ModBlocks.register();
        ModItems.register();
        ModEntities.register();
        //ModSound.register();
    }
}
