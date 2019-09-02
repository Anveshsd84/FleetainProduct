package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class Masters_WarehouseMasterPage extends TestBase {

	
	@FindBy(xpath="//a[contains(text(),' Warehouse Master ')]")
	WebElement clickonwarehouse;
	
	public Masters_WarehouseMasterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnWarehouseMaster() {
		
	}
	
}
