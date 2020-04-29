package com.fleetain.pages;

import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class InventoryPage extends TestBase {

	
	
	public InventoryPage() {
		PageFactory.initElements(driver, this);
	}
}
