import TacticusDataHandling.Config;
import events.InteractionEvent;
import events.MessageEvent;
import events.ReadyEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.requests.GatewayIntent;
import javax.security.auth.login.LoginException;

/**
 * Discord bot that handles guild raid data for further inspection.
 * Main purpose is to optimize more efficient leadership in the guild.
 * --> with commands and the help of API data handling classes, lets the guild leaders inspect if a guilds rule about META teams is followed by its members.
 */
public class BigBrotherBot {

    /**
     * main method builds the bot
     * @param args not used
     * @throws LoginException if the Bot fails to go online
     */
    public static void main(String[] args) throws LoginException {

        // Bot token is fetched by the Config class from secret.properties file
        String token = Config.TOKEN;
        // Creates an JDA instance with our bot token -> for building up the bot
        JDABuilder jdaBuilder = JDABuilder.createDefault(token);

        // Builds the bot, enables it to read messages, handle slash commands and listen to events.
        JDA jda = jdaBuilder
                .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new ReadyEvent(), new MessageEvent(), new InteractionEvent())
                .build();

        /*
         * Slash commands that works as the description reads. All require some starting time as a parameter -> that ensures the point of which the listing starts
         */

        jda.upsertCommand("meta","Lists Raid battles that used META teams since the last time command was used")
                .addOption(OptionType.INTEGER, "time", "Last listed time the command was summoned", true)
                .queue();

        jda.upsertCommand("entries", "Shows raid entries since the last time command was used")
                .addOption(OptionType.INTEGER, "time", "Last listed time the command was summoned", true)
                .queue();

        jda.upsertCommand("anomalies","Lists Raid battles that used non-META teams since the last time command was used")
                .addOption(OptionType.INTEGER, "time", "Last listed time the command was summoned", true)
                .queue();
    }

}
