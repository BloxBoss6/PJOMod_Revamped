package bloxboss6.mod.init;

import bloxboss6.mod.objects.blocks.BlockBase;
import bloxboss6.mod.objects.blocks.machines.forge.BlockForge;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block ORE_OVERWORLD_CB = new BlockBase("ore_overworld_cb", Material.ROCK);
    public static final Block ORE_OVERWORLD_SI = new BlockBase("ore_overworld_si", Material.ROCK);
    public static final Block ORE_NETHER_SI = new BlockBase("ore_nether_si", Material.ROCK);
    public static final Block BLOCK_MA = new BlockBase("block_ma", Material.IRON);
    public static final Block FORGE = new BlockForge("forge");

    //public static final Block ORE_END = new BlockOres("ore_end", "end");
    //public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
    //public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");

}
