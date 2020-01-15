package com.TIAA.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.TIAA.qa.base.TestBase;
import com.TIAA.qa.pages.LandingPage;
import com.TIAA.qa.pages.ProductSelectionPage;

public class LandingPageTest extends TestBase{
	
	LandingPage landingPage;
	ProductSelectionPage productSelectionPage;
	
	public LandingPageTest() {
		super();
	}

	@BeforeMethod
	public void setup(){
		initialization();
		landingPage = new LandingPage();
				
	}
	
	@Test(priority=0)
	public void displayPageTitle() {
		
		String title = landingPage.validatePageTitle();
		Assert.assertEquals(title, "TIAA Bank :: Bank on Better: High Yields, Home Loans, 24/7 Support");
		System.out.println("Title displayed correctly as expected");
	}
	
	@Test(priority=1)
	public void displayTIAALogo() {
		
		boolean flag = landingPage.validateLogo();
		Assert.assertTrue(flag);
		System.out.println("TIAA logo present on the page");
		
	}
	
	@Test(priority=2)
	public void dispalyProductSelectionPage() {
		productSelectionPage = landingPage.clkOpenACBtn();
		System.out.println("User is now on Product Selection Page");
	}
	
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }

}
