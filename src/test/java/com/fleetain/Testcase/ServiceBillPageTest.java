package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;

public class ServiceBillPageTest extends TestBase{
	public static final Logger logge=Logger.getLogger(ServiceBillPageTest.class.getName());
  LoginPage loginpage;
  HomePage hopmepage;
	
	public ServiceBillPageTest() {	
	super();
	logge.info("Initialize the Super Constructor");
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		browserOpen();
		loginpage =new LoginPage();
		hopmepage=loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
		
		Thread.sleep(3000);
		
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
