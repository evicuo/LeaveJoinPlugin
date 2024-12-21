package org.evicuo.joinLeaveMessage.config;

import org.bukkit.configuration.ConfigurationSection;

import java.util.ArrayList;
import java.util.List;

public class LeaveMessages {

    private static ConfigHandler configHandler = new ConfigHandler();

    public static void loadLeave(){
        configHandler.loadConfig("leaveMessages.yml");
        addDefaults();
    }
    public static void saveLeaveMessages(){
        configHandler.saveConfig("leaveMessages.yml");
    }

    public static void reloadLeaveMessages(){
        configHandler.reloadConfig("leaveMessages.yml");
    }

    public static ConfigurationSection getLeaveMessages(){
        return configHandler.getConfig("leaveMessages.yml");
    }

    public static void addDefaults(){
        List<String> msgs = new ArrayList<>();
        msgs.add("A player has left!");
        msgs.add("Who left...!");
        msgs.add("Someone has left :c");
        if(!configHandler.getConfig("leaveMessages.yml").contains("messages")){
            configHandler.getConfig("leaveMessages.yml").set("messages", msgs);
        }
    }

}
    

