package org.evicuo.joinLeaveMessage.config;

import org.bukkit.configuration.ConfigurationSection;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

public class JoinMessages {

    private static ConfigHandler configHandler = new ConfigHandler();

    public static void loadJoinMessages(){
        configHandler.loadConfig("joinMessages.yml");
        addDefaults();
    }
    public static void saveJoinMessages(){
        configHandler.saveConfig("joinMessages.yml");
    }

    public static void reloadJoinMessages(){
        configHandler.reloadConfig("joinMessages.yml");
    }

    public static ConfigurationSection getJoinMessages(){
        return configHandler.getConfig("joinMessages.yml");

    }

    public static void addDefaults(){
        List<String> msgs = new ArrayList<>();
        msgs.add("A player has joined!");
        msgs.add("Who is that...!");
        msgs.add("Someone has arrived c:");
        if(!configHandler.getConfig("joinMessages.yml").contains("messages")){
            configHandler.getConfig("joinMessages.yml").set("messages", msgs);
        }


    }

}
