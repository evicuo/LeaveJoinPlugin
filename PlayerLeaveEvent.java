package org.evicuo.joinLeaveMessage.listeners;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.evicuo.joinLeaveMessage.MMhandler;
import org.evicuo.joinLeaveMessage.config.JoinMessages;
import org.evicuo.joinLeaveMessage.config.LeaveMessages;

import java.util.Random;

public class PlayerLeaveEvent implements Listener {
    MMhandler mm = new MMhandler();
    Random random = new Random();
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e){
        int r = random.nextInt(LeaveMessages.getLeaveMessages().getList("messages").size());
        Bukkit.broadcast(mm.deserialize(LeaveMessages.getLeaveMessages().getList("messages").get(r).toString()));
    }

}
