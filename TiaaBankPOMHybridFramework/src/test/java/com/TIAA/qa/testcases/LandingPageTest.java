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

	@BeforeTest
	public void setup(){
		initialization();
		landingPage = new LandingPage();
				
	}
	
	@Test(priority=0)
	public void displayPageTitle() {
		
		String title = landingPage.validatePageTitle();
		Assert.assertEquals(title, "Banking & Investing :: TIAA Bank");
		System.out.println("Title displayed as expected");
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
	
    @AfterTest
    public void tearDown() {
    	driver.quit();
    }

}
