package xxrexraptorxx.toolupgrades.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.toolupgrades.items.ItemBasic;
import xxrexraptorxx.toolupgrades.items.ItemModifier;
import xxrexraptorxx.toolupgrades.main.References;

public class ModItems {

    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);


    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final DeferredItem<ItemBasic> PASTE_BLAZE = ITEMS.register("paste_blaze_powder", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_blaze_powder"))));
    public static final DeferredItem<ItemBasic> PASTE_GLOWSTONE = ITEMS.register("paste_glowstone", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_glowstone"))));
    public static final DeferredItem<ItemBasic> PASTE_REDSTONE = ITEMS.register("paste_redstone", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_redstone"))));
    public static final DeferredItem<ItemBasic> PASTE_SUGAR = ITEMS.register("paste_sugar", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_sugar"))));
    public static final DeferredItem<ItemBasic> PASTE_BONE = ITEMS.register("paste_bone", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_bone"))));
    public static final DeferredItem<ItemBasic> PASTE_CLAY = ITEMS.register("paste_clay", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_clay"))));
    public static final DeferredItem<ItemBasic> PASTE_SLIME = ITEMS.register("paste_slime", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_slime"))));
    public static final DeferredItem<ItemBasic> PASTE_INK = ITEMS.register("paste_ink", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_ink"))));
    public static final DeferredItem<ItemBasic> PASTE_LAPIS = ITEMS.register("paste_lapis", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_lapis"))));
    public static final DeferredItem<ItemBasic> PASTE_GUNPOWDER = ITEMS.register("paste_gun_powder", () -> new ItemBasic(new Item.Properties().setId(itemId("paste_gun_powder"))));

    public static final DeferredItem<ItemBasic> BINDING_REDSTONE = ITEMS.register("redstone_binding", () -> new ItemBasic(new Item.Properties().setId(itemId("redstone_binding"))));
    public static final DeferredItem<ItemBasic> BINDING_ENCHANTED = ITEMS.register("enchanted_binding", () -> new ItemBasic(new Item.Properties().setId(itemId("enchanted_binding"))));
    public static final DeferredItem<ItemBasic> BINDING_ADVANCED = ITEMS.register("advanced_binding", () -> new ItemBasic(new Item.Properties().setId(itemId("advanced_binding"))));
    public static final DeferredItem<ItemBasic> BINDING_ENCHANTED_ADVANCED = ITEMS.register("enchanted_advanced_binding", () -> new ItemBasic(new Item.Properties().setId(itemId("enchanted_advanced_binding"))));

    public static final DeferredItem<ItemModifier> MODIFIER_BLANK = ITEMS.register("modifier_blank", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_blank"))));
    public static final DeferredItem<ItemModifier> MODIFIER_BLAZE = ITEMS.register("modifier_blaze_powder", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_blaze_powder"))));
    public static final DeferredItem<ItemModifier> MODIFIER_GLOWSTONE = ITEMS.register("modifier_glowstone", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_glowstone"))));
    public static final DeferredItem<ItemModifier> MODIFIER_REDSTONE = ITEMS.register("modifier_redstone", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_redstone"))));
    public static final DeferredItem<ItemModifier> MODIFIER_SUGAR = ITEMS.register("modifier_sugar", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_sugar"))));
    public static final DeferredItem<ItemModifier> MODIFIER_BONE = ITEMS.register("modifier_bone", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_bone"))));
    public static final DeferredItem<ItemModifier> MODIFIER_CLAY = ITEMS.register("modifier_clay", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_clay"))));
    public static final DeferredItem<ItemModifier> MODIFIER_SLIME = ITEMS.register("modifier_slime", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_slime"))));
    public static final DeferredItem<ItemModifier> MODIFIER_INK = ITEMS.register("modifier_ink", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_ink"))));
    public static final DeferredItem<ItemModifier> MODIFIER_LAPIS = ITEMS.register("modifier_lapis", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_lapis"))));
    public static final DeferredItem<ItemModifier> MODIFIER_GUNPOWDER = ITEMS.register("modifier_gun_powder", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_gun_powder"))));
    public static final DeferredItem<ItemModifier> MODIFIER_CURSED = ITEMS.register("modifier_cursed", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_cursed"))));

    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_BLANK = ITEMS.register("modifier_advanced_blank", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_blank"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_BLAZE = ITEMS.register("modifier_advanced_blaze_powder", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_blaze_powder"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_GLOWSTONE = ITEMS.register("modifier_advanced_glowstone", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_glowstone"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_REDSTONE = ITEMS.register("modifier_advanced_redstone", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_redstone"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_SUGAR = ITEMS.register("modifier_advanced_sugar", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_sugar"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_BONE = ITEMS.register("modifier_advanced_bone", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_bone"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_CLAY = ITEMS.register("modifier_advanced_clay", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_clay"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_SLIME = ITEMS.register("modifier_advanced_slime", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_slime"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_INK = ITEMS.register("modifier_advanced_ink", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_ink"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_LAPIS = ITEMS.register("modifier_advanced_lapis", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_lapis"))));
    public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_GUNPOWDER = ITEMS.register("modifier_advanced_gun_powder", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_gun_powder"))));
    //public static final DeferredItem<ItemModifier> MODIFIER_ADVANCED_CURSED = ITEMS.register("modifier_advanced_cursed", () -> new ItemModifier(new Item.Properties().setId(itemId("modifier_advanced_cursed"))));


    public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }

}
