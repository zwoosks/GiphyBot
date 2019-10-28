package messages;

import java.time.Instant;

import miscelanea.BotInfo;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Member;

public class Messages {
	
	public static EmbedBuilder incorrectUsage(Member author, String syntax) {
		
		EmbedBuilder eb = new EmbedBuilder();
		eb.setAuthor(author.getUser().getName(), null, author.getUser().getAvatarUrl());
		eb.addField("Incorrect usage!", "Syntax: " + syntax + "\nCommand Arguments: `<>` = Required, `()` = Optional", false);
		eb.setColor(BotInfo.red);
		eb.setTimestamp(Instant.now());
		eb.setFooter("CrealityBot • " + BotInfo.webPage, BotInfo.botAvatar);
		return eb;
		
	}
	
	public static EmbedBuilder action(Member author, String url) {
		
		EmbedBuilder eb = new EmbedBuilder();
		eb.setAuthor(author.getUser().getName(), null, author.getUser().getAvatarUrl());
		eb.setImage(url);
		eb.setColor(BotInfo.color);
		eb.setTimestamp(Instant.now());
		eb.setFooter("Giphy Bot", BotInfo.botAvatar);
		return eb;
		
	}
	
}
