package com.utilities;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class JavaPropertiesManager {

	private String propertiesFile;
	private Properties prop;
	private OutputStream output;
	private InputStream input;

	/***
	 * Added by Mina on 03/28/2020
	 * 
	 * @param propertiesFilePath
	 */
	public JavaPropertiesManager(String propertiesFilePath) {
		try {
			propertiesFile = propertiesFilePath;
			prop = new Properties();

		} catch (Exception e) {

			assertTrue(false);
		}
	}

	public String readProperty(String key) {
		String value = null;
		try {
			input = new FileInputStream(propertiesFile);
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

	public void setProperty(String key, String value) {

		try {
			output = new FileOutputStream(propertiesFile);
			prop.setProperty(key, value);
			prop.store(output, null);
		} catch (Exception e) {

		} finally {
			try {
				if (output != null) {
					output.close();
				}

			} catch (Exception e) {

				assertTrue(false);
			}
		}

	}

	public void setProperty(String key, String value, String comment) {

		try {
			output = new FileOutputStream(propertiesFile);
			prop.setProperty(key, value);
			prop.store(output, comment);
		} catch (Exception e) {

		} finally {
			try {
				if (output != null) {
					output.close();
				}

			} catch (Exception e) {

				assertTrue(false);
			}
		}

	}
}
