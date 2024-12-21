package org.evicuo.joinLeaveMessage;

import org.bukkit.plugin.java.JavaPlugin;
import org.evicuo.joinLeaveMessage.config.JoinMessages;
import org.evicuo.joinLeaveMessage.config.LeaveMessages;
import org.evicuo.joinLeaveMessage.listeners.PlayerJoinListener;
import org.evicuo.joinLeaveMessage.listeners.PlayerLeaveEvent;

public final class JoinLeaveMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        JoinMessages.loadJoinMessages();
        LeaveMessages.loadLeave();

        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeaveEvent(), this);

        getCommand("reloadjoinleavemessage").setExecutor(new ReloadCommand());

    }

    @Override
    public void onDisable() {
        JoinMessages.saveJoinMessages();
        LeaveMessages.saveLeaveMessages();
    }
}
