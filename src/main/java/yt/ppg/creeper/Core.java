package yt.ppg.creeper;

import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import yt.ppg.creeper.listeners.PlayerListener;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        new Metrics(this, 11924);
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
    }

}
