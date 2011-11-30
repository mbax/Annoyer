package org.kitteh.annoyer;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Annoyer extends JavaPlugin {

    private final ListenBlock blockListener = new ListenBlock(this);
    private final ListenPlayer playerListener = new ListenPlayer(this);
    public final ArrayList<String> standardAnnoyance = new ArrayList<String>();
    public final ArrayList<String> bonusAnnoyance = new ArrayList<String>();

    public boolean enabled(Player player) {
        return this.standardAnnoyance.contains(player.getName());
    }

    public boolean enabled1(Player player) {
        return this.bonusAnnoyance.contains(player.getName());
    }

    public boolean canUseAnnoyOthers(Player p) {
        return p.hasPermission("annoy.others");
    }

    @Override
    public void onEnable() {
        final PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvent(Event.Type.BLOCK_BREAK, this.blockListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.BLOCK_PLACE, this.blockListener, Event.Priority.Normal, this);
        pm.registerEvent(Event.Type.PLAYER_MOVE, this.playerListener, Event.Priority.Normal, this);
        this.getServer().getLogger().info("[Annoyer] Annoyer has been enabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("annoy")) {
            final String p = args[0];
            if (args.length == 0) {
                final Player ss = (Player) sender;
                ss.sendMessage(ChatColor.RED + "Usage:");
                ss.sendMessage(ChatColor.RED + "/annoy playername");
                return true;
            }
            if (this.canUseAnnoyOthers((Player) sender)) {
                final Player annoyee = this.getServer().getPlayer(p);
                if (annoyee == null) {
                    sender.sendMessage(ChatColor.RED + "That user doesn't exist, or isn't online.");
                } else {
                    this.addTD(annoyee);
                    final Player anon = (Player) sender;
                    anon.sendMessage(ChatColor.RED + "You are now annoying " + p);
                }
            } else {
                final Player s = (Player) sender;
                s.sendMessage(ChatColor.RED + "You don't have permisson to use that command");
            }
        }
        if (commandLabel.equalsIgnoreCase("extrannoy")) {
            final String p = args[0];
            if (args.length == 0) {
                final Player ss = (Player) sender;
                ss.sendMessage(ChatColor.RED + "Usage:");
                ss.sendMessage(ChatColor.RED + "/extrannoy playername");
            }
            if (this.canUseAnnoyOthers((Player) sender)) {
                final Player annoyee = this.getServer().getPlayer(p);
                if (annoyee == null) {
                    sender.sendMessage(ChatColor.RED + "That user doesn't exist, or isn't online.");
                } else {
                    this.addE(annoyee);
                    final Player anon = (Player) sender;
                    anon.sendMessage(ChatColor.RED + "You are now extrannoying " + p);
                }
            } else {
                final Player s = (Player) sender;
                s.sendMessage(ChatColor.RED + "You don't have permisson to extrannoy!");
            }
        }
        if (commandLabel.equalsIgnoreCase("unannoy")) {
            final String p = args[0];
            if (args.length == 0) {
                final Player ss = (Player) sender;
                ss.sendMessage(ChatColor.RED + "Usage:");
                ss.sendMessage(ChatColor.RED + "/unannoy playername");
            }
            if (this.canUseAnnoyOthers((Player) sender)) {
                final Player annoyee = this.getServer().getPlayer(p);
                if (annoyee == null) {
                    sender.sendMessage(ChatColor.RED + "That user doesn't exist, or isn't online.");
                } else {
                    this.removeTD(annoyee);
                    final Player anon = (Player) sender;
                    anon.sendMessage(ChatColor.GREEN + "You have stopped annoying " + p);
                }
            } else {
                final Player s = (Player) sender;
                s.sendMessage(ChatColor.RED + "You don't have permisson to unannoy!");
            }

            return true;
        }
        if (commandLabel.equalsIgnoreCase("unextrannoy")) {
            final String p = args[0];
            if (args.length == 0) {
                final Player ss = (Player) sender;
                ss.sendMessage(ChatColor.RED + "Usage:");
                ss.sendMessage(ChatColor.RED + "/unextrannoy playername");
            }
            if (this.canUseAnnoyOthers((Player) sender)) {
                final Player annoyee = this.getServer().getPlayer(p);
                if (annoyee == null) {
                    sender.sendMessage(ChatColor.RED + "That user doesn't exist, or isn't online.");
                } else {
                    this.removeE(annoyee);
                    final Player anon = (Player) sender;
                    anon.sendMessage(ChatColor.GREEN + "You have stopped extrannoying " + p);
                }
            } else {
                final Player s = (Player) sender;
                s.sendMessage(ChatColor.RED + "You don't have permisson to unextrannoy!");
            }

            return true;
        }

        return false;
    }

    @Override
    public void onDisable() {
        this.getServer().getLogger().info("[Annoyer] Annoyer has been disabled!");
    }

    public void removeTD(Player player) {
        this.standardAnnoyance.remove(player);
        player.sendMessage(ChatColor.GREEN + "You are no longer being annoyed!");
    }

    public void addTD(Player player) {
        this.standardAnnoyance.add(player.getName());
        player.sendMessage(ChatColor.RED + "You are now being annoyed!");
    }

    public void removeE(Player player) {
        this.bonusAnnoyance.remove(player);
        player.sendMessage(ChatColor.GREEN + "You are no longer being extrannoyed!");
    }

    public void addE(Player player) {
        this.bonusAnnoyance.add(player.getName());
        player.sendMessage(ChatColor.RED + "You are now being extrannoyed!");
    }
}