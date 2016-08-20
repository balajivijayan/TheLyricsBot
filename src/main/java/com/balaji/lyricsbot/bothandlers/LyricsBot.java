package com.balaji.lyricsbot.bothandlers;

import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import com.balaji.lyricsbot.BotConfig;
import com.balaji.lyricsbot.controller.LyricsBotController;

public class LyricsBot extends TelegramLongPollingBot {

	public String getBotUsername() {
		return BotConfig.getBotUsername();
	}

	public void onUpdateReceived(Update update) {
		System.out.println("Message Received");
		if (update.hasMessage()) {
			Message message = update.getMessage();
			if (message.hasText()) {
				LyricsBotController controller = new LyricsBotController();
				controller.handleMessage(message);
			}
		}

	}

	@Override
	public String getBotToken() {
		return BotConfig.getBotToken();
	}

	public void replyToUpdate(String chatId, String lyrics) {
		SendMessage sendMessageReq = null;
		try {
			sendMessageReq = new SendMessage();
			sendMessageReq.setChatId(chatId);
			sendMessageReq.setText(lyrics);
			sendMessage(sendMessageReq);
		} catch (TelegramApiException te) {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
