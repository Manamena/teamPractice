package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utilities.BaseClass;

public class SearchResultsPage extends BaseClass {

	/*
	 * 
	 * public void verifySearchedDataDisplaysRelatedResults(String searchedData) {
	 * try {
	 * driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(
	 * searchedData); driver.findElement(By.
	 * xpath("//button[@class='btn btn-default button-search']")).click();
	 * Thread.sleep(5000);
	 * 
	 * List<WebElement> searchResults =
	 * driver.findElements(By.xpath("//li/div[1]/div[2]/h5[1]/a[1]"));
	 * 
	 * for (int i = 0; i < searchResults.size(); i++) { WebElement elem =
	 * searchResults.get(i); String actualText = elem.getText();
	 * System.out.println(actualText);
	 * Assert.assertTrue(actualText.contains(searchedData)); }
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

	public void clickOnAnySection(String sectionName) {
		
		
	}
}
