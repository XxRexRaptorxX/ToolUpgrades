package xxrexraptorxx.toolupgrades.utils;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.toolupgrades.main.ModItems;
import xxrexraptorxx.toolupgrades.main.References;

public class ItemGroup {

    public static CreativeModeTab MOD_TAB = new CreativeModeTab(References.MODID + "_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MODIFIER_REDSTONE.get());
        }
    };
}
