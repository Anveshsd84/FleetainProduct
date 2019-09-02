package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class Masters_AddVendorTypesPage extends TestBase {

	@FindBy(xpath="//*[@class='btn btn-sm btn-primary']") WebElement addVendorTypeButton;
	
	@FindBy(id="VENDOR_TYPE") WebElement enterVenderType;
	
	@FindBy(id="tag-form-submit") WebElement clickSubmitButton;
	
	@FindBy(xpath="//*[@class='btn btn-warning']") WebElement clickClearButton;
	
	@FindBy(xpath="") WebElement fgk;
	
	
	@FindBy(xpath="//*[@id='myTable']/tbody/tr[e]/td[2]") WebElement fgw;

	
	@FindBy(xpath="") WebElement fgt;
	
	public Masters_AddVendorTypesPage() {
		PageFactory.initElements(driver, this);
	}
}
