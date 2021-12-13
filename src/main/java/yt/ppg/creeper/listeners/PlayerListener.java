package yt.ppg.creeper.listeners;

import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onExplosion(EntityExplodeEvent e) {
        if (e.getEntity() instanceof Creeper) {
        	e.blockList().clear();
        }
    }

}
