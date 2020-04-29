package com.fleetain.Testcase;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.ComplaintPage;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.LoginPage;

public class ComplaintsPagesTest extends TestBase{
	public static final Logger logge=Logger.getLogger(ComplaintsPagesTest.class.getName());
	LoginPage loginPage;
	HomePage homepage;
	ComplaintPage complaintpage;

	public ComplaintsPagesTest() {
		super();
		logge.info("Initialize the Super Constructor");
	}
	
	
      @BeforeClass
      public void setUp() {
    	   browserOpen();
    	   loginPage=new LoginPage();
   		   homepage = loginPage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
   		   complaintpage=homepage.clickOnComplaint();
    	  
      }
      
      @Test(priority = 1)
  	public void verify_Complaint_Page_Title() {
  		
  		String Complaintpagetitle=complaintpage.validateComplaintPageTitle();
  		Assert.assertEquals(Complaintpagetitle, "Fleetain - Modern Maintenance software");
  		System.out.println(Complaintpagetitle);
  		logge.info("Verify Complaint page Title");
  		
  	}
      @Test(priority = 2)
      public void verify_Complaint_Page_Heading() {
    	  String complaintpageheading=complaintpage.validatePageHeading();
    	  Assert.assertEquals(complaintpageheading, "Complaint List");
    	  System.out.println("complaintpageheading");
    	  logge.info("verify Complaint Page Heading");
      }
	
	@Test(priority =3)
	public void verify_Search_Text_Box() {
		
		
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		//driver.close();
		logge.info("Close Browser");
	}
}
