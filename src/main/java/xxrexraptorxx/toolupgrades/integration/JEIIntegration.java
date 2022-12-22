package xxrexraptorxx.toolupgrades.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IIngredientManager;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.toolupgrades.main.ModItems;
import xxrexraptorxx.toolupgrades.main.References;
import xxrexraptorxx.toolupgrades.utils.Config;

import java.util.ArrayList;

@JeiPlugin
public class JEIIntegration implements IModPlugin {

    private static final ResourceLocation ID = new ResourceLocation(References.MODID, "jei_plugin");


    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }


    @Override
    public void registerRecipes(IRecipeRegistration registry) {
        IIngredientManager ingredientManager = registry.getIngredientManager();

        if(Config.PASSIVE_ENCHANTING.get()) {
            ArrayList<ItemStack> bindings = new ArrayList<ItemStack>();
            bindings.add(new ItemStack(ModItems.BINDING_ENCHANTED.get()));
            bindings.add(new ItemStack(ModItems.BINDING_ENCHANTED_ADVANCED.get()));

            registry.addIngredientInfo(bindings, VanillaTypes.ITEM_STACK, Component.translatable("message.toolupgrades.enchant_bindings_jei_desc"));
        }
    }
}
