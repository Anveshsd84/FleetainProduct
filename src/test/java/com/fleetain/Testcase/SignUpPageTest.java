package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;


import com.fleetain.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	public static final Logger logge=Logger.getLogger(SignUpPageTest.class.getName());
	SignUpPage signpag;
	//LoginPage logpage;
	
	public SignUpPageTest() {
		super();
		logge.info("Call Supar Constructor");
	}
	@BeforeTest
	//@BeforeMethod
	public void setUp(){
		browserOpen();
		//logpage=new LoginPage();
		signpag=new SignUpPage();
		//signpag=logpage.clickOnSignUp();
	}
	
	
	  @Test(priority = 1)
	  public void clickOnSignUpButton() {
		  signpag.clickOnSignUpPage();
		  logge.info("First click on SignUp Button and Open SignUp page");
	  }
	 
	
	@Test(priority=2)
	public void invalidSignUpCreadentialEnter() {
		signpag.enterInvalidCreadential(prop.getProperty("invalidUsername"),prop.getProperty("invalidPassword"), prop.getProperty("invalidConfPass"));
		logge.info("Enter the Invalide Creadential ");
	}
	
	
	@Test(priority = 3)
	public void errorMsageVerify() {
		String errmsg=signpag.validateErrorMassageSign();
		System.out.println("Excepted Result "+errmsg);
		Assert.assertEquals(errmsg, "The email field must contain a valid email address.");
		System.out.println("Actual Result  => The email field must contain a valid email address.");
		logge.info("Verify Error Message After Entering Invalid Creadential");
	}

	@Test(priority = 4)
	public void validSignUpCreadentialEnter() {
		
		signpag.validCreadential(prop.getProperty("validUsernameSigUp"), prop.getProperty("validPasswordSigUp"), prop.getProperty("convalidPasswordSigUp"));
		logge.info("Enter Valid Username,Password,Conform Password");
	}
	
	
	  @AfterMethod 
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(15000); 
	 // driver.quit();
	  logge.info("Close Browser");
	  }
	 
}
