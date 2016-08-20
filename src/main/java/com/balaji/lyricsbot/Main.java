package com.balaji.lyricsbot;

import org.telegram.telegrambots.TelegramBotsApi;

import com.balaji.lyricsbot.bothandlers.LyricsBot;

public class Main {
	
	public static void initialize() {
		//TODO
		//Logger and other initialization
	}

	public static void main(String args[]) {
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

		try {
			telegramBotsApi.registerBot(new LyricsBot());
			System.out.println("Bot Initialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
