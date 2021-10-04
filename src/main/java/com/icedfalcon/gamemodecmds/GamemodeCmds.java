package com.icedfalcon.gamemodecmds;

import com.icedfalcon.gamemodecmds.commands.Gma;
import com.icedfalcon.gamemodecmds.commands.Gmc;
import com.icedfalcon.gamemodecmds.commands.Gms;
import com.icedfalcon.gamemodecmds.commands.Gmsp;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class GamemodeCmds extends JavaPlugin {

    public static String prefix = ChatColor.translateAlternateColorCodes('&', "&4&lGame&f&lMode &6&lCommands &7>>");

    @Override
    public void onEnable() {

        getCommand("gmc").setExecutor(new Gmc());
        getCommand("gms").setExecutor(new Gms());
        getCommand("gma").setExecutor(new Gma());
        getCommand("gmsp").setExecutor(new Gmsp());

    }

}
