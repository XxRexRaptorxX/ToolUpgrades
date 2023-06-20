package xxrexraptorxx.toolupgrades.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.toolupgrades.items.ItemBasic;
import xxrexraptorxx.toolupgrades.items.ItemModifier;
import xxrexraptorxx.toolupgrades.main.References;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final RegistryObject<ItemBasic> PASTE_BLAZE = ITEMS.register("paste_blaze_powder", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_GLOWSTONE = ITEMS.register("paste_glowstone", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_REDSTONE = ITEMS.register("paste_redstone", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_SUGAR = ITEMS.register("paste_sugar", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_BONE = ITEMS.register("paste_bone", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_CLAY = ITEMS.register("paste_clay", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_SLIME = ITEMS.register("paste_slime", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_INK = ITEMS.register("paste_ink", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_LAPIS = ITEMS.register("paste_lapis", ItemBasic::new);
    public static final RegistryObject<ItemBasic> PASTE_GUNPOWDER = ITEMS.register("paste_gun_powder", ItemBasic::new);

    public static final RegistryObject<ItemBasic> BINDING_REDSTONE = ITEMS.register("redstone_binding", ItemBasic::new);
    public static final RegistryObject<ItemBasic> BINDING_ENCHANTED = ITEMS.register("enchanted_binding", ItemBasic::new);
    public static final RegistryObject<ItemBasic> BINDING_ADVANCED = ITEMS.register("advanced_binding", ItemBasic::new);
    public static final RegistryObject<ItemBasic> BINDING_ENCHANTED_ADVANCED = ITEMS.register("enchanted_advanced_binding", ItemBasic::new);

    public static final RegistryObject<ItemModifier> MODIFIER_BLANK = ITEMS.register("modifier_blank", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_BLAZE = ITEMS.register("modifier_blaze_powder", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_GLOWSTONE = ITEMS.register("modifier_glowstone", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_REDSTONE = ITEMS.register("modifier_redstone", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_SUGAR = ITEMS.register("modifier_sugar", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_BONE = ITEMS.register("modifier_bone", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_CLAY = ITEMS.register("modifier_clay", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_SLIME = ITEMS.register("modifier_slime", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_INK = ITEMS.register("modifier_ink", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_LAPIS = ITEMS.register("modifier_lapis", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_GUNPOWDER = ITEMS.register("modifier_gun_powder", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_CURSED = ITEMS.register("modifier_cursed", ItemModifier::new);

    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_BLANK = ITEMS.register("modifier_advanced_blank", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_BLAZE = ITEMS.register("modifier_advanced_blaze_powder", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_GLOWSTONE = ITEMS.register("modifier_advanced_glowstone", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_REDSTONE = ITEMS.register("modifier_advanced_redstone", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_SUGAR = ITEMS.register("modifier_advanced_sugar", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_BONE = ITEMS.register("modifier_advanced_bone", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_CLAY = ITEMS.register("modifier_advanced_clay", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_SLIME = ITEMS.register("modifier_advanced_slime", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_INK = ITEMS.register("modifier_advanced_ink", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_LAPIS = ITEMS.register("modifier_advanced_lapis", ItemModifier::new);
    public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_GUNPOWDER = ITEMS.register("modifier_advanced_gun_powder", ItemModifier::new);
    //public static final RegistryObject<ItemModifier> MODIFIER_ADVANCED_CURSED = ITEMS.register("modifier_advanced_cursed", ItemModifier::new);

}
