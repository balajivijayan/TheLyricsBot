package com.balaji.lyricsbot.service;

import java.net.URLEncoder;

import com.balaji.lyricsbot.bothandlers.LyricsBot;
import com.balaji.lyricsbot.bothandlers.PropertyHandler;
import com.balaji.lyricsbot.model.LyricsRequest;
import com.balaji.lyricsbot.model.Request;
import com.balaji.lyricsbot.webservice.FetchLyrics;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LyricsBotService {

	public void getReplyMessage(String chatId, String songName) {
		String lyricsToSend = "";
		try {
			
			if(songName.equals("/start")) {
				lyricsToSend = PropertyHandler.getInstance().getValue("bot.default.message");
			} else {
				lyricsToSend = getLyrics(songName);
			}
			
			LyricsBot bot = new LyricsBot();
			bot.replyToUpdate(chatId, lyricsToSend);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getLyrics(String songName) {
		String lyrics = "";
		try {
			LyricsRequest lyricReq = new LyricsRequest();
			Request req = new Request();

			req.setIndexName("song");
			req.setParams(URLEncoder.encode(songName));
			lyricReq.getRequests().add(req);
			lyricReq.setRequests(lyricReq.getRequests());

			ObjectMapper mapper = new ObjectMapper();
			FetchLyrics fetch = new FetchLyrics();
			lyrics = fetch.searchLyrics(mapper
					.writeValueAsString(lyricReq));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lyrics;
	}
}
