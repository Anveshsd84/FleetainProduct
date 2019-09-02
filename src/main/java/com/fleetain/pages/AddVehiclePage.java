package com.fleetain.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fleetain.TestBase.TestBase;

public class AddVehiclePage extends TestBase {

	// All Object Repository

	@FindBy(xpath = "//a[@class='dropdown-toggle profile-pic']//following-sibling::b")
	WebElement userLabelName;

	@FindBy(name = "LICENSE_PLATE")
	WebElement licensePlate;

	@FindBy(xpath = "//select[@name='TYPE']")
	WebElement selectMakeModel;

	@FindBy(name = "YEAR")
	WebElement enterYear;

	@FindBy(name = "PHOTO")
	WebElement addvehicalePhoto;

	@FindBy(name = "LOCATION")
	WebElement selectRegion;

	@FindBy(name = "VIN")
	WebElement enterVIN;

	@FindBy(name = "VEHICLE_NAME")
	WebElement enterProductName;

	@FindBy(name = "RESPONSIBILITY")
	WebElement responsiblePerson;

	@FindBy(name = "STATUS")
	WebElement vehicalStatus;

	@FindBy(name = "DRIVER_NAME")
	WebElement driverName;

	@FindBy(name = "DRIVER_CONTACT")
	WebElement driverContactNumber;

	@FindBy(name = "CLEANER_NAME")
	WebElement cleanerName;

	@FindBy(name = "CLEANER_CONTACT")
	WebElement cleanerContactNumber;

	@FindBy(name = "OWNERSHIP")
	WebElement selectOnerShip;

	@FindBy(name = "COLOR")
	WebElement colorOfVehicale;

	@FindBy(name = "BODY_TYPE")
	WebElement vehicaleBodyType;

	@FindBy(name = "MSRP")
	WebElement enterMSRP;

	@FindBy(name = "OWNER_NAME")
	WebElement ownearName;

	@FindBy(name = "OWNER_CONTACT")
	WebElement ownerContactNumber;

	@FindBy(name = "OWNER_ADDRESS")
	WebElement ownerAddress;

	@FindBy(xpath = "//a[@value='cancel']")
	WebElement cancelButon;

	public AddVehiclePage() {
		// initialize elements
		PageFactory.initElements(driver, this);
	}

	public String validateAddVehiclePageTitleTitle() { // Validate the Complaint Page Title
		return driver.getTitle();
	}

	public boolean verifiCorrectUserName() { // validate Username
		return userLabelName.isDisplayed();
	}

	
	
	public void IdentificationDetailsofvehicle(String licencePlate,String MakeModelType,String registrationYear,String vehicleIdentificationNumber,String product,
			 String responsibleperson, String reginofvehicle ) throws InterruptedException {
		
		licensePlate.sendKeys(licencePlate);
		selectMakeModel.click(); 
		Select stat=new Select(selectMakeModel);
		  stat.selectByVisibleText(MakeModelType);
		 logg.info("Enter vehicle Model Type");
		 
		 Thread.sleep(2000);
		enterYear.sendKeys(registrationYear);
		
		selectRegion.click(); 
		Select regin=new Select(selectRegion);
		 regin.selectByVisibleText(reginofvehicle);
		 Thread.sleep(2000);
		 
		enterVIN.sendKeys(vehicleIdentificationNumber);
		enterProductName.sendKeys(product);
		responsiblePerson.click(); Select respo=new Select(responsiblePerson);
		  respo.selectByVisibleText(responsibleperson); 
		  Thread.sleep(2000);
		  
		  cancelButon.click();
		  
	}
	
	  public void enterIdentificationDetailsofvehicle() {
	  
//	  licensePlate.sendKeys(prop.getProperty("vehicleNumber"));
//	  logg.info("Enter vehicle Number");
	  
//	  selectMakeModel.click(); Select stat=new Select(selectMakeModel);
//	  stat.selectByValue(prop.getProperty("MakeModelType"));
//	  logg.info("Enter vehicle Model Type");
	  
//	  enterYear.sendKeys(prop.getProperty("RegistrationYear"));
//	  logg.info("Enter registration year ");
	  
//	  selectRegion.click(); Select regin=new Select(selectRegion);
//	  regin.selectByValue(prop.getProperty("Regionofvehicale"));
	  
//	  enterVIN.sendKeys(prop.getProperty("VINNumber"));
	  
//	  enterProductName.sendKeys(prop.getProperty("VehicaleProductName"));
	  
//	  responsiblePerson.click(); Select respo=new Select(responsiblePerson);
//	  respo.selectByValue(prop.getProperty("responsiblePersion")); 
	  }
	  
	  
	  public void addVehicalePhotos() throws AWTException, InterruptedException {
	  
	  
	 // FileUploadCls fis=new FileUploadCls(); fis.uploadFile();
	  
	  addvehicalePhoto.click(); 
	  String docFile=prop.getProperty("photoPath");
	  StringSelection strSel =new StringSelection(docFile);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, null);
	  Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
	  Thread.sleep(3000); robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	  }
	  
	  
	  public void enterVehicleClassificationdetails() { 
		 
	  
//	  Select stat=new Select(vehicalStatus);
//	  stat.selectByVisibleText(prop.getProperty("statusVehicale"));
	  
//	  driverName.sendKeys(prop.getProperty("drivername"));
	  
		/*
		 * driverContactNumber.sendKeys(prop.getProperty("driverContactNum"));
		 * 
		 * cleanerName.sendKeys(prop.getProperty("CleanerName"));
		 * 
		 * cleanerContactNumber.sendKeys(prop.getProperty("cleanerContactNum"));
		 * 
		 * selectOnerShip.click(); Select onership=new Select(selectOnerShip);
		 * onership.selectByVisibleText(prop.getProperty("vehicleOwnership"));
		 */
	  
	  }
	  
	  
	  public void enterAdditionalDetailsofVehicale() {
		/*
		 * colorOfVehicale.sendKeys(prop.getProperty("vehicleColor"));
		 * 
		 * vehicaleBodyType.sendKeys(prop.getProperty("vehicleBodyType"));
		 * 
		 * enterMSRP.sendKeys(prop.getProperty("vehicleMSRP"));
		 */
	  
	  }
	  
	  
	  public void enterVehicaleOwnerDetails() {
	  
		/*
		 * ownearName.sendKeys(prop.getProperty("OwnerName"));
		 * 
		 * ownerContactNumber.sendKeys(prop.getProperty("OwnerContactNumber"));
		 * 
		 * ownerAddress.sendKeys(prop.getProperty("OwnearAddressNumber"));
		 */
	  }
	  
	  
	  
	  public void clickoncancellButton(){ 
		  cancelButon.click(); 
		  }
	 

}
