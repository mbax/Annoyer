package org.kitteh.annoyer;

import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ListenPlayer extends PlayerListener {
    private Annoyer annoyer;

    public ListenPlayer(Annoyer annoyer) {
        this.annoyer = annoyer;
    }

    @Override
    public void onPlayerMove(PlayerMoveEvent event) {
        if (this.annoyer.annoyed(event.getPlayer()) && (this.annoyer.random.nextDouble() > 0.99)) {
            event.getPlayer().sendMessage(ChatColor.getByCode(this.annoyer.random.nextInt(16)) + "You moved!");
        }
    }

    @Override
    public void onPlayerChat(PlayerChatEvent event) {
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
                event.getPlayer().sendMessage(ChatColor.getByCode(this.annoyer.random.nextInt(16)) + "You said something in chat!");
            }
        }
    }
}