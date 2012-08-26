package org.kitteh.annoyer;

import net.minecraft.server.EntityChicken;
import net.minecraft.server.Packet24MobSpawn;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class ListenBlock implements Listener {
    public Annoyer annoyer;

    public ListenBlock(Annoyer annoyer) {
        this.annoyer = annoyer;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak(BlockBreakEvent event) {
        if (!this.annoyer.annoyed(event.getPlayer())) {
            return;
        }
        if (this.annoyer.random.nextDouble() < 0.05) {
            final Player player = event.getPlayer();
            final Location location = player.getLocation();
            final EntityChicken bawk = new EntityChicken(((CraftWorld) player.getWorld()).getHandle());
            bawk.setLocation(location.getX(), location.getY(), location.getZ(), location.getPitch(), location.getYaw());
            final Packet24MobSpawn cluck = new Packet24MobSpawn(bawk);
            ((CraftPlayer) player).getHandle().netServerHandler.sendPacket(cluck);
        }
        if (this.annoyer.random.nextDouble() < 0.2) {
            this.annoyer.message(event.getPlayer(), "YOU BROKE A BLOCK");
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockPlace(final BlockPlaceEvent event) {
        if (!this.annoyer.annoyed(event.getPlayer())) {
            return;
        }
        if (this.annoyer.random.nextDouble() < 0.05) {
            final Material mat = this.annoyer.newMat();
            this.annoyer.getServer().getScheduler().scheduleSyncDelayedTask(this.annoyer, new Runnable() {
                @Override
                public void run() {
                    event.getPlayer().sendBlockChange(event.getBlock().getLocation(), mat, (byte) 0);
                }
            }, 1);

        }
        if (this.annoyer.random.nextDouble() < 0.2) {
            this.annoyer.message(event.getPlayer(), "YOU PLACED A BLOCK");
        }
    }
}