import net.dv8tion.jda.core.*;

public class Main {

    private static String token = "Bot Token Here";
    public static void main(String[] args) throws Exception{

        try {
            JDA api = new JDABuilder(AccountType.BOT).setToken(token).build();
            api.addEventListener(new MyEventListner() );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}