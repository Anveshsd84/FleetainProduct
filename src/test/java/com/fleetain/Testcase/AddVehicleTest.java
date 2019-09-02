package com.fleetain.Testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.AddVehiclePage;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.VehicleListPage;
import com.fleetain.utility.ExcelSheetRead;
import com.fleetain.utility.TestUtils;

public class AddVehicleTest extends TestBase {
	public static final Logger logge=Logger.getLogger(AddVehicleTest.class.getName());
	LoginPage loginPage;
	HomePage homepage;
	VehicleListPage vehicallistpage;
	AddVehiclePage addvehicle;
	TestUtils utils;
	String vehicleIdentificationdetails="Vehicale_Identification_details";
	String ExcelPath="D:\\FleetainWorkSpace\\FleetainProduct\\src\\main\\java\\com\\fleetain\\TestData\\Add_Vehicle_Details.xls";
	
	public AddVehicleTest() {
		super();
		logge.info("Initialize the Super Constructor");
	}
	
	@BeforeClass	
		public void setUp() throws InterruptedException{
			browserOpen();
			loginPage=new LoginPage();
	   	    homepage = loginPage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
	   		vehicallistpage=homepage.clickOnVehiclePage();
	   		Thread.sleep(3000);
	   		addvehicle=vehicallistpage.clickOnaddVehiclePage();
	   		
		}
	
	@Test(priority=1)
        public void verify_Add_Vehicle_Page_Title() {
		
		String addvehicaletitle=addvehicle.validateAddVehiclePageTitleTitle();
		Assert.assertEquals(addvehicaletitle, "Fleetain - Modern Maintenance software");
		System.out.println(addvehicaletitle);
		logge.info("Verify Add vehicale Page Title ");
		
	}
	
	@Test(priority=2)
	public void verify_Correct_UserName_On_Add_Vehicle() {
		Assert.assertTrue(addvehicle.verifiCorrectUserName());
		logge.info("Check UserName On Add vehicle");
	}
	
	@DataProvider
	public Object[][] getVehicleTestData() {
		Object data[][]=ExcelSheetRead.getXlsTestData(ExcelPath,vehicleIdentificationdetails);
		return data;
	}
	
	
	@Test(priority = 3, dataProvider ="getVehicleTestData" )
	public void enter_Vehicle_Details(String vehicleplate,String makeModel, String year, String VIN, String product1,String reginofvehicle1,String
			responsibleperson1
			) throws InterruptedException {
		addvehicle.IdentificationDetailsofvehicle(vehicleplate,makeModel, year, VIN, product1, responsibleperson1,reginofvehicle1);
	}
	
	
	
	  @Test(priority=4,enabled = false) public void enter_Details_Identification_Of_Vehicle() {
	  
	  addvehicle.enterIdentificationDetailsofvehicle();
	  logge.info("Enter Identification details Of Vehicle"); }
	  
	  @Test(priority =5,enabled = false) public void enter_vehicale_Classification_details() {
	  
	  addvehicle.enterVehicleClassificationdetails();
	  logge.info("Enter vehicle Classification Details"); }
	  
	  
	  @Test(priority =6,enabled = false) public void enter_Additional_Details_of_vehicle() {
	  addvehicle.enterAdditionalDetailsofVehicale();
	  logge.info("Enter Additional Details Of the vehicle"); }
	  
	  @Test(priority = 7,enabled = false) public void enter_vehicle_Owner_details() {
	  addvehicle.enterVehicaleOwnerDetails();
	  logge.info("Enter Vehical Owner Details"); }
	  
	  @Test(priority=8,enabled = false) public void add_Vehicle_Photo() throws AWTException,
	  InterruptedException { addvehicle.addVehicalePhotos();
	  logge.info("Add vehicle Photo"); }
	  
	  @Test(priority= 9,enabled = false) public void click_On_Save_Exit_Buttion() {
	  
	  logge.info("Click on Save & Exit Button"); }
	  
	  @Test(priority = 10,enabled = false) public void click_On_cancelButton() {
	  addvehicle.clickoncancellButton(); 
	  logge.info("Click on Cancel Button "); }
	 
	 
	 @AfterClass
	public void closeBrowser() throws InterruptedException{
		 Thread.sleep(2000);
		//driver.close();
		logge.info("Close Browser");
	 }
	
}
