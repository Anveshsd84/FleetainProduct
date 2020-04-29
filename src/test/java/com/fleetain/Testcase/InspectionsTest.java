package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.InspectionsPage;
import com.fleetain.pages.LoginPage;

public class InspectionsTest extends TestBase{
	public static final Logger logge=Logger.getLogger(InspectionsTest.class.getName());
	
      LoginPage loginpage;
      HomePage homepage;
      InspectionsPage inspectionpage;
      
	
	
	public InspectionsTest() {
		super();
		logge.info("Initialize theInspection Super Constructor");
	}
	
	@BeforeClass
    public void setUp(){
		browserOpen();
		loginpage=new LoginPage();
		homepage = loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
		inspectionpage=homepage.clickOnInspectionPage();
		
	}
	
	@Test
	public void none() {
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
		logge.info("Close The Inspection browser");
		
		
		
	}
}
