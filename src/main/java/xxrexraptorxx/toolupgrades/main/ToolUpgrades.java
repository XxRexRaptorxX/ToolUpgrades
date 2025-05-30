package xxrexraptorxx.toolupgrades.main;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.toolupgrades.registry.CreativeModeTabs;
import xxrexraptorxx.toolupgrades.registry.ModItems;
import xxrexraptorxx.toolupgrades.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/tool-upgrades">...</a>
 **/
@Mod(References.MODID)
public class ToolUpgrades {

    public static final Logger LOGGER = LogManager.getLogger();


    public ToolUpgrades(IEventBus bus, ModContainer container) {
        ModItems.init(bus);
        CreativeModeTabs.init(bus);

        ConfigHelper.registerConfigs(container, References.MODID, false, null, Config.CLIENT_CONFIG);
        ModRegistry.register(References.MODID, References.NAME, References.URL);
    }

}
