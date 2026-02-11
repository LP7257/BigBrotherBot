package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

/**
 * MessageEvent will get users message from Discord and Display it in console
 */
public class MessageEvent extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        super.onMessageReceived(event);
        System.out.println(event.getMessage().getContentDisplay());

    }
}
