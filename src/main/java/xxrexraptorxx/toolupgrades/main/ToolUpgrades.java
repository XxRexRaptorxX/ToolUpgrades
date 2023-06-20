package xxrexraptorxx.toolupgrades.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.toolupgrades.registry.CreativeModeTabs;
import xxrexraptorxx.toolupgrades.registry.ModItems;
import xxrexraptorxx.toolupgrades.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/tool-upgrades
 **/
@Mod(References.MODID)
public class ToolUpgrades {

    public static final Logger LOGGER = LogManager.getLogger();


    public ToolUpgrades() {
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        Config.init();
        ModItems.init();
        CreativeModeTabs.init();
    }

}
