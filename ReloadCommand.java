package org.evicuo.joinLeaveMessage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.evicuo.joinLeaveMessage.config.ConfigHandler;

public class ReloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(command.getName().equalsIgnoreCase("reloadjoinleavemessage")){
            ConfigHandler configHandler = new ConfigHandler();
            configHandler.reloadAllConfigs();
        }

        return true;
    }

}
