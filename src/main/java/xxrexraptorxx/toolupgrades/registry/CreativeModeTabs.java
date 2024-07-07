package xxrexraptorxx.toolupgrades.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.toolupgrades.main.References;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, References.MODID) ;

    public static void init(IEventBus bus) { CREATIVE_MODE_TABS.register(bus); }


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register(References.MODID, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + References.MODID + "_tab"))
            .icon(() -> ModItems.MODIFIER_REDSTONE.get().getDefaultInstance())
            .displayItems((params, output) -> {
                output.accept(ModItems.PASTE_BLAZE.get());
                output.accept(ModItems.PASTE_GLOWSTONE.get());
                output.accept(ModItems.PASTE_GUNPOWDER.get());
                output.accept(ModItems.PASTE_REDSTONE.get());
                output.accept(ModItems.PASTE_SUGAR.get());
                output.accept(ModItems.PASTE_BONE.get());
                output.accept(ModItems.PASTE_CLAY.get());
                output.accept(ModItems.PASTE_SLIME.get());
                output.accept(ModItems.PASTE_INK.get());
                output.accept(ModItems.PASTE_LAPIS.get());
                output.accept(ModItems.BINDING_REDSTONE.get());
                output.accept(ModItems.BINDING_ENCHANTED.get());
                output.accept(ModItems.BINDING_ADVANCED.get());
                output.accept(ModItems.BINDING_ENCHANTED_ADVANCED.get());
                output.accept(ModItems.MODIFIER_BLANK.get());
                output.accept(ModItems.MODIFIER_BLAZE.get());
                output.accept(ModItems.MODIFIER_GLOWSTONE.get());
                output.accept(ModItems.MODIFIER_GUNPOWDER.get());
                output.accept(ModItems.MODIFIER_REDSTONE.get());
                output.accept(ModItems.MODIFIER_SUGAR.get());
                output.accept(ModItems.MODIFIER_BONE.get());
                output.accept(ModItems.MODIFIER_CLAY.get());
                output.accept(ModItems.MODIFIER_SLIME.get());
                output.accept(ModItems.MODIFIER_INK.get());
                output.accept(ModItems.MODIFIER_LAPIS.get());
                output.accept(ModItems.MODIFIER_CURSED.get());
                output.accept(ModItems.MODIFIER_ADVANCED_BLANK.get());
                output.accept(ModItems.MODIFIER_ADVANCED_BLAZE.get());
                output.accept(ModItems.MODIFIER_ADVANCED_GLOWSTONE.get());
                output.accept(ModItems.MODIFIER_ADVANCED_GUNPOWDER.get());
                output.accept(ModItems.MODIFIER_ADVANCED_REDSTONE.get());
                output.accept(ModItems.MODIFIER_ADVANCED_SUGAR.get());
                output.accept(ModItems.MODIFIER_ADVANCED_BONE.get());
                output.accept(ModItems.MODIFIER_ADVANCED_CLAY.get());
                output.accept(ModItems.MODIFIER_ADVANCED_SLIME.get());
                output.accept(ModItems.MODIFIER_ADVANCED_INK.get());
                output.accept(ModItems.MODIFIER_ADVANCED_LAPIS.get());
                //output.accept(ModItems.MODIFIER_ADVANCED_CURSED.get());
            }).build());
}
