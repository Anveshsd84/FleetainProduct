package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.AddVehiclePage;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.VehicleListPage;


public class VehicleListPageTest extends TestBase {
	public static final Logger logge=Logger.getLogger(VehicleListPageTest.class.getName());
	LoginPage loginPage;
	HomePage homepage;
	VehicleListPage vehicallistpage;
	AddVehiclePage addvehicalepage;

	public VehicleListPageTest() {
	
		super();
		logge.info("Initialize the Super Constructor");
	}
	@BeforeClass	
	public void setUp() throws InterruptedException{
		browserOpen();
		loginPage=new LoginPage();
   		   homepage = loginPage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
   		vehicallistpage=homepage.clickOnVehiclePage();
   		Thread.sleep(2000);
   			
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
