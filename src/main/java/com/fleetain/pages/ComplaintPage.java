package com.fleetain.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class ComplaintPage extends TestBase {
	
	
//	All Object Repository
	// xpath of User Label Name
	@FindBy(xpath = "//a[@class='dropdown-toggle profile-pic']//following-sibling::b")
	WebElement userLabelName;
	
    //  xpath of Complaint Page Heading
	@FindBy(xpath="//h3[@class='title_h33']/b")
	WebElement complaintsListText;
	
	// xpath of search box 
	@FindBy(xpath= "//input[@type='search']")
	WebElement searchBox;
	
/*	@FindBy()
	WebElement
	
	@FindBy()
	WebElement
	
	
	@FindBy()
	WebElement
	
	
	@FindBy()
	WebElement
	
	@FindBy()
	WebElement
	*/
	public ComplaintPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateComplaintPageTitle(){            // Validate the Complaint Page Title
		return driver.getTitle();
	}
	
	public String validatePageHeading() {
		return complaintsListText.getText();                 // Get Heading Text Of Complaint Web Page
		
	}
	public void searchBox(String enterVehicale) {
		searchBox.sendKeys(enterVehicale);
		searchBox.sendKeys(Keys.ENTER);
		
	}
	
	
}
