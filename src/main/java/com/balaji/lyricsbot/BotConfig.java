package com.balaji.lyricsbot;

import com.balaji.lyricsbot.bothandlers.PropertyHandler;

public class BotConfig {
	private static final String BOT_USERNAME = PropertyHandler.getInstance().getValue("bot.username");
	//private static final String BOT_TOKEN = "261971361:AAHtTeZMh_AMKwjiL7fi0btkhMsV0nnOwGE";
	private static final String BOT_TOKEN = PropertyHandler.getInstance().getValue("bot.token");


	public static String getBotUsername() {
		return BOT_USERNAME;
	}

	public static String getBotToken() {
		return BOT_TOKEN;
	}
}
