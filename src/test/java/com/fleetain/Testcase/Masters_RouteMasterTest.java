package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.MastersPage;
import com.fleetain.pages.Masters_RouteMasterPage;

public class Masters_RouteMasterTest extends TestBase{
	public static final Logger logge=Logger.getLogger(Masters_RouteMasterTest.class.getName());
      LoginPage loginpage;
      HomePage homepage;
      MastersPage masterpage;
      Masters_RouteMasterPage routmaserpage;
      
	
	public Masters_RouteMasterTest() {
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
		routmaserpage=masterpage.clickOnRouteMaster();
	}
	
	
	@Test()
	public void none() {
		
	}
	
	 @AfterMethod 
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(15000); 
	 // driver.quit(); 
	  logge.info("Close Browser");
	  }
}
