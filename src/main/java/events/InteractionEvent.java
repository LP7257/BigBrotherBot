package events;

import TacticusDataHandling.*;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.InteractionHook;
import java.util.List;
import java.util.Objects;

/**
 * InteractionEvent class handles the discord bots slash command interactions.
 */
public class InteractionEvent extends ListenerAdapter {

    /**
     * Method handles the slash command interactions.
     * @param event SlashCommandInteractionEvent object that includes the information about the slash command that was performed by the user.
     */
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {

        // Gets an option on all the commands. That option is a time that serves as a starting point of which entries will be listed by the bot.
        long time = Objects.requireNonNull(event.getOption("time")).getAsLong();
        // Type is formatting of the messages
        int type = Objects.requireNonNull(event.getOption("type")).getAsInt();

        // Fetches entries from API
        List<Entry> all = API.fetchEntries();
        // Sorts new entries. Meaning all the entries that have a starting time after our required option. Also requires the damage type to be battle since bombs bear no relevance
        List<Entry> newEntries = all.stream()
                .filter(e -> e.getStartedOn() > time)
                .filter(e -> e.getDamageType() == DamageType.Battle)
                .toList();

        /*
         * slash entries lists out all new entries after the given time
         */
        if (event.getName().equals("entries")) {

            // Let's Discord know that the reply will come after it's ready
            event.deferReply().queue();

            // If there are no new entries sends out "No new entries" and proceeds to not do the code further
            if (newEntries.isEmpty()) {
                event.getHook().sendMessage("No new entries").queue();
                return;
            }

            if (type == 1) {
                // formatEntries handles the formating for every entry, output is that message.
                String output = formatEntries(newEntries, "New entries:\n\n");
                // sendLongMessage makes sure that Discords 2000-character limit per message won't be exceeded
                sendLongMessage(event.getHook(), output);
            }
            else {
                // formatEntries handles the formating for every entry, output is that message.
                String output = formatEntriesAsEmojis(newEntries, "New entries:\n\n");
                // sendLongMessage makes sure that Discords 2000-character limit per message won't be exceeded
                sendLongMessage(event.getHook(), output);
            }
        }

        /*
         * slash anomalies lists out all new non-META entries after the given time
         */
        if (event.getName().equals("anomalies")) {

            // Let's Discord know that the reply will come after it's ready
            event.deferReply().queue();

            // nonMetaEntries will contain all new entries that don't belong in the specified META teams in MetaOrNot class
            List<Entry> nonMetaEntries = newEntries.stream()
                    .filter(e -> !MetaOrNot.isMeta(e))
                    .toList();

            // If there are no new non-META entries sends out "No new non-META entries" and proceeds to not do the code further
            if (nonMetaEntries.isEmpty()) {
                event.getHook().sendMessage("No new non-META entries").queue();
                return;
            }

            if (type == 1) {
                // formatEntries handles the formating for every entry, output is that message.
                String output = formatEntries(nonMetaEntries, "New anomalies:\n\n");
                // sendLongMessage makes sure that Discords 2000-character limit per message won't be exceeded
                sendLongMessage(event.getHook(), output);
            }
            else {
                // formatEntries handles the formating for every entry, output is that message.
                String output = formatEntriesAsEmojis(nonMetaEntries, "New anomalies:\n\n");
                // sendLongMessage makes sure that Discords 2000-character limit per message won't be exceeded
                sendLongMessage(event.getHook(), output);
            }

        }

        /*
         * slash meta lists out all new META entries after the given time
         */
        if (event.getName().equals("meta")) {

            // Let's Discord know that the reply will come after it's ready
            event.deferReply().queue();

            // MetaEntries will contain all new entries that belong in the specified META teams in MetaOrNot class
            List<Entry> MetaEntries = newEntries.stream()
                    .filter(MetaOrNot::isMeta)
                    .toList();

            // If there are no new META entries sends out "No new META entries" and proceeds to not do the code further
            if (MetaEntries.isEmpty()) {
                event.getHook().sendMessage("No new META entries").queue();
                return;
            }

            if (type == 1) {
                // formatEntries handles the formating for every entry, output is that message.
                String output = formatEntries(MetaEntries, "New META entries:\n\n");
                // sendLongMessage makes sure that Discords 2000-character limit per message won't be exceeded
                sendLongMessage(event.getHook(), output);
            }
            else {
                // formatEntries handles the formating for every entry, output is that message.
                String output = formatEntriesAsEmojis(MetaEntries, "New META entries:\n\n");
                // sendLongMessage makes sure that Discords 2000-character limit per message won't be exceeded
                sendLongMessage(event.getHook(), output);
            }
        }
    }

