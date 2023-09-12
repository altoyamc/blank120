package cc.altoya.companions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class onDeathEvent implements Listener{

  
  @EventHandler // Detects player inventory interaction
  public void inventoryInteract(InventoryClickEvent event){
    e.getDrops().removeAll(e.getDrops());
  }
}

