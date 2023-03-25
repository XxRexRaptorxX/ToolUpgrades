package xxrexraptorxx.toolupgrades.main;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.toolupgrades.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/tool-upgrades
 **/
@Mod(References.MODID)
public class ToolUpgrades {

    public static final Logger LOGGER = LogManager.getLogger();
    private static final ResourceLocation CREATIVE_TAB = new ResourceLocation(References.MODID, "tab");


    public ToolUpgrades() {
        Mod.EventBusSubscriber.Bus.MOD.bus().get().register(ToolUpgrades.class);

        Config.init();
        ModItems.init();
    }


    //Creative Tab
    @SubscribeEvent
    public static void registerTabs(final CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(CREATIVE_TAB, (cf) -> cf.icon(() -> new ItemStack(ModItems.MODIFIER_REDSTONE.get()))
                .title(Component.translatable("itemGroup." + References.MODID + "_tab")).displayItems((p_270258_, output) -> {
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
                })
        );
    }

}
