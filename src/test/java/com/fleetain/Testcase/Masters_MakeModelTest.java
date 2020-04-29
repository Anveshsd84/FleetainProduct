package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;

import com.fleetain.pages.MastersPage;
import com.fleetain.pages.Masters_MakeModelPage;
import com.fleetain.utility.ExcelSheetRead;

public class Masters_MakeModelTest extends TestBase {
	String excelpath="";
	String sheetName="";
	public static final Logger logge=Logger.getLogger(Masters_MakeModelTest.class.getName());
	LoginPage loginpage;
	HomePage homepage;
	MastersPage masterpage;
	Masters_MakeModelPage makemodelpage;
	public Masters_MakeModelTest() {
		super();
		logge.info("call supar Constructor");
	}
	
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		browserOpen();
		loginpage=new LoginPage();
   	    homepage = loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
   	    masterpage=homepage.clickOnMasterPage();
   	    Thread.sleep(2000);
   	    makemodelpage=masterpage.clickOnMakeModelPage();
          	     
	}
	
	@DataProvider
	public Object[][] enterMakeModel(){
		Object[][] dataSets=ExcelSheetRead.getXlsxTestData(excelpath, sheetName);
		return dataSets;
	}
	
	@Test
	public void enter_Make_Model_Details() {
		makemodelpage.clickOnAddMakeModel();
		
	}
	
	@AfterMethod 
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(15000); 
	 // driver.quit(); 
	  logge.info("Close Browser");
	  }
}
