package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;
import com.fleetain.Testcase.Masters_UnitMasterTest;

public class MastersPage extends TestBase {

	
	
	@FindBy(xpath = "//a[contains(text(),'Parts Category ')]")
	WebElement clickPartCategory;
	
	@FindBy(xpath ="//a[contains(text(),'Complaint Category ')]" )
	WebElement clickAddComplaintCat;
	
	@FindBy(xpath = "//a[contains(text(),'Make-Model ')]")
	WebElement clickOnMakeModelPage;
	
	
    @FindBy(xpath="//a[contains(text(),' Unit Master ')]")
    WebElement clickOnUnitMaster;
    
    @FindBy(xpath = "//a[contains(text(),' Warehouse Master ')]")
    WebElement clickOnWareHouse;
	
    @FindBy(xpath = "//a[@class='active']")
    WebElement clickOnAddVendorType;
    
    @FindBy(xpath="//a[@id=\"side-menu\"]/li[4]/ul/li[8]/a")
    WebElement clickOnVendorPage;
    
    @FindBy(xpath = "//a[contains(text(),' Petrol Pump Master ')]")
    WebElement clickOnPetrolPumpMaster;
    
    
    @FindBy(xpath="//a[contains(text(),' Labour Master ')]")
    WebElement clickOnLabourMaster;
    
    
    @FindBy(xpath = "//a[contains(text(),' Route Master ')]")
    WebElement clickOnRoutMasterPage;
    
    @FindBy(xpath ="//a[contains(text(),' Purpose Master ')]")
    WebElement clickOnPurposeMaster;
    
    
   
	public MastersPage() {
		PageFactory.initElements(driver, this);
	}
	
	public Masters_AddPartCategoryPage clickOnAddPartCategory() {
		clickPartCategory.click();
		return new Masters_AddPartCategoryPage();
	}
	
	public Masters_AddComplaintCategoryPage clickOnAddComplaintCategory() {
		clickAddComplaintCat.click();
		return new Masters_AddComplaintCategoryPage();
	}
	public Masters_MakeModelPage clickOnMakeModelPage() {
		clickOnMakeModelPage.click();
		return new Masters_MakeModelPage();
	}
	
	public Masters_UnitMasterTest clickOnUnitMaster() {
		clickOnUnitMaster.click();
		return new Masters_UnitMasterTest();
	}
	public Masters_WarehouseMasterPage clickOnWarehouseMaster() {
		clickOnWareHouse.click();
		return new Masters_WarehouseMasterPage();
	}
	public Masters_AddVendorTypesPage clickOnAddVendorType() {
		
		clickOnAddVendorType.click();
		return new Masters_AddVendorTypesPage();
	}
	
	public Masters_AddVendorPage clickOnAddVendor() {
		clickOnVendorPage.click();
		
		return new Masters_AddVendorPage();
	}
	
	public Masters_PetrolPumpMasterPage clickOnPetrolPumpMaster() {
		clickOnPetrolPumpMaster.click();
		return new Masters_PetrolPumpMasterPage();
	}
	
	public Masters_LabourMasterPage clickOnLabourMaster() {
		clickOnLabourMaster.click();
		return new Masters_LabourMasterPage();
	}
	
	public Masters_RouteMasterPage clickOnRouteMaster() {
		clickOnRoutMasterPage.click();
		return new Masters_RouteMasterPage();
	}
	
	public Masters_PurposeMasterPage clickOnPurposeMaster() {
		clickOnPurposeMaster.click();
		return new Masters_PurposeMasterPage();
	}
	

}
