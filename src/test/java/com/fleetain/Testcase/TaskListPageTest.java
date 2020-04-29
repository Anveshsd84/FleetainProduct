package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.TaskListPage;

public class TaskListPageTest  extends TestBase {
	public static final Logger logge=Logger.getLogger(TaskListPageTest.class.getName());
	LoginPage loginpage;
	HomePage homepage;
	TaskListPage taskpage;

	public TaskListPageTest() {
		super();
		logge.info("Initialize the Super Constructor");
	}
	
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		browserOpen();
		loginpage =new LoginPage();
		homepage=loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
		
		Thread.sleep(3000);
		
	}
	
	
	
	@Test(priority = 1)
	public void verify_Home_Page_Title() {
		
		String homepagetitle=taskpage.verifHomePageTitle();
		Assert.assertEquals(homepagetitle, "Fleetain - Modern Maintenance software");
		System.out.println(homepagetitle);
		logge.info("Verify Home Page Title");
		
	}
	
	@Test(priority = 2)
	public void verify_Login_user() {
		Assert.assertTrue(taskpage.verifiCorrectUserNameOn());
		logge.info("Verify Login User");
	}
	
	@AfterMethod 
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(15000); 
	 // driver.quit();
	  logge.info("Close Browser");
	  }
	
}
