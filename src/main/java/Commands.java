
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        if(event.getMessage().getContentRaw().equals("!hanz")){

            event.getChannel().sendMessage("https://tenor.com/view/hasbulla-hasbullah-gif-21708537").queue();

        }

    }

    }