    /**
     * formatEntries will return entries in a String format for the Discord message
     * @param entries Entries from the API data
     * @param title Title for the Discord message
     * @return Returns a formated message
     */
    private String formatEntries(List<Entry> entries, String title) {

        // New string builder for building the message
        StringBuilder sb = new StringBuilder(title);

        // Initializing long
        Long start = 1L;

        // Loop will go through entries and "chain" them together.
        for (Entry e : entries) {

            // Player name that has been defined in the secret.properties file and configured in the Config class, if there is no match default will be "Unknown"
            String playerName = Config.userIdToName.getOrDefault(e.getUserId(), "Unknown");
            sb.append("Player name: ").append(playerName).append("\n\n");
            // Boss type and damage dealt will come from the entry data

            String normalizedUnitId = e.getBossId().replaceAll("\\d+", "");
            String bossName = BossDetail.bossIdToName.getOrDefault(normalizedUnitId, "Unknown");

            sb.append("Boss: ").append(bossName);
            sb.append("Tier: ").append(e.getRarity()).append(" | Damage: ").append(e.getDamageDealt()).append("\n\n");

            /*
             * Loop will go through the hero details and add them to string builder.
             * In the HeroDetail class every JSON data name has an equivalent more fitting name. If there is no match default will be "Unknown"
             */
            for (HeroDetail hero : e.getHeroDetails()) {
                String heroName = HeroDetail.heroIdToName.getOrDefault(hero.getUnitId(), "Unknown");
                sb.append(heroName).append("\n");
            }

            // lists out MoW name
            MoWDetail mow = e.getMachineOfWarDetails();
            if (mow != null) {
                String mowName = MoWDetail.mowIdToName.getOrDefault(mow.getUnitId(), "Unknown");
                sb.append(mowName).append("\n");
            }

            // Every battle has a starting time. That is crucial for sorting out the entries that have been already shown.
            start = e.getStartedOn();
            sb.append("\n-------------------------------------------\n\n");
        }

        // Every battle has a starting time. That is crucial for sorting out the entries that have been already shown.
        sb.append("\n(Started on: ").append(start).append(")\n");

        // return string builder in String format for presenting
        return sb.toString();
    }

    private String formatEntriesAsEmojis(List<Entry> entries, String title) {

        // New string builder for building the message
        StringBuilder sb = new StringBuilder(title);

        // Initializing long
        Long start = 1L;

        // Loop will go through entries and "chain" them together.
        for (Entry e : entries) {

            // Player name that has been defined in the secret.properties file and configured in the Config class, if there is no match default will be "Unknown"
            String playerName = Config.userIdToName.getOrDefault(e.getUserId(), "Unknown");
            sb.append("# ");
            sb.append("Player name: ").append(playerName).append(" #").append("\n\n");

            // Default writes common/uncommon, on most cases the Boss is higher, which have designated emojis.
            String rarityEmoji = BossDetail.rarityToEmoji.getOrDefault(e.getRarity(), "Rarity: common/uncommon");

            // Normalizes numbers away
            String normalizedUnitId = e.getBossId().replaceAll("\\d+", "");
            String bossEmoji = BossDetail.bossIdToEmoji.getOrDefault(normalizedUnitId, "Unknown");

            // This makes bigger text on Discord -> # example #
            sb.append("# ");
            // Boss type and damage dealt will come from the entry data
            sb.append(rarityEmoji).append(" ").append(bossEmoji);
            sb.append(" | Damage: ").append(e.getDamageDealt()).append(" #").append("\n\n");

            sb.append("# ");

            /*
             * Loop will go through the hero details and add them to string builder.
             * In the HeroDetail class every JSON data name has an equivalent emoji. If there is no match default will be "Unknown"
             */
            for (HeroDetail hero : e.getHeroDetails()) {
                String heroName = HeroDetail.heroIdToEmoji.getOrDefault(hero.getUnitId(), "Unknown");
                sb.append(heroName).append(" ");
            }

            // lists out mow emoji
            MoWDetail mow = e.getMachineOfWarDetails();
            if (mow != null) {
                String mowName = MoWDetail.mowIdToEmoji.getOrDefault(mow.getUnitId(), "Unknown");
                sb.append("+ ").append(mowName);
            }

            sb.append(" #");

            // Every battle has a starting time. That is crucial for sorting out the entries that have been already shown.
            start = e.getStartedOn();
            sb.append("\n\n-------------------------------------------\n");
        }

        sb.append("\nTime option for the next call command: ").append(start).append("\n");

        // return string builder in String format for presenting
        return sb.toString();
    }

    /**
     * Sends out the messages in blocks, Discord has a limit of 2000 characters per message.
     * @param hook is received from deferReply
     * @param text text is from formatEntries that contains the entry details
     */
    private void sendLongMessage(InteractionHook hook, String text) {

        // Discord message character limit is 2000, but we will set out message max to 1960 just in case
        int max = 1960;

        // If empty text is received lets the user know
        if (text == null || text.isBlank()) {
            hook.sendMessage("No data available").queue();
            return;
        }

        // Loop will chop messages in 1960 character blocks and queue them together as long as there is text to send
        int start = 0;

        while (start < text.length()) {
            int end = Math.min(start + max, text.length());
            String chunk = text.substring(start, end);

            // If chunk is long enough, try to cut at ----
            if (chunk.length() > 1500) {
                int separatorIndex = chunk.lastIndexOf("-------------------------------------------");
                if (separatorIndex != -1) {
                    hook.sendMessage(chunk.substring(0, separatorIndex)).queue();
                    // skips past the ---- for the next message
                    start += separatorIndex + 43;
                    continue;
                }
            }

            hook.sendMessage(chunk).queue();
            start = end;
        }

    }
}
