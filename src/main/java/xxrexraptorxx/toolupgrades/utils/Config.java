package xxrexraptorxx.toolupgrades.utils;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

import java.nio.file.Path;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_WORLD = "world";

    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.BooleanValue UPDATE_CHECKER;
    public static ForgeConfigSpec.BooleanValue PASSIVE_ENCHANTING;
    public static ForgeConfigSpec.IntValue BINDING_ENCHANTING_COST;
    public static ForgeConfigSpec.IntValue ADVANCED_BINDING_ENCHANTING_COST;


    public static void init() {
        initServer();
        initClient();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
    }
    

    public static void initClient() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("General settings").push(CATEGORY_GENERAL);
        UPDATE_CHECKER = builder.comment("Activate the Update-Checker").define("update-checker", true);
        builder.pop();

        CLIENT_CONFIG = builder.build();
    }

    
    public static void initServer() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("World").push(CATEGORY_WORLD);
        //LOOT_GENERATOR = builder.comment("Enable or disable the dungeon loot generator").define("loot_generator", true);
        PASSIVE_ENCHANTING = builder.comment("Enable or disable enchanting of bindings on a bookshelf").define("passive_enchanting", true);
        BINDING_ENCHANTING_COST = builder.comment("The amount of experience levels you need to enchant a binding on a bookshelf").defineInRange("binding_enchanting_cost", 3, 1, 30);
        ADVANCED_BINDING_ENCHANTING_COST = builder.comment("The amount of experience levels you need to enchant a advanced binding on a bookshelf").defineInRange("advanced_binding_enchanting_cost", 6, 1, 30);
        builder.pop();
        
        SERVER_CONFIG = builder.build();
    }
    
}
