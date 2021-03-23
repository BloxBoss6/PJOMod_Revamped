package bloxboss6.mod.objects.blocks;

import bloxboss6.mod.Main;
import bloxboss6.mod.init.BlockInit;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DragonToothCrop extends BlockCrops implements IHasModel {
    public static final PropertyInteger CROP_AGE = PropertyInteger.create("age", 0, 4);
    private static final AxisAlignedBB[] DRAGON_TOOTH_AABB = {
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.5D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 2.0D, 1.0D)};

    public DragonToothCrop(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);

        BlockInit.BLOCKS.add(this);
    }

    @Override
    protected Item getSeed() {
        return ItemInit.DRAGON_TOOTH;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return DRAGON_TOOTH_AABB[state.getValue(this.getAgeProperty())];
    }

    @Override
    protected PropertyInteger getAgeProperty() {
        return CROP_AGE;
    }

    @Override
    public int getMaxAge() {
        return 4;
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return MathHelper.getInt(worldIn.rand, 1, 3);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {CROP_AGE});
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
