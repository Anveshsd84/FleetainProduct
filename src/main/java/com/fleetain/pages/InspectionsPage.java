package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class InspectionsPage extends TestBase {

	@FindBy(xpath = "//a[@class='dropdown-toggle profile-pic']//following-sibling::b")
	WebElement userNameLable;
	
	@FindBy(xpath = "//a[contains(text(),' Inspection List')]")
	WebElement clickonInspectionList;
	
	@FindBy(xpath="//a[contains(text(),'Scheduled Inspection ')]")
	WebElement sheduleInspection;
	
	public InspectionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifHomePageTitle() {
		
		return driver.getTitle();	
	}
	
	public boolean verifiCorrectUserName() {
		return userNameLable.isDisplayed();
	}
	
	public Inspection_InspectionListPageMonthly clickOnInspectionListMonthly() {
		clickonInspectionList.click();
		return new Inspection_InspectionListPageMonthly();
		
	}
	public Inspection_InspectionListPageDaily clickOnInspectionList() {
		clickonInspectionList.click();
		return new Inspection_InspectionListPageDaily();
		
	}
	public Inspection_InspectionListPageYearly clickOnInspectionListYearly(){
		clickonInspectionList.click();
		return new Inspection_InspectionListPageYearly();
	}
	public void clickOnSheduleInspection() {
		
		
		
	}
}
