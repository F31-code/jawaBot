import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public void onMessageReceived(MessageReceivedEvent event) {
    if (event.getAuthor().isBot()) return;

            User author = event.getAuthor();
            Message message = event.getMessage();
            String content = message.getContentRaw();
            MessageChannel channel = event.getChannel();
            Member member = event.getMember();
            String nickname = member.getNickname();
            Role role = event.getGuild().getPublicRole();
}
