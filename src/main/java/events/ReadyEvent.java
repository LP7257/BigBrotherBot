package events;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

/**
 * Sends a "Bot is online!" message if the bot successfully goes online.
 */
public class ReadyEvent implements EventListener {

    @Override
    public void onEvent(@NotNull GenericEvent event) {
        if (event instanceof ReadyEvent){
            System.out.println("Bot is online!");
        }
    }
}
