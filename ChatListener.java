package tf.matthew;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    public void onChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        if (containsClickEvent(message)) {
            event.setMessage(stripToRaw(message));
        }
    }

    private boolean containsClickEvent(String msg) {
        return msg.contains("<click:") || msg.contains("clickEvent");
    }

    private String stripToRaw(String msg) {
        return msg.replaceAll("§.", "").trim();
    }
}