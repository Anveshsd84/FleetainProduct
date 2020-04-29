package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.MastersPage;
import com.fleetain.pages.Masters_LabourMasterPage;

public class Masters_LabourMasterTest extends TestBase {
   
	public static final Logger logge=Logger.getLogger(Masters_LabourMasterTest.class.getName());
	
	LoginPage loginpage;
	HomePage homepage;
	MastersPage masterpage;
	Masters_LabourMasterPage labourPage;
	
	
	public Masters_LabourMasterTest() {
		super();
		logge.info(" call Super Class Constructor ");
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		browserOpen();
		loginpage =new LoginPage();
		homepage=loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
		masterpage=homepage.clickOnMasterPage();
		Thread.sleep(3000);
		labourPage=masterpage.clickOnLabourMaster();

	}
	@Test
	public void none() {
		
	}
	
	@AfterMethod 
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(15000); 
	 // driver.quit(); 
	  logge.info("Close Browser");
	  }
	
	
}
