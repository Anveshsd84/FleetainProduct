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

public class MastersPageTest extends TestBase {
	public static final Logger logge=Logger.getLogger(MastersPageTest.class.getName());
	LoginPage loginPage;
	HomePage homepage;
	MastersPage masterpage;
	
	public MastersPageTest() {
		
		super();
		logge.info("Call Super Constructor");
	}
	


	
	  @BeforeClass 
	  public void setUp(){ 
      browserOpen(); 
      loginPage=new LoginPage();
	  homepage =loginPage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
	  masterpage=homepage.clickOnMasterPage(); 
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
