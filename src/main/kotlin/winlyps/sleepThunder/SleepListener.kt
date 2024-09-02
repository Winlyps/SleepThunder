package winlyps.sleepThunder.listeners

import org.bukkit.Location
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerBedEnterEvent
import winlyps.sleepThunder.SleepThunder

class SleepListener(private val plugin: SleepThunder) : Listener {

    @EventHandler
    fun onPlayerBedEnter(event: PlayerBedEnterEvent) {
        if (event.bedEnterResult == PlayerBedEnterEvent.BedEnterResult.OK) {
            val player = event.player
            val location = player.location
            plugin.server.scheduler.runTask(plugin, Runnable {
                strikeThunder(location)
            })
        }
    }

    private fun strikeThunder(location: Location) {
        location.world?.strikeLightning(location)
    }
}