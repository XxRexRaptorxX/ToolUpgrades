package xxrexraptorxx.toolupgrades.utils;

import net.neoforged.neoforge.common.ModConfigSpec;
import xxrexraptorxx.magmacore.config.ConfigHelper;

public class Config {

    private static final ModConfigSpec.Builder SERVER_BUILDER = new ModConfigSpec.Builder();
    public static ModConfigSpec SERVER_CONFIG;

    private static ModConfigSpec.BooleanValue PASSIVE_ENCHANTING;
    private static ModConfigSpec.IntValue BINDING_ENCHANTING_COST;
    private static ModConfigSpec.IntValue ADVANCED_BINDING_ENCHANTING_COST;

    static {
        ConfigHelper.setCategory(SERVER_BUILDER, "enchanting");
        PASSIVE_ENCHANTING = SERVER_BUILDER.comment("Enable or disable enchanting of bindings on a bookshelf").define("passive_enchanting", true);
        BINDING_ENCHANTING_COST = SERVER_BUILDER.comment("The amount of experience levels you need to enchant a binding on a bookshelf").defineInRange("binding_enchanting_cost", 3, 1, 30);
        ADVANCED_BINDING_ENCHANTING_COST = SERVER_BUILDER.comment("The amount of experience levels you need to enchant a advanced binding on a bookshelf").defineInRange("advanced_binding_enchanting_cost", 6, 1, 30);
        SERVER_BUILDER.pop();

        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    public static boolean getPassiveEnchanting() { return PASSIVE_ENCHANTING.get(); }
    public static int getBindingEnchantingCost() { return BINDING_ENCHANTING_COST.get(); }
    public static int getAdvancedBindingEnchantingCost() { return ADVANCED_BINDING_ENCHANTING_COST.get(); }
}