package xxrexraptorxx.toolupgrades.utils;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_WORLD = "world";

    public static ModConfigSpec SERVER_CONFIG;
    public static ModConfigSpec CLIENT_CONFIG;

    public static ModConfigSpec.BooleanValue UPDATE_CHECKER;
    public static ModConfigSpec.BooleanValue PATREON_REWARDS;

    public static ModConfigSpec.BooleanValue PASSIVE_ENCHANTING;
    public static ModConfigSpec.IntValue BINDING_ENCHANTING_COST;
    public static ModConfigSpec.IntValue ADVANCED_BINDING_ENCHANTING_COST;


    public static void init(ModContainer container) {
        initServer();
        initClient();

        container.registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        container.registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
    }

    

    public static void initClient() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("General settings").push(CATEGORY_GENERAL);
        UPDATE_CHECKER = builder.comment("Activate the Update-Checker").define("update-checker", true);
        builder.pop();

        CLIENT_CONFIG = builder.build();
    }

    
    public static void initServer() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("World").push(CATEGORY_WORLD);
        //LOOT_GENERATOR = builder.comment("Enable or disable the dungeon loot generator").define("loot_generator", true);
        PATREON_REWARDS = builder.comment("Enables ingame rewards on first spawn for Patreons").define("patreon_rewards", true);
        PASSIVE_ENCHANTING = builder.comment("Enable or disable enchanting of bindings on a bookshelf").define("passive_enchanting", true);
        BINDING_ENCHANTING_COST = builder.comment("The amount of experience levels you need to enchant a binding on a bookshelf").defineInRange("binding_enchanting_cost", 3, 1, 30);
        ADVANCED_BINDING_ENCHANTING_COST = builder.comment("The amount of experience levels you need to enchant a advanced binding on a bookshelf").defineInRange("advanced_binding_enchanting_cost", 6, 1, 30);
        builder.pop();
        
        SERVER_CONFIG = builder.build();
    }
    
}
