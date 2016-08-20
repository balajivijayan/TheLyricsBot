package com.balaji.lyricsbot.controller;

import org.telegram.telegrambots.api.objects.Message;

import com.balaji.lyricsbot.service.LyricsBotService;

public class LyricsBotController {

	public void handleMessage(Message message) {
		try {
			if (message.hasText()) {
				String songName = message.getText();
					LyricsBotService service = new LyricsBotService();
					service.getReplyMessage(message.getChatId()
							.toString(), songName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
