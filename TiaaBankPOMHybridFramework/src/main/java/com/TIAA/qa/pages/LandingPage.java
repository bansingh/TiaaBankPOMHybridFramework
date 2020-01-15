package com.TIAA.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TIAA.qa.base.TestBase;

public class LandingPage extends TestBase {
	
	//PageFactory or ObjectRepository******************
	
	@FindBy(xpath="//a[@class='action-bar__cta-btn']")
	WebElement openACBtn;
	
	@FindBy(xpath="//img[@class='nav__global-brand-img']")
	WebElement tiaaLogo;
	
		
	public LandingPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
  //Actions************************
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return tiaaLogo.isDisplayed();
	}
	
	public ProductSelectionPage clkOpenACBtn() {
		openACBtn.click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ProductSelectionPage();
	}
}
