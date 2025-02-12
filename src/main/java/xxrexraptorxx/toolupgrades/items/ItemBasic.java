package xxrexraptorxx.toolupgrades.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.FuelValues;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.toolupgrades.registry.ModItems;

public class ItemBasic extends Item {

    public ItemBasic(Item.Properties properties) {
        super(properties);
    }

    @Override
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType, FuelValues fuelValues) {
        if(this == ModItems.PASTE_BLAZE.get()) {
            return 2000;
        } else {
            return 0;
        }
    }


    @Override
    public boolean isFoil(ItemStack stack) {
        if(this == ModItems.BINDING_ENCHANTED.get() || this == ModItems.BINDING_ENCHANTED_ADVANCED.get()) {
            return true;
        } else {
            return false;
        }
    }
}
