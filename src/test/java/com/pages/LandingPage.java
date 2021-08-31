package com.pages;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.utilities.BaseClass;
import com.utilities.JavaPropertiesManager;
import com.utilities.Library;

public class LandingPage extends BaseClass {

	JavaPropertiesManager prop = new JavaPropertiesManager("src/test/java/com/pagesLocators/landingPageLocators.properties");
	
	

	public void verifyLandingPageTitle() {
		try {

			String actualTitle = driver.getTitle();
			String expectedTitle = "Next Official Site: Online Fashion, Kids Clothes & Homeware";
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.close();
			System.out.println("Hala Wallah");
			
			System.out.println("Hello from Egypt");
			driver.findElement(By.xpath("//hamada"));
			

		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
			driver.close();
		}

	}

	///This is a new test case that Sally did
	//asdasdasd
	
	public void NX101_verifyMyAccountButtonFunctionality() {
		try {
			
			WebElement myAccountButton = driver.findElement(By.xpath(prop.readProperty("myAccountButton")));
			myAccountButton.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			assertTrue(false);
		}

		
	}
}
