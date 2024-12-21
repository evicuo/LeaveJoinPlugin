package org.evicuo.joinLeaveMessage;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class MMhandler {

    private final MiniMessage mm = MiniMessage.miniMessage();


    public Component deserialize(String s){
        return mm.deserialize(s);
    }

}
