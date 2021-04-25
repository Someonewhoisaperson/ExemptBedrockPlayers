package net.zejzz.ncpexemptgeyser;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitTask;

import java.util.logging.Level;

import static org.bukkit.Bukkit.getServer;

public class onPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoinE(PlayerJoinEvent e) {
        Bukkit.getLogger().log(Level.INFO, "Player join detected");
        Player player = e.getPlayer();
        if (e.getPlayer().getDisplayName().startsWith("_")) {
            Bukkit.getLogger().log(Level.INFO, "Found bedrock player");
            if (!(e.getPlayer().hasPermission("nocheatplus.shortcut.bypass"))) {
                getServer().dispatchCommand(getServer().getConsoleSender(), "lp user " + e.getPlayer().getDisplayName() + " permission set nocheatplus.shortcut.bypass");
                Bukkit.getLogger().log(Level.INFO, "Applied ncp bypass");
            }
        } else {
            Bukkit.getLogger().log(Level.INFO, "Found Java player");
            if (!(e.getPlayer().hasPermission("themis.bypass"))) {
                Bukkit.getLogger().log(Level.INFO, "Applied themis bypass");
                getServer().dispatchCommand(getServer().getConsoleSender(), "lp user " + e.getPlayer().getDisplayName() + " permission set themis.bypass");
            }
        }
    }


}
