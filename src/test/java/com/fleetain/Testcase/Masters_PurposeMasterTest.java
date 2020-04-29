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
import com.fleetain.pages.Masters_PurposeMasterPage;

public class Masters_PurposeMasterTest extends TestBase {
	public static final Logger logge=Logger.getLogger(Masters_PurposeMasterTest.class.getName());
	LoginPage loginpage;
	HomePage homepage;
	MastersPage masterpage;
	Masters_PurposeMasterPage purposemaster;

	public Masters_PurposeMasterTest() {
		super();
		logge.info("call supar Constructor");
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		browserOpen();
		loginpage =new LoginPage();
		homepage=loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
		masterpage=homepage.clickOnMasterPage();
		Thread.sleep(3000);
		purposemaster=masterpage.clickOnPurposeMaster();
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
