package com.balaji.lyricsbot.webservice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseHTMLPage {

	public static String parseHTML(String url) {
		String result = "";

		try {

			Document doc = Jsoup.connect(url).get();

			Element body = doc.tagName("body");

			// System.out.println(paraElements.get(1).text());

			Elements paraElemsWithLyrics = body.getElementsByClass("entry");

			for (Element paraElemWithLyrics : paraElemsWithLyrics) {
				result += paraElemWithLyrics.text();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public static void main(String args[]) {
		parseHTML("http://www.paadalvarigal.com/1574/thuppakki-engal-vishwaroopam-song-lyrics.html");
	}
}
