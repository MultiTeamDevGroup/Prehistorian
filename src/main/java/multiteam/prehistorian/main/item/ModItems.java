package multiteam.prehistorian.main.item;

import multiteam.prehistorian.Prehistorian;
import multiteam.prehistorian.main.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> ANCIENT_FOSSIL = Registration.ITEMS.register("ancient_fossil", () -> new Item(new Item.Properties().tab(Prehistorian.PREHISTORIAN_MAIN)));


    public static void register(){}
}
