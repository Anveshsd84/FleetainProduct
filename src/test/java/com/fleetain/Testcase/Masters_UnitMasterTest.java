package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.MastersPage;



public class Masters_UnitMasterTest extends TestBase{
       
	public static final Logger logge=Logger.getLogger(Masters_UnitMasterTest.class.getName());
	LoginPage loginpage;
	HomePage homepage;
	MastersPage masterpage;
	Masters_UnitMasterTest unitmaster;
	
	
	public Masters_UnitMasterTest() {
		super();
		logge.info("Initialize the Super Constructor");
		
	}
	
	@BeforeClass
	public void Setup() throws InterruptedException {
		browserOpen();
		loginpage=new LoginPage();
   	    homepage = loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
   	    masterpage=homepage.clickOnMasterPage();
   	    Thread.sleep(2000);
   	    unitmaster=masterpage.clickOnUnitMaster();
		
	}
	
	@Test
	public void none() {
		
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		logge.info("Close Browser");
		
		
	}
}
