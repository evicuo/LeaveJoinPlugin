package org.evicuo.joinLeaveMessage.config;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigHandler{
    private String path;
    private final Map<String, File> fileMap = new HashMap<>();
    private final Map<String, FileConfiguration> configMap = new HashMap<>();

    public ConfigHandler(){
    }

    public void loadConfig(String path){
        File file = new File(Bukkit.getServer().getPluginManager().getPlugin("JoinLeaveMessage").getDataFolder(), path);
        if(!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e){
                System.out.println("UNABLE TO CREATE CONFIG FILE " + path   );
            }
        }
        FileConfiguration config = YamlConfiguration.loadConfiguration(file);
        fileMap.put(path, file);
        configMap.put(path, config);

    }

    public FileConfiguration getConfig(String path){
        return configMap.get(path);
    }

    public void saveConfig(String path){
        FileConfiguration config = configMap.get(path);
        File file = fileMap.get(path);
        try{
            config.save(file);
        } catch (IOException e){
            System.out.println("UNABLE TO RSAVE CONFIG FILE " + path   );
        }
    }

    public void reloadAllConfigs(){
        for(String path : fileMap.keySet()){
            reloadConfig(path);
        }
    }


    public void reloadConfig(String path){
        File file = fileMap.get(path);
        FileConfiguration config = YamlConfiguration.loadConfiguration(file);
        configMap.put(path, YamlConfiguration.loadConfiguration(file));
    }




}
