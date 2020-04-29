package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class Masters_AddPartCategoryPage extends TestBase {

	
//	All Object Repository
	
	
	private static final String String = null;

	@FindBy(xpath = "//a[@class='dropdown-toggle profile-pic']//following-sibling::b")
    WebElement userLabelName;
	
	@FindBy(id = "category_name")
	WebElement categoryName;
	
	@FindBy(id="submit")
	WebElement clickonsub;
	
	@FindBy(xpath="//input[@name='is_active' and @value='Y']")
	WebElement activepartcatery;
	
	@FindBy(xpath = "//input[@name='is_active' and @value='N']")
	WebElement notActivepartCategory;
	
	@FindBy(xpath="//h4[contains(text(),'Inserted Successfully')]")
	WebElement errorMessage;
	
	public Masters_AddPartCategoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateAddVehiclePageTitleTitle(){            // Validate the Complaint Page Title
		return driver.getTitle();
	}
	
	public boolean verifiCorrectUserName() {                     // validate Username  
		return userLabelName.isDisplayed();
	}
	
	
	
	public void addCategoryName(String categoryname) {
		categoryName.sendKeys(categoryname);
		
		/*
		 * if(){
		 * 
		 * }else if(){
		 * 
		 * }
		 */
		activepartcatery.isSelected();
		notActivepartCategory.isSelected();
		clickonsub.click();
		
	}
	
	public String validateMsgAfterInserData() {
		return errorMessage.getText();
	}
	
}
