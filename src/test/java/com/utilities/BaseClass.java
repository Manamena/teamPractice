package com.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	// WebDriver driver = startChromeDriver();

	public static WebDriver driver = startChromeDriver();

	@BeforeMethod
	public void setup() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
	}

	public static WebDriver startChromeDriver() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		return driver;
	}

	@AfterMethod
	public void tearDown() {
	driver.close();
	}
}
