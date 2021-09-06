package multiteam.prehistorian.data.client;

import mcp.MethodsReturnNonnullByDefault;
import multiteam.prehistorian.Prehistorian;
import multiteam.prehistorian.main.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Prehistorian.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Blockitems
        withExistingParent("ancient_stone", modLoc("block/ancient_stone"));
        withExistingParent("fossil_ancient_stone", modLoc("block/fossil_ancient_stone"));

        //Items
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile spawneggParent = getExistingFile(mcLoc("item/template_spawn_egg"));

        //Regular Items
        generatedBuilder(itemGenerated, "ancient_fossil");
        spawneggBuilder(spawneggParent, "pterofly_spawn_egg");

    }

    private ItemModelBuilder generatedBuilder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/"+name);
    }

    private ItemModelBuilder spawneggBuilder(ModelFile spawneggParent, String name) {
        return getBuilder(name).parent(spawneggParent);
    }

}