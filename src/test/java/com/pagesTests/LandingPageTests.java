package com.pagesTests;

import org.openqa.selenium.remote.NewSessionPayload;
import org.testng.annotations.Test;

import com.pages.LandingPage;
import com.utilities.BaseClass;

public class LandingPageTests extends BaseClass{

	LandingPage landing = new  LandingPage();
	
	
	//@Test
	public void verifyLandingPageTitle() {
		landing.verifyLandingPageTitle();
	}
	@Test
	public void NX101_verifyMyAccountButtonFunctionality() {
		landing.NX101_verifyMyAccountButtonFunctionality();
	}
}
