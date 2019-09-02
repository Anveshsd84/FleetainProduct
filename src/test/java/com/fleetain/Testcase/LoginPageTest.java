package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.SignUpPage;



public class LoginPageTest extends TestBase{
	
	public static final Logger logge=Logger.getLogger(LoginPage.class.getName());
	LoginPage logpage;
    HomePage homepage;
    SignUpPage signpage;
	
	public LoginPageTest(){
		super();
		logge.info("Initialize the Super Constructor");
	}
 //    @BeforeTest
//	@BeforeMethod
    @BeforeClass	
	public void setUp(){
		browserOpen();
		logpage=new LoginPage();
	}

	/*
	 * @Test(priority = 1) public void open_SignUp_Page() {
	 * signpage=logpage.clickOnSignUp(); }
	 */
    
	@Test(priority=1)
	public void login_Page_Title_Verify(){
	    
		
		String str=logpage.validateLoginPageTitle();
		System.out.println("Expected Result=> "+str);
		Assert.assertEquals(str, "Fleetain - Modern Maintenance software");
		System.out.println("Actual Result=> Fleetain - Modern Maintenance software");
		logg.info("Verify Login Page Title");
	}
	
	@Test(priority=2)
	public void invalid_Login_Verify() {
		
		logpage.invalidlogin(prop.getProperty("invalidUsername"),prop.getProperty("invalidPassword"));
		logg.info("Enter the Invalid Login");
	}
	
	@Test(priority=3, enabled=false)
	public void login_ErrorMsg_Varify() {
		
		String errmsg=logpage.validateErrorMassage();
		System.out.println("Excepted Result "+errmsg);
		Assert.assertEquals(errmsg, "Invalid email and password! Please try again.");
		System.out.println("Actual Result  => Invalid email and password! Please try again.");
		logg.info("login Error Message Verify");
	}
	
	@Test(priority=4)
	public void Login_Suceefully_Verify(){
		logg.info("Login Succefully And Showing Home Page");
		homepage = logpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
	}
	

	//@AfterMethod
	@AfterClass
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(15000); 
	 // driver.quit(); 
	  logge.info("Close Browser");
	  }


	 
	
}






