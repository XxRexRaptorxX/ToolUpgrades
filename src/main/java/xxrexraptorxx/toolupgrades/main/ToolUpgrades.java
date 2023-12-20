package xxrexraptorxx.toolupgrades.main;

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


    public ToolUpgrades() {
        Config.init();
        ModItems.init();
        CreativeModeTabs.init();
    }

}
