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
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/tool-upgrades
 **/
@Mod(References.MODID)
public class ToolUpgrades {

    public static final Logger LOGGER = LogManager.getLogger();


    public ToolUpgrades(IEventBus bus, ModContainer container) {
        Config.init(container);
        ModItems.init(bus);
        CreativeModeTabs.init(bus);
    }

}
