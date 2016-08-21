package com.balaji.lyricsbot.bothandlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyHandler {

	private static PropertyHandler propsInstance = null;
	private static final String FILE_NAME = "bot.properties";
	
	private Properties props = null;

	private PropertyHandler() {
		InputStream inputStream = null;
		try {
			props = new Properties();
			//File file = new File(getClass().getClassLoader().getResource(FILE_NAME).getFile());
			inputStream = ClassLoader.getSystemResourceAsStream(FILE_NAME);
					//new FileInputStream(file);
			props.load(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static synchronized PropertyHandler getInstance() {
		if(propsInstance == null)
			propsInstance =  new PropertyHandler();
		return propsInstance;
	}
	
	
	public String getValue(String key) {
		return this.props.getProperty(key);
	}
	
}
