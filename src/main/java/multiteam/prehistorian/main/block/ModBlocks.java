package multiteam.prehistorian.main.block;

import multiteam.multicore_lib.setup.utilities.RegistrationTool;
import multiteam.prehistorian.Prehistorian;
import multiteam.prehistorian.main.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {

    public static final RegistryObject<Block> FOSSILISED_STONE = RegistrationTool.registerWithItem("fossilised_stone", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.5f,6).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)), new Item.Properties().tab(Prehistorian.PREHISTORIAN_MAIN), Registration.BLOCKS, Registration.ITEMS);


    public static void register(){}
}
