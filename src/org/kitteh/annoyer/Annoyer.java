package org.kitteh.annoyer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import net.minecraft.server.Packet60Explosion;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Annoyer extends JavaPlugin {

    private class Durp implements Runnable {
        @Override
        public void run() {
            for (final Player player : Annoyer.this.annoyanceList) {
                if (player != null) {
                    final Location loc = player.getLocation();
                    final int x = ((int) loc.getX()) + (Annoyer.this.random.nextInt(21) - 10);
                    final int y = ((int) loc.getY()) + (Annoyer.this.random.nextInt(11) - 5);
                    final int z = ((int) loc.getZ()) + (Annoyer.this.random.nextInt(21) - 10);
                    if (Annoyer.this.random.nextDouble() < 0.03) {
                        final Packet60Explosion boom = new Packet60Explosion(x, y, z, 10, new HashSet<Block>());
                        ((CraftPlayer) player).getHandle().netServerHandler.sendPacket(boom);
                    }
                    final Location target = new Location(player.getWorld(), x, y, z);
                    final Block block = player.getWorld().getBlockAt(target);
                    if ((block != null) && !block.getType().equals(Material.AIR)) {
                        player.sendBlockChange(target, Annoyer.this.newMat(), (byte) 0);
                    }
                    if (Annoyer.this.random.nextDouble() < 0.01) {
                        for (int boop = 0; boop < 20; boop++) {
                            player.sendMessage(" ");
                        }
                    }
                    if (Annoyer.this.random.nextDouble() < 0.01) {
                        for (int boop = 0; boop < 20; boop++) {
                            player.sendMessage("HEY, LISTEN");
                        }
                    }
                }
            }
        }
    }

    public final ArrayList<Player> annoyanceList = new ArrayList<Player>();

    public Random random = new Random();

    private int oneBlockIDTooHigh;

    public boolean annoyed(Player player) {
        return this.annoyanceList.contains(player);
    }

    public void log(String message) {
        this.getServer().getLogger().info("[Annoyer] " + message);
    }

    public void message(Player player, String message) {
        player.sendMessage(ChatColor.values()[this.random.nextInt(16)] + message);
    }

    public Material newMat() {
        Material newMat = null;
        while (newMat == null) {
            newMat = Material.getMaterial(this.random.nextInt(this.oneBlockIDTooHigh));
        }
        return newMat;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!sender.hasPermission("annoyer.use")) {
            sender.sendMessage(ChatColor.RED + "You do not have permission to use this command.");
            return true;
        }
        if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "You need to specify a player.");
            return true;
        }
        final Player target = this.getServer().getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Cannot find " + ChatColor.LIGHT_PURPLE + args[0] + ChatColor.RED + " on the server");
            return true;
        }
        final String command = commandLabel.toLowerCase();
        if (command.equals("annoy")) {
            this.annoyanceList.add(target);
            this.update(ChatColor.RED + "[Annoyer] " + sender.getName() + " added " + ChatColor.LIGHT_PURPLE + target.getName() + ChatColor.RED + ".");
            this.log(sender.getName() + " annoyed " + target.getName());
            return true;
        }
        if (command.equals("unannoy")) {
            if (this.annoyanceList.remove(target)) {
                this.update(ChatColor.RED + "[Annoyer] " + sender.getName() + " removed " + ChatColor.LIGHT_PURPLE + target.getName() + ChatColor.RED + ".");
                this.log(sender.getName() + " annoyed " + target.getName());
            } else {
                sender.sendMessage(ChatColor.RED + "[Annoyer] Player was not being bothered.");
            }
            return true;
        }
        return true;
    }

    @Override
    public void onDisable() {
        this.getServer().getLogger().info("[Annoyer] Disabled!");
    }

    @Override
    public void onEnable() {
        final PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new ListenBlock(this), this);
        pm.registerEvents(new ListenPlayer(this), this);
        for (int x = 0; x < 256; x++) {
            if (Material.getMaterial(x) != null) {
                this.oneBlockIDTooHigh = x;
            }
        }
        this.oneBlockIDTooHigh++;
        this.getServer().getScheduler().scheduleAsyncRepeatingTask(this, new Durp(), 20, 20);
        this.getServer().getLogger().info("[Annoyer] Enabled!");
    }

    public void update(String message) {
        for (final Player player : this.getServer().getOnlinePlayers()) {
            if ((player != null) && player.hasPermission("annoyer.use")) {
                player.sendMessage(message);
            }
        }
    }

}