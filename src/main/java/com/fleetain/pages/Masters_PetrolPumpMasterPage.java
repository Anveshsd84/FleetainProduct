package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class Masters_PetrolPumpMasterPage extends TestBase {

	@FindBy(xpath = "")
	WebElement dd;
	
	
	public Masters_PetrolPumpMasterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
