package com.icedfalcon.gamemodecmds.commands;

import com.icedfalcon.gamemodecmds.GamemodeCmds;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gms implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player p = (Player) sender;

            if(p.hasPermission("gamemodecmds.gmc")) {

                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage(GamemodeCmds.prefix + ChatColor.AQUA + "You are now in survival mode.");

            } else {
                p.sendMessage(GamemodeCmds.prefix + ChatColor.RED + "You don't have permission to execute this command!");
            }

        } else {
            sender.sendMessage(GamemodeCmds.prefix + ChatColor.RED + "Only players can execute this command!");
        }

        return true;
    }
}
