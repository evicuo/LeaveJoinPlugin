package org.evicuo.joinLeaveMessage.listeners;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.evicuo.joinLeaveMessage.MMhandler;
import org.evicuo.joinLeaveMessage.config.JoinMessages;

import java.util.Random;

public class PlayerJoinListener implements Listener {

    Random random = new Random();
    MMhandler mm = new MMhandler();


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        int r = random.nextInt(JoinMessages.getJoinMessages().getList("messages").size());
        Bukkit.broadcast(mm.deserialize(JoinMessages.getJoinMessages().getList("messages").get(r).toString()));
    }


}
