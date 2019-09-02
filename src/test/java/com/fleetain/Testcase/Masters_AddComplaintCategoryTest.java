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
import com.fleetain.pages.Masters_AddComplaintCategoryPage;
import com.fleetain.utility.ExcelSheetRead;

public class Masters_AddComplaintCategoryTest extends TestBase {
	String Excel_Sheet_Path="D:\\FleetainWorkSpace\\FleetainProduct\\src\\main\\java\\com\\fleetain\\TestData\\AddVehiclePartCategory.xlsx";
	String Sheet_Name="Vehicle_Complaints_Category";
	public static final Logger logge=Logger.getLogger(Masters_AddComplaintCategoryTest.class.getName());
     LoginPage loginpage;
	 HomePage homepage;
	 MastersPage masterpage;
	 Masters_AddComplaintCategoryPage addcomcatpage;
	
	public Masters_AddComplaintCategoryTest(){
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
   	   addcomcatpage=masterpage.clickOnAddComplaintCategory();
	}
	
	
	@DataProvider
	public Object[][] addComplaintCategory() {
		Object dataSets[][]=ExcelSheetRead.getXlsxTestData(Excel_Sheet_Path, Sheet_Name);
		return dataSets;
	}
	@Test(dataProvider = "addComplaintCategory")
	public void add_Complaint_Category(String complaintCate ) {
		
		addcomcatpage.addComplaintCategory(complaintCate);
		logge.info("Add Complaint Category");
		String message=addcomcatpage.successMessage();
		Assert.assertEquals(message, "Inserted Successfully");
		logge.info("Verify Successful Message");
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		//driver.close();
		logge.info("Close Browser");
	}
	
}
