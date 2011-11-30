package org.kitteh.annoyer;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ListenPlayer extends PlayerListener {
    public static Annoyer plugin1;

    public ListenPlayer(Annoyer instance) {
        plugin1 = instance;
    }

    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (plugin1.enabled1(player))
            player.sendMessage(ChatColor.AQUA + "OMG U MOVED! WHY? DID YOU NOT LIKE IT WHERE U WERE?");
    }
}