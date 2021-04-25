package net.zejzz.ncpexemptgeyser;

import org.bukkit.plugin.java.JavaPlugin;

public final class NCPExemptGeyser extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
