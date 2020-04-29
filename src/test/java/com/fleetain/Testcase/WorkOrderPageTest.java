package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;

public class WorkOrderPageTest extends TestBase {

	public static final Logger logge=Logger.getLogger(WorkOrderPageTest.class.getName());
	LoginPage logninpage;
	HomePage homepage;
	
	
	public WorkOrderPageTest() {
		super();
		
		
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		browserOpen();
		logninpage =new LoginPage();
		homepage=logninpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
		
	}
	
	
	@Test
	public void none() {
		
	}
	 @AfterMethod 
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(15000); 
	 // driver.quit(); 
	  }
}
