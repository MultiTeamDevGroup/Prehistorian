package multiteam.prehistorian.data.client;

import mcp.MethodsReturnNonnullByDefault;
import multiteam.prehistorian.Prehistorian;
import multiteam.prehistorian.main.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class ModBlockStateProvider  extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Prehistorian.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ANCIENT_STONE.get());
        simpleBlock(ModBlocks.FOSSIL_ANCIENT_STONE.get());
    }
}
