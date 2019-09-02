package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.MastersPage;
import com.fleetain.pages.Masters_WarehouseMasterPage;

public class Masters_WarehouseMasterTest extends TestBase {
	  public static final Logger logge=Logger.getLogger(Masters_WarehouseMasterTest.class.getName());
      LoginPage loginpage;
      HomePage homepage;
      MastersPage masterpage;
      Masters_WarehouseMasterPage warehousepage;
      
	
	public Masters_WarehouseMasterTest() {
		super();
		logge.info("Initialize the Super Constructor");
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		browserOpen();
		loginpage =new LoginPage();
		homepage=loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));	
		masterpage=homepage.clickOnMasterPage();
		Thread.sleep(2000);
		warehousepage=masterpage.clickOnWarehouseMaster();
	}
	
	@Test
	public void none() {
		
		
		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		//driver.close();
		logge.info("Close Browser");
	}
}
