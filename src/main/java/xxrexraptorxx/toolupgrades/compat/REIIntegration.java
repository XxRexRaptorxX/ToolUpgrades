package xxrexraptorxx.toolupgrades.compat;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import me.shedaniel.rei.forge.REIPluginClient;
import me.shedaniel.rei.plugin.client.BuiltinClientPlugin;
import net.minecraft.network.chat.Component;
import xxrexraptorxx.magmacore.utils.FormattingHelper;
import xxrexraptorxx.toolupgrades.main.References;
import xxrexraptorxx.toolupgrades.registry.ModItems;
import xxrexraptorxx.toolupgrades.utils.Config;

@REIPluginClient
public class REIIntegration implements REIClientPlugin {

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        if(Config.getPassiveEnchanting()) {
            BuiltinClientPlugin instance = BuiltinClientPlugin.getInstance();
            Component description = FormattingHelper.setModLangComponent("message", References.MODID, "enchant_bindings_jei_desc");

            instance.registerInformation(EntryStacks.of(ModItems.BINDING_ENCHANTED), Component.empty(), list -> {
                list.add(description);
                return list;
            });

            instance.registerInformation(EntryStacks.of(ModItems.BINDING_ENCHANTED_ADVANCED), Component.empty(), list -> {
                list.add(description);
                return list;
            });
        }
    }

}

