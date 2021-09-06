package multiteam.prehistorian.main.item;

import multiteam.prehistorian.Prehistorian;
import multiteam.prehistorian.main.Registration;
import multiteam.prehistorian.main.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> ANCIENT_FOSSIL = Registration.ITEMS.register("ancient_fossil", () -> new Item(new Item.Properties().tab(Prehistorian.PREHISTORIAN_MAIN)));

    //Spawn Eggs
    public static final RegistryObject<MobSpawnEggItem> PTEROFLY_SPAWN_EGG = Registration.ITEMS.register("pterofly_spawn_egg", () -> new MobSpawnEggItem(ModEntities.PTEROFLY, 0x3b2923, 0xff842f, new Item.Properties().tab(Prehistorian.PREHISTORIAN_CREATURES)));

    public static void register(){}
}
