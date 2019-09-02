package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class WorkOrderPage extends TestBase {

	@FindBy(xpath = "//a[@class='dropdown-toggle profile-pic']//following-sibling::b")
	WebElement userNameLable;
	
	public WorkOrderPage() {
		PageFactory.initElements(driver, this);
	}
	
public String verifHomePageTitle() {
		
		return driver.getTitle();	
	}
	
	public boolean verifiCorrectUserNameon() {
		return userNameLable.isDisplayed();
	}
	
	
	
}
