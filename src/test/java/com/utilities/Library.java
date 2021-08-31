package com.utilities;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Library {

	public String readProperty(String key, String propertiesFilePath) {
		String value = null;
		Properties prop = prop = new Properties();;
		InputStream input = null;
		
		try {

			input = new FileInputStream(propertiesFilePath);
			prop.load(input);
			value = prop.getProperty(key);

		} catch (Exception e) {

		} finally {
			try {
				if (input != null) {
					input.close();
				}
			} catch (Exception e) {

				assertTrue(false);
			}
		}
		return value;

	}

}
