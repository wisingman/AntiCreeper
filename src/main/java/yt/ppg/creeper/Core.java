package yt.ppg.creeper;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import yt.ppg.creeper.listeners.PlayerListener;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
    }

}
