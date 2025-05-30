package xxrexraptorxx.toolupgrades.integration;

import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiInfoRecipe;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.resources.ResourceLocation;
import xxrexraptorxx.magmacore.utils.FormattingHelper;
import xxrexraptorxx.toolupgrades.main.References;
import xxrexraptorxx.toolupgrades.registry.ModItems;
import xxrexraptorxx.toolupgrades.utils.Config;

import java.util.ArrayList;
import java.util.List;

@EmiEntrypoint
public class EMIIntegration implements EmiPlugin {

    @Override
    public void register(EmiRegistry registry) {

        if(Config.PASSIVE_ENCHANTING.get()) {
            ArrayList<EmiIngredient> bindings = new ArrayList<EmiIngredient>();
            bindings.add(EmiStack.of(ModItems.BINDING_ENCHANTED.get()));
            bindings.add(EmiStack.of(ModItems.BINDING_ENCHANTED_ADVANCED.get()));

            registry.addRecipe(new EmiInfoRecipe(bindings, List.of(FormattingHelper.setModLangComponent("message", References.MODID, "enchant_bindings_jei_desc")), ResourceLocation.fromNamespaceAndPath(References.MODID, "info/enchant_bindings_jei_desc")));
        }
    }
}