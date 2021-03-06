package bloxboss6.mod.world.gen;

import bloxboss6.mod.init.BlockInit;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenCustomOres implements IWorldGenerator {

    private WorldGenerator ore_overworld_cb, ore_overworld_si, ore_nether_si;

    public WorldGenCustomOres() {

        ore_overworld_cb = new WorldGenMinable(BlockInit.ORE_OVERWORLD_CB.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
        ore_overworld_si = new WorldGenMinable(BlockInit.ORE_OVERWORLD_SI.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.STONE));
        ore_nether_si = new WorldGenMinable(BlockInit.ORE_NETHER_SI.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.NETHERRACK));

    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case -1:

                runGenerator(ore_nether_si, world, random, chunkX, chunkZ, 25, 10, 117);

            break;

            case 0:

                runGenerator(ore_overworld_cb, world, random, chunkX, chunkZ, 6, 5, 10);
                runGenerator(ore_overworld_si, world, random, chunkX, chunkZ, 6, 5, 10);
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
        if (minHeight > maxHeight || minHeight < 0 || maxHeight > 256)
            throw new IllegalArgumentException("Ore generated out of bounds.");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chance; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world, rand, new BlockPos(x, y, z));
        }
    }

}
