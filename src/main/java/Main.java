import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class Main implements EventListener {

    public static void main(String[] args)
            throws LoginException
    {

        JDA jda = JDABuilder.createDefault(args[0])             //Creating instance of JDA
                .addEventListeners(new Main()).build();
    }

    @Override
    public void onEvent(GenericEvent event){
        if(event instanceof ReadyEvent)
            System.out.println("API is ready");
    }


}
