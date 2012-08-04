package org.kitteh.annoyer;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ListenPlayer implements Listener {
    private final Annoyer annoyer;

    public ListenPlayer(Annoyer annoyer) {
        this.annoyer = annoyer;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        if (this.annoyer.annoyed(event.getPlayer())) {
            if (this.annoyer.random.nextDouble() > 0.9) {
                event.setMessage(event.getMessage().replaceAll("[aeiouy]", ""));
                return;
            }
            if (this.annoyer.random.nextDouble() > 0.9) {
                event.setCancelled(true);
                event.setMessage(" ");//For chat plugins that don't pay full attention
                return;
            }
            if (this.annoyer.random.nextDouble() > 0.9) {
                this.annoyer.message(event.getPlayer(), "You said something in chat!");
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerMove(PlayerMoveEvent event) {
        if (this.annoyer.annoyed(event.getPlayer()) && (this.annoyer.random.nextDouble() > 0.99)) {
            this.annoyer.message(event.getPlayer(), "You moved!");
        }
    }

    public void onPlayerQuit(PlayerQuitEvent event) {
        if (this.annoyer.annoyanceList.remove(event.getPlayer())) {
            this.annoyer.update(ChatColor.RED + "[Annoyer] " + ChatColor.LIGHT_PURPLE + event.getPlayer().getName() + ChatColor.RED + " dodged annoyance");
        }
    }
}