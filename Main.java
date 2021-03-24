import net.dv8tion.jda.core.*;

public class Main {

    public static JDA jda;
    
    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder()
            .setToken()
            .setActivity(Activity.playing("jawaBot"))
            .addEventListeners(new EventListener())
            .build();
    }
    
    pubic class EventListener extends ListenerAdapter {
        if (event.getAuthor().isBot()){
            return;
        }
        System.out.printIn("Some nerd said " + event.getMessage().getContentRaw());
    }

}
