package com.fleetain.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fleetain.TestBase.TestBase;

public class VehicleListPage extends TestBase {
	
   @FindBy(xpath = "//a[contains(text(),' + Add Vehicle ')]")
	WebElement clickOnAddVehicale;
	
	public VehicleListPage() {
		
		//initialize elements
		PageFactory.initElements(driver, this);
	}
	
	public AddVehiclePage clickOnaddVehiclePage() {
		clickOnAddVehicale.click();
		return new AddVehiclePage();
		
	}
	
	
	
}
