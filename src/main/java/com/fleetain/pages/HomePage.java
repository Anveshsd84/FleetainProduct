package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class HomePage extends TestBase {

	// Check All Link Are Click able Or Not Check 
	// User Name label 
	@FindBy(xpath = "//a[@class='dropdown-toggle profile-pic']//following-sibling::b")
	WebElement userNameLable;
	
	// Click on  Master 
	@FindBy(xpath = "//span[contains(text(), ' Masters ')]")
	WebElement clickOnMaster;
	
	// Click On Vehicle
	@FindBy(xpath = "//span[contains(text(), ' Vehicle  ')]")
	WebElement clickOnVehicle;
	
	// click On Inventory
	@FindBy(xpath= "//span[contains(text(), '  Inventory ')]")
	WebElement clickOnInventory;
	
	// click on Inspections 
	@FindBy(xpath = "//span[contains(text(), ' Inspections ')]")
	WebElement clickOnInspections;
	
	// click on Complaints
	@FindBy(xpath = "//span[contains(text(), ' Complaint  ')]")
	WebElement Complaint;
	
	// click on Task List
	@FindBy(xpath ="//span[contains(text(), ' Task List   ')]")
	WebElement clickOnTaskList;
	
	// click on Work Order
	@FindBy(xpath = "//span[contains(text(), ' Work Order ')]")
	WebElement clickOnWorkOrder;
	
	// click on Service Bill
	@FindBy(xpath ="//span[contains(text(), ' Service Bill ')]")
	WebElement clickOnServiceBill;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifHomePageTitle() {
	
		return driver.getTitle();
	
		
	}
	
	public boolean verifiCorrectUserName() {
		return userNameLable.isDisplayed();
	}
	
	public MastersPage clickOnMasterPage() {
		clickOnMaster.click();
		return new MastersPage();
	}
	
	
	public VehicleListPage clickOnVehiclePage() {
		clickOnVehicle.click();
		return new VehicleListPage();
	}
	
	public InventoryPage clickOnInventory() {
		clickOnInventory.click();
		return new InventoryPage();
	}
	
	public InspectionsPage clickOnInspectionPage() {
		clickOnInspections.click();
		
		return new InspectionsPage();
	}
	
	public ComplaintPage clickOnComplaint() {
		Complaint.click();
		
		return new ComplaintPage();
	}
	
	public TaskListPage clickOnTaskList() {
		clickOnTaskList.click();
		return new TaskListPage();
	}
	
	public WorkOrderPage clickOnWorkOrder() {
		clickOnWorkOrder.click();
		return new WorkOrderPage();
	}
	
	public ServiceBillPage clickOnServiceBill() {
	
	clickOnServiceBill.click();
	return new ServiceBillPage();
	}
	
}
