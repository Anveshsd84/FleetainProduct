package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;

import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.MastersPage;
import com.fleetain.pages.Masters_AddPartCategoryPage;
import com.fleetain.utility.ExcelSheetRead;



public class Masters_AddPartCategoryTest extends TestBase {
	
    String EXCEL_SHEET_PATH="D:\\FleetainWorkSpace\\FleetainProduct\\src\\main\\java\\com\\fleetain\\TestData\\AddVehiclePartCategory.xlsx";
    String SHEET_PATH="Sheet1";
	public static final Logger logge=Logger.getLogger(Masters_AddPartCategoryTest.class.getName());
    LoginPage loginpage;
    HomePage homepage;
    MastersPage masterpage;
    Masters_AddPartCategoryPage addpart;
    
	
	
	
	public Masters_AddPartCategoryTest() {
		super();
		logge.info("Initialize the Super Constructor");
	}
	
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		browserOpen();
		loginpage=new LoginPage();
   	    homepage = loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
   	    masterpage=homepage.clickOnMasterPage();
   	    Thread.sleep(2000);
   	    addpart=masterpage.clickOnAddPartCategory();
	}
	
	@Test(priority=1)
	public void verifyCorrectUserName() {
		
	}
	
	@DataProvider
	public Object[][] addPartCategoryy(){
		Object dataSets[][]=ExcelSheetRead.getXlsxTestData(EXCEL_SHEET_PATH, SHEET_PATH);
		
		return dataSets;
		
	}
	  @Test(priority=2, dataProvider = "addPartCategoryy") 
	  public void add_Part_Category(String addpartt) {
		  
		  addpart.addCategoryName(addpartt);
		  logge.info("Add Category Name");
		  String insertMessage=addpart.validateMsgAfterInserData();
		  Assert.assertEquals(insertMessage,"Inserted Successfully");
		  logge.info("verify Succesful Message After Inserting");
		  
		  
	  }
	  @AfterClass
		public void closeBrowser() throws InterruptedException{
			 Thread.sleep(2000);
			//driver.close();
			 logge.info("Close Browser");
		 }
	 
	
}
