package yt.ppg.creeper.listeners;

import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onExplosion(EntityExplodeEvent e) {
        if (e.getEntity() instanceof Creeper) {
            e.setCancelled(true);
            e.getLocation().getWorld().createExplosion(e.getLocation().subtract(0, 3, 0), 4, false, false, e.getEntity());
            e.getEntity().remove();
        }
    }

}
