package xxrexraptorxx.toolupgrades.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;
import xxrexraptorxx.toolupgrades.main.ModItems;
import xxrexraptorxx.toolupgrades.utils.ItemGroup;

public class ItemBasic extends Item {

    public ItemBasic() {
        super(new Properties()
                .tab(ItemGroup.MOD_TAB)
        );
    }


    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        if(this == ModItems.PASTE_BLAZE.get()) {
            return 2000;
        } else {
            return 0;
        }
    }


    @Override
    public boolean isFoil(ItemStack p_41453_) {
        if(this == ModItems.BINDING_ENCHANTED.get() || this == ModItems.BINDING_ENCHANTED_ADVANCED.get()) {
            return true;
        } else {
            return false;
        }
    }
}
