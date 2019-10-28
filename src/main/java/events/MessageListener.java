package events;

import java.util.Random;

import giphy.Giphy;
import giphy.entity.search.SearchFeed;
import messages.Messages;
import miscelanea.BotInfo;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		if(!e.getAuthor().isBot()) {
			String[] args = e.getMessage().getContentRaw().split(" ");
			String cmd = args[0];
			
			switch (cmd.toLowerCase()) {
			case BotInfo.prefix + "giphy":
				if(args.length >= 2) {
					String url = giphySearch(format(args));
					if(url != null) {
						e.getChannel().sendMessage(Messages.action(e.getMember(), url).build()).queue();
					} else {
						e.getChannel().sendMessage(Messages.action(e.getMember(), BotInfo.noFoundImageUrl).build()).queue();
					}
				} else {
					e.getChannel().sendMessage(Messages.incorrectUsage(e.getMember(), "giphy <content>").build()).queue();
				}
			default:
				break;
			}
		}
	}
	
	private String giphySearch(String search) {
		try {
			Giphy giphy = new Giphy(BotInfo.giphyKey);
			SearchFeed feed;
			feed = giphy.search(search, 100, 0);
			Random r = new Random();
			int max = feed.getDataList().size() - 1;
			int index = (r.nextInt((max - 0) + 1) + 0);
			return feed.getDataList().get(index).getImages().getOriginal().getUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String format(String[] strArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < strArray.length; i++) {
            stringBuilder.append(strArray[i] + " ");
        }
        return stringBuilder.toString();
    }
		
}
