package com.balaji.lyricsbot.webservice;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.balaji.lyricsbot.model.Hit;
import com.balaji.lyricsbot.model.LyricsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchLyrics {
	private static final String QUERY_PARAMS = "x-algolia-agent=Algolia%20for%20vanilla%20JavaScript%203.18.0&x-algolia-application-id=OJ1XTEL3A3&x-algolia-api-key=64d5b156c9d6461fc4ac253aec39ef04";
	private static final String URL = "http://oj1xtel3a3-dsn.algolia.net/1/indexes/*/queries";

	public String searchLyrics(String textToPost) {
		CloseableHttpResponse response = null;
		StringBuilder lyricBuilder = null;
		try {
			StringBuilder requestUrl = new StringBuilder(URL);
			requestUrl.append("?");
			requestUrl.append(QUERY_PARAMS);

			System.out.println("URL to Send -->" + requestUrl.toString());

			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(requestUrl.toString());

			StringEntity stringEntity = new StringEntity(textToPost);
			httpPost.setEntity(stringEntity);

			System.out.println("Entity to send -->" + textToPost);
			response = httpClient.execute(httpPost);

			System.out.println("Response status -->"
					+ response.getStatusLine().toString());

			HttpEntity responseEntity = response.getEntity();

			if (responseEntity != null) {
				InputStream iStream = responseEntity.getContent();
				String theString = IOUtils.toString(iStream, "UTF-8");
				ObjectMapper objMap = new ObjectMapper();

				LyricsResponse lyricsResponse = objMap.readValue(theString,
						LyricsResponse.class);

				List<Hit> hits = lyricsResponse.getResults().get(0).getHits();
				lyricBuilder = new StringBuilder();
				for (Hit hit : hits) {
					String lyrics = "";
					System.out.println("URL containing the lyrics -->"
							+ hit.getURL());
					String lyricists = "";
					for(int indexOflyricists = 0; indexOflyricists < hit.getLyricsBy().size(); indexOflyricists++) {
						lyricists+= hit.getLyricsBy().get(indexOflyricists);
						if(indexOflyricists != (hit.getLyricsBy().size() - 1)) {
							//Separating each lyricist 
							lyricists += ", "; 
						}
					}
					lyricBuilder.append("Song Name: " + hit.getTitle()).append("\n");
					lyricBuilder.append("Movie Name: " + hit.getMovie()).append("\n");
					lyricBuilder.append("Lyrics by: " + lyricists).append("\n");
					//Removing Last Modified details
					lyrics = ParseHTMLPage.parseHTML(hit.getURL());
					lyrics = lyrics.substring(0, lyrics.indexOf("Last Modified"));
					lyricBuilder.append(lyrics).append("\n\n");
				}

				System.out.println("lyrics to send -->" + lyricBuilder.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lyricBuilder.toString();
	}
}
