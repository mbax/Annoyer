package org.kitteh.annoyer;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;

public class ListenBlock extends BlockListener {
    public static Annoyer plugin;

    public ListenBlock(Annoyer instance) {
        plugin = instance;
    }

    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();
        if ((block.getType() == Material.STONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU BROKE SOME STONE!!!");
        }
        if ((block.getType() == Material.GRASS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU DUG UP SOME GRASS!");
        }
        if ((block.getType() == Material.DIRT) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST DUG DIRT UP!");
        }
        if ((block.getType() == Material.COBBLESTONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU BROKE APART SOME COBBLESTONE!");
        }
        if ((block.getType() == Material.WOOD) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE SOME WOOD!");
        }
        if ((block.getType() == Material.SAPLING) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST KILLED A TREE!");
        }
        if ((block.getType() == Material.BEDROCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "THAT IS IMPOSSIBLE WTF?");
        }
        if ((block.getType() == Material.WATER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "HOW DID U DO THAT?");
        }
        if ((block.getType() == Material.STATIONARY_WATER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "HOW DID U DO TAHT?");
        }
        if ((block.getType() == Material.LAVA) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "HOW DO U BREAK LAVA?");
        }
        if ((block.getType() == Material.STATIONARY_LAVA) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "THAT WAS STATIONARY!");
        }
        if ((block.getType() == Material.SAND) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST DUG IN THE SAND");
        }
        if ((block.getType() == Material.GRAVEL) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST TRIED TO GET FLINT!");
        }
        if ((block.getType() == Material.GOLD_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "GOLD ORE! BETTER SMELT IT!");
        }
        if ((block.getType() == Material.IRON_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "IRON ORE! SMELT THAT NOW!");
        }
        if ((block.getType() == Material.COAL_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "MAKE SOME TORCHES WITH THIS STUFF!");
        }
        if ((block.getType() == Material.LOG) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST DESTROYED A LOG!");
        }
        if ((block.getType() == Material.LEAVES) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST TRIED TO GET A SAPLING!");
        }
        if ((block.getType() == Material.SPONGE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST KILLED" + ChatColor.YELLOW + " SPONGEBOB!");
        }
        if ((block.getType() == Material.GLASS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST SHATTERED SOME GLASS!");
        }
        if ((block.getType() == Material.LAPIS_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "THIS STUFF IS USELESS!");
        }
        if ((block.getType() == Material.LAPIS_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "THIS STUFF IS USELESS!");
        }
        if ((block.getType() == Material.DISPENSER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A DISPENSER!");
        }
        if ((block.getType() == Material.SANDSTONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST DESTROYED SOME SANDSTONE!");
        }
        if ((block.getType() == Material.NOTE_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST KILLED MUSIC!");
        }
        if ((block.getType() == Material.BED_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "WHAT'S THE MATTER, YOU DON'T LIKE SLEEPING?!?");
        }
        if ((block.getType() == Material.WOOL) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST REMOVED SOME WOOL!");
        }
        if ((block.getType() == Material.YELLOW_FLOWER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST KILLED A YELLOW FLOWER! WTF?");
        }
        if ((block.getType() == Material.RED_ROSE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST KILLED A RED ROSE! WTF?");
        }
        if ((block.getType() == Material.BROWN_MUSHROOM) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "WTF? ARE YOU GONNA EAT TAHT?");
        }
        if ((block.getType() == Material.RED_MUSHROOM) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "WTF? ARE YOU GONNA EAT TAHT!");
        }
        if ((block.getType() == Material.GOLD_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST DESTROYED SOME BUTTER!");
        }
        if ((block.getType() == Material.IRON_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE SOME METAL!");
        }
        if ((block.getType() == Material.DOUBLE_STEP) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE TWO STEPS!");
        }
        if ((block.getType() == Material.STEP) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A STEP!");
        }
        if ((block.getType() == Material.BRICK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE APART SOME BRICKS!");
        }
        if ((block.getType() == Material.TNT) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU'RE ABOUT TO ASPLODE!");
        }
        if ((block.getType() == Material.BOOKSHELF) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "WHAT, YOU DON'T LIKE READING?!?");
        }
        if ((block.getType() == Material.MOSSY_COBBLESTONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE SOME MOSSY COBBLESTONE!");
        }
        if ((block.getType() == Material.OBSIDIAN) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "THAT MUST HAVE TAKEN A WHILE!");
        }
        if ((block.getType() == Material.TORCH) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST PUT OUT THE LIGHTS!");
        }
        if ((block.getType() == Material.FIRE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU BROKE THE FIRE?");
        }
        if ((block.getType() == Material.MOB_SPAWNER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "NO MORE MOBS WILL SPAWN FROM THAT!");
        }
        if ((block.getType() == Material.WOOD_STAIRS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE SOME WOODEN STAIRS!");
        }
        if ((block.getType() == Material.CHEST) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST DESTROYED A CHEST!");
        }
        if ((block.getType() == Material.REDSTONE_WIRE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST RUINED A CIRCUIT!");
        }
        if ((block.getType() == Material.DIAMOND_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "OMG DIAMONDS!");
        }
        if ((block.getType() == Material.DIAMOND_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU'RE SO RICH NOW!");
        }
        if ((block.getType() == Material.WORKBENCH) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "NO MORE CRAFTING FOR YOU!");
        }
        if ((block.getType() == Material.CROPS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST HARVESTED CROPS!");
        }
        if ((block.getType() == Material.SOIL) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST RUINED PERFECTLY GOOD SOIL!");
        }
        if ((block.getType() == Material.FURNACE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A FURNACE!");
        }
        if ((block.getType() == Material.BURNING_FURNACE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A FURNACE THAT WAS ON!");
        }
        if ((block.getType() == Material.SIGN_POST) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A SIGN!");
        }
        if ((block.getType() == Material.WOODEN_DOOR) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A WOODEN DOOR!");
        }
        if ((block.getType() == Material.LADDER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "HOW WILL YOU GET BACK UP NOW?!?");
        }
        if ((block.getType() == Material.RAILS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "NOW THE MINECART WON'T WORK!");
        }
        if ((block.getType() == Material.COBBLESTONE_STAIRS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE SOME COBBLESTONE STAIRS!");
        }
        if ((block.getType() == Material.WALL_SIGN) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A SIGN!");
        }
        if ((block.getType() == Material.LEVER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A LEVER!");
        }
        if ((block.getType() == Material.STONE_PLATE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A STONE PRESSURE PLATE!");
        }
        if ((block.getType() == Material.IRON_DOOR_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE AN IRON DOOR!");
        }
        if ((block.getType() == Material.WOOD_PLATE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A WOODEN PRESSURE PLATE!");
        }
        if ((block.getType() == Material.REDSTONE_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST GOT SOME REDSTONE!");
        }
        if ((block.getType() == Material.GLOWING_REDSTONE_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST GOT SOME REDSTONE!");
        }
        if ((block.getType() == Material.REDSTONE_TORCH_OFF) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A DEACTIVATED REDSTONE TORCH!");
        }
        if ((block.getType() == Material.REDSTONE_TORCH_ON) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A REDSTONE TORCH!");
        }
        if ((block.getType() == Material.STONE_BUTTON) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A BUTTON!");
        }
        if ((block.getType() == Material.SNOW) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "TIME FOR A SNOWBALL FIGHT!");
        }
        if ((block.getType() == Material.ICE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST SHATTERED SOME ICE!");
        }
        if ((block.getType() == Material.SNOW_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A SNOW BLOCK!");
        }
        if ((block.getType() == Material.CACTUS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST KILLED A CACTUS!");
        }
        if ((block.getType() == Material.CLAY) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST DUG UP SOME CLAY!");
        }
        if ((block.getType() == Material.SUGAR_CANE_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST GOT SOME SUGAR CANE!");
        }
        if ((block.getType() == Material.JUKEBOX) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "NO! WHERE DID THE MUSIC GO?");
        }
        if ((block.getType() == Material.FENCE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST RUINED A FENCE!");
        }
        if ((block.getType() == Material.PUMPKIN) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST GAINED A PUMPKIN HAT!");
        }
        if ((block.getType() == Material.NETHERRACK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE SOME NETHERRACK!");
        }
        if ((block.getType() == Material.SOUL_SAND) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST DUG UP SOME SOUL SAND!");
        }
        if ((block.getType() == Material.GLOWSTONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST SHATTERED SOME GLOWSTONE");
        }
        if ((block.getType() == Material.PORTAL) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST RUINED A PORTAL!");
        }
        if ((block.getType() == Material.JACK_O_LANTERN) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST RUINED HALLOWEEN!");
        }
        if ((block.getType() == Material.CAKE_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "NO! NOW THE CAKE IS A LIE!");
        }
        if ((block.getType() == Material.DIODE_BLOCK_OFF) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A REDSTONE REPEATER!");
        }
        if ((block.getType() == Material.DIODE_BLOCK_ON) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A REDSTONE REPEATER!");
        }
        if ((block.getType() == Material.LOCKED_CHEST) && (plugin.enabled(player)))
            player.sendMessage(ChatColor.GOLD + "YOU JUST BROKE A LOCKED CHEST!");
    }

    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlockPlaced();
        if ((block.getType() == Material.STONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED STONE!");
        }
        if ((block.getType() == Material.GRASS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED GRASS!");
        }
        if ((block.getType() == Material.DIRT) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PUT DOWN SOME DIRT!");
        }
        if ((block.getType() == Material.COBBLESTONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED SOME COBBLESTONE!");
        }
        if ((block.getType() == Material.WOOD) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED WOOD!");
        }
        if ((block.getType() == Material.SAPLING) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLANTED A TREE!");
        }
        if ((block.getType() == Material.BEDROCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED SOME BEDROCK!");
        }
        if ((block.getType() == Material.WATER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED A WATER SOURCE BLOCK!");
        }
        if ((block.getType() == Material.STATIONARY_WATER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED A STATIONARY WATER SOURCE BLOCK!");
        }
        if ((block.getType() == Material.LAVA) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED SOME LAVA!");
        }
        if ((block.getType() == Material.STATIONARY_LAVA) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED SOME STATIONARY LAVA!");
        }
        if ((block.getType() == Material.SAND) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME SAND!");
        }
        if ((block.getType() == Material.GRAVEL) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PUT DOWN SOME GRAVEL!");
        }
        if ((block.getType() == Material.GOLD_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED SOME BUTTER ORE!");
        }
        if ((block.getType() == Material.IRON_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU PLACED SOME IRON ORE!");
        }
        if ((block.getType() == Material.COAL_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "HOW DID YOU GET THAT COAL?!?");
        }
        if ((block.getType() == Material.LOG) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A LOG!");
        }
        if ((block.getType() == Material.LEAVES) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "HOW DID YOU GET THOSE LEAVES?!?");
        }
        if ((block.getType() == Material.SPONGE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED" + ChatColor.YELLOW + " SPONGEBOB!");
        }
        if ((block.getType() == Material.GLASS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME GLASS!");
        }
        if ((block.getType() == Material.LAPIS_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "THIS STUFF IS USELESS!");
        }
        if ((block.getType() == Material.LAPIS_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "THIS STUFF IS USELESS!");
        }
        if ((block.getType() == Material.DISPENSER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A DISPENSER!");
        }
        if ((block.getType() == Material.SANDSTONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME SANDSTONE!");
        }
        if ((block.getType() == Material.NOTE_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST MADE SOME MUSIC!");
        }
        if ((block.getType() == Material.BED_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "SLEEPY TIME!");
        }
        if ((block.getType() == Material.WOOL) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME WOOL!");
        }
        if ((block.getType() == Material.YELLOW_FLOWER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLANTED A YELLOW FLOWER!");
        }
        if ((block.getType() == Material.RED_ROSE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLANTED A RED ROSE!");
        }
        if ((block.getType() == Material.BROWN_MUSHROOM) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "WTF? ARE YOU GONNA EAT TAHT?");
        }
        if ((block.getType() == Material.RED_MUSHROOM) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "WTF? ARE YOU GONNA EAT TAHT!");
        }
        if ((block.getType() == Material.GOLD_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME BUTTER!");
        }
        if ((block.getType() == Material.IRON_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED AN IRON BLOCK!");
        }
        if ((block.getType() == Material.DOUBLE_STEP) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED TWO STEPS!");
        }
        if ((block.getType() == Material.STEP) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A STEP!");
        }
        if ((block.getType() == Material.BRICK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME BRICKS!");
        }
        if ((block.getType() == Material.TNT) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "ARE YOU GONNA ASPLODE SUMTHING WITH THAT!");
        }
        if ((block.getType() == Material.BOOKSHELF) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU LIKE TO READ?!?");
        }
        if ((block.getType() == Material.MOSSY_COBBLESTONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME MOSSY COBBLESTONE!");
        }
        if ((block.getType() == Material.OBSIDIAN) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME OBSIDIAN!");
        }
        if ((block.getType() == Material.TORCH) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST TURNED ON THE LIGHTS!");
        }
        if ((block.getType() == Material.FIRE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "WHY ARE YOU BURNING STUFF?!?");
        }
        if ((block.getType() == Material.MOB_SPAWNER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "WHY DO YOU WANT TO SPAWN MOBS?!?");
        }
        if ((block.getType() == Material.WOOD_STAIRS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME WOODEN STAIRS!");
        }
        if ((block.getType() == Material.CHEST) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A CHEST!");
        }
        if ((block.getType() == Material.REDSTONE_WIRE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME REDSTONE DUST!");
        }
        if ((block.getType() == Material.DIAMOND_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "OMG DIAMONDS!");
        }
        if ((block.getType() == Material.DIAMOND_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU'RE SO RICH!");
        }
        if ((block.getType() == Material.WORKBENCH) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "CRAFTING TIME!");
        }
        if ((block.getType() == Material.CROPS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLANTED CROPS!");
        }
        if ((block.getType() == Material.SOIL) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "HOW DID YOU GET SOIL?!?");
        }
        if ((block.getType() == Material.FURNACE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A FURNACE!");
        }
        if ((block.getType() == Material.BURNING_FURNACE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "HOW DID YOU PLACE AN ACTIVE FURNACE?!?");
        }
        if ((block.getType() == Material.SIGN_POST) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A SIGN ON THE GROUND!");
        }
        if ((block.getType() == Material.WOODEN_DOOR) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A WOODEN DOOR!");
        }
        if ((block.getType() == Material.LADDER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A LADDER!");
        }
        if ((block.getType() == Material.RAILS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "ARE YOU BUILDING A ROLLER COASTER?!?");
        }
        if ((block.getType() == Material.COBBLESTONE_STAIRS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME COBBLESTONE STAIRS!");
        }
        if ((block.getType() == Material.WALL_SIGN) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A SIGN!");
        }
        if ((block.getType() == Material.LEVER) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A LEVER!");
        }
        if ((block.getType() == Material.STONE_PLATE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A STONE PRESSURE PLATE!");
        }
        if ((block.getType() == Material.IRON_DOOR_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED AN IRON DOOR!");
        }
        if ((block.getType() == Material.WOOD_PLATE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A WOODEN PRESSURE PLATE!");
        }
        if ((block.getType() == Material.REDSTONE_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME REDSTONE ORE!");
        }
        if ((block.getType() == Material.GLOWING_REDSTONE_ORE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME GLOWING REDSTONE ORE!");
        }
        if ((block.getType() == Material.REDSTONE_TORCH_OFF) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "HOW DID YOU GET THAT TORCH?!?");
        }
        if ((block.getType() == Material.REDSTONE_TORCH_ON) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A REDSTONE TORCH!");
        }
        if ((block.getType() == Material.STONE_BUTTON) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A BUTTON!");
        }
        if ((block.getType() == Material.SNOW) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "HOW DD YOU GET SNOW?!?");
        }
        if ((block.getType() == Material.ICE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME ICE!");
        }
        if ((block.getType() == Material.SNOW_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A SNOW BLOCK!");
        }
        if ((block.getType() == Material.CACTUS) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLANTED A CACTUS!");
        }
        if ((block.getType() == Material.CLAY) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME CLAY!");
        }
        if ((block.getType() == Material.SUGAR_CANE_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLANTED SOME SUGAR CANE!");
        }
        if ((block.getType() == Material.JUKEBOX) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "MUSIC TIME!");
        }
        if ((block.getType() == Material.FENCE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A FENCE!");
        }
        if ((block.getType() == Material.PUMPKIN) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PUT DONW A PUMPKIN!");
        }
        if ((block.getType() == Material.NETHERRACK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME NETHERRACK!");
        }
        if ((block.getType() == Material.SOUL_SAND) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME SOUL SAND!");
        }
        if ((block.getType() == Material.GLOWSTONE) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED SOME GLOWSTONE");
        }
        if ((block.getType() == Material.PORTAL) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "HOW DID YOU GET A PORTAL?!?");
        }
        if ((block.getType() == Material.JACK_O_LANTERN) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A JACK-O-LANTERN!");
        }
        if ((block.getType() == Material.CAKE_BLOCK) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "THE CAKE ISN'T A LIE!");
        }
        if ((block.getType() == Material.DIODE_BLOCK_OFF) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A REDSTONE REPEATER!");
        }
        if ((block.getType() == Material.DIODE_BLOCK_ON) && (plugin.enabled(player))) {
            player.sendMessage(ChatColor.GREEN + "HOW DID YOU GET AN ACTIVE REDSTONE REPEATER!");
        }
        if ((block.getType() == Material.LOCKED_CHEST) && (plugin.enabled(player)))
            player.sendMessage(ChatColor.GREEN + "YOU JUST PLACED A LOCKED CHEST!");
    }
}