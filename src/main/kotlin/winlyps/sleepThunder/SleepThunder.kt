package winlyps.sleepThunder

import org.bukkit.plugin.java.JavaPlugin
import winlyps.sleepThunder.listeners.SleepListener

class SleepThunder : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(SleepListener(this), this)
        logger.info("SleepThunder plugin enabled!")
    }

    override fun onDisable() {
        logger.info("SleepThunder plugin disabled!")
    }
}
