package xxrexraptorxx.toolupgrades.registry;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.toolupgrades.items.ItemBasic;
import xxrexraptorxx.toolupgrades.items.ItemModifier;
import xxrexraptorxx.toolupgrades.main.References;

public class ModItems {

    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final DeferredItem<ItemBasic> PASTE_BLAZE = ITEMS.register("paste_blaze_powder", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_GLOWSTONE = ITEMS.register("paste_glowstone", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_REDSTONE = ITEMS.register("paste_redstone", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_SUGAR = ITEMS.register("paste_sugar", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_BONE = ITEMS.register("paste_bone", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_CLAY = ITEMS.register("paste_clay", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_SLIME = ITEMS.register("paste_slime", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_INK = ITEMS.register("paste_ink", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_LAPIS = ITEMS.register("paste_lapis", ItemBasic::new);
    public static final DeferredItem<ItemBasic> PASTE_GUNPOWDER = ITEMS.register("paste_gun_powder", ItemBasic::new);

    public static final DeferredItem<ItemBasic> BINDING_REDSTONE = ITEMS.register("redstone_binding", ItemBasic::new);
    public static final DeferredItem<ItemBasic> BINDING_ENCHANTED = ITEMS.register("enchanted_binding", ItemBasic::new);
    public static final DeferredItem<ItemBasic> BINDING_ADVANCED = ITEMS.register("advanced_binding", ItemBasic::new);
    public static final DeferredItem<ItemBasic> BINDING_ENCHANTED_ADVANCED = ITEMS.register("enchanted_advanced_binding", ItemBasic::new);

    public static final DeferredItem<ItemModifier> MODIFIER_BLANK = ITEMS.register("modifier_blank", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_BLAZE = ITEMS.register("modifier_blaze_powder", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_GLOWSTONE = ITEMS.register("modifier_glowstone", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_REDSTONE = ITEMS.register("modifier_redstone", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_SUGAR = ITEMS.register("modifier_sugar", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_BONE = ITEMS.register("modifier_bone", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_CLAY = ITEMS.register("modifier_clay", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_SLIME = ITEMS.register("modifier_slime", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_INK = ITEMS.register("modifier_ink", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_LAPIS = ITEMS.register("modifier_lapis", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_GUNPOWDER = ITEMS.register("modifier_gun_powder", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_CURSED = ITEMS.register("modifier_cursed", ItemModifier::new);

    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_BLANK = ITEMS.register("modifier_advanced_blank", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_BLAZE = ITEMS.register("modifier_advanced_blaze_powder", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_GLOWSTONE = ITEMS.register("modifier_advanced_glowstone", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_REDSTONE = ITEMS.register("modifier_advanced_redstone", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_SUGAR = ITEMS.register("modifier_advanced_sugar", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_BONE = ITEMS.register("modifier_advanced_bone", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_CLAY = ITEMS.register("modifier_advanced_clay", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_SLIME = ITEMS.register("modifier_advanced_slime", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_INK = ITEMS.register("modifier_advanced_ink", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_LAPIS = ITEMS.register("modifier_advanced_lapis", ItemModifier::new);
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_GUNPOWDER = ITEMS.register("modifier_advanced_gun_powder", ItemModifier::new);
    //public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_CURSED = ITEMS.register("modifier_advanced_cursed", ItemModifier::new);

}
