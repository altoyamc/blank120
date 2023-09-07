package cc.altoya.pluginname

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

class EventHandlerExample : Listener {

    @EventHandler // Detects player inventory interaction
    fun inventoryInteract(event: InventoryClickEvent) {
        // Your event handling code here
    }
}
