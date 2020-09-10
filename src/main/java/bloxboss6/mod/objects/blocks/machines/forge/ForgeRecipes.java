package bloxboss6.mod.objects.blocks.machines.forge;

import bloxboss6.mod.init.ItemInit;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import net.minecraft.item.ItemStack;

import java.util.Map;
import java.util.Map.Entry;

public class ForgeRecipes
{
    private static final ForgeRecipes INSTANCE = new ForgeRecipes();
    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
    private static int inputCount;

    public static ForgeRecipes getInstance()
    {
        return INSTANCE;
    }

    private ForgeRecipes()
    {
        // Sword Parts
        addForgeRecipe(new ItemStack(ItemInit.CAST_SWORD), new ItemStack(ItemInit.INGOT_CB), new ItemStack(ItemInit.SWORD_PART_CB), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_SWORD), new ItemStack(ItemInit.INGOT_IG), new ItemStack(ItemInit.SWORD_PART_IG), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_SWORD), new ItemStack(ItemInit.INGOT_MA), new ItemStack(ItemInit.SWORD_PART_MA), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_SWORD), new ItemStack(ItemInit.INGOT_SI), new ItemStack(ItemInit.SWORD_PART_SI), 5.0F);

        // Knife Parts
        addForgeRecipe(new ItemStack(ItemInit.CAST_KNIFE), new ItemStack(ItemInit.INGOT_CB), new ItemStack(ItemInit.KNIFE_PART_CB), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_KNIFE), new ItemStack(ItemInit.INGOT_IG), new ItemStack(ItemInit.KNIFE_PART_IG), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_KNIFE), new ItemStack(ItemInit.INGOT_MA), new ItemStack(ItemInit.KNIFE_PART_MA), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_KNIFE), new ItemStack(ItemInit.INGOT_SI), new ItemStack(ItemInit.KNIFE_PART_SI), 5.0F);

        // Hilt Parts
        addForgeRecipe(new ItemStack(ItemInit.CAST_HILT), new ItemStack(ItemInit.INGOT_CB), new ItemStack(ItemInit.HILT_PART_CB), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_HILT), new ItemStack(ItemInit.INGOT_IG), new ItemStack(ItemInit.HILT_PART_IG), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_HILT), new ItemStack(ItemInit.INGOT_MA), new ItemStack(ItemInit.HILT_PART_MA), 5.0F);
        addForgeRecipe(new ItemStack(ItemInit.CAST_HILT), new ItemStack(ItemInit.INGOT_SI), new ItemStack(ItemInit.HILT_PART_SI), 5.0F);
    }


    public void addForgeRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience)
    {
        if(getForgeResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));

        if (input1.getItem() == ItemInit.CAST_SWORD) {
            inputCount = 3;
        } else if (input1.getItem() == ItemInit.CAST_KNIFE) {
            inputCount = 2;
        } else if (input1.getItem() == ItemInit.CAST_HILT) {
            inputCount = 1;
        }
    }

    public static int getInputCount() {
        return inputCount;
    }

    public ItemStack getForgeResult(ItemStack input1, ItemStack input2)
    {
        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet())
        {
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
            {
                for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                {
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                    {
                        return (ItemStack)ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
    {
        return this.smeltingList;
    }

    public float getForgeExperience(ItemStack stack)
    {
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}