import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class Main implements EventListener {

    public static void main(String[] args)
            throws LoginException
    {

        JDA builder = JDABuilder.createDefault(args[0]).build();
        builder.addEventListener(new Main());
        builder.getPresence().setActivity(Activity.playing("Being a dirtyson"));

        builder.addEventListener(new Commands());

    }


    @Override
    public void onEvent(GenericEvent event){
        if(event instanceof ReadyEvent)
            System.out.println("API is ready");                 // Checks if the bot is available
    }

    


}
