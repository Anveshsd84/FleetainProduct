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
import com.fleetain.pages.ComplaintPage;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.InspectionsPage;
import com.fleetain.pages.InventoryPage;
import com.fleetain.pages.LoginPage;
import com.fleetain.pages.MastersPage;
import com.fleetain.pages.ServiceBillPage;
import com.fleetain.pages.TaskListPage;
import com.fleetain.pages.VehicleListPage;

import com.fleetain.pages.WorkOrderPage;


public class HomePageTest extends TestBase {
	public static final Logger logge=Logger.getLogger(HomePageTest.class.getName());
	HomePage homepage;
	LoginPage loginPage;
	MastersPage masterpage;
	VehicleListPage vehiclePage;
	InventoryPage inventory;
	InspectionsPage inspection;
	ComplaintPage complaintpage;
	TaskListPage tasklistpage;
	WorkOrderPage workorderpage;
	ServiceBillPage servicebill;
	
	
	public  HomePageTest() {
		
		super();
		logge.info("Initialize the Home Page Super Constructor");
	}
	

	@BeforeClass
       public void setUp(){
		browserOpen();
		loginPage=new LoginPage();
		homepage = loginPage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
	}
	
	
	@Test(priority = 1)
	public void verify_Home_Page_Title() {
		
		String homepagetitle=homepage.verifHomePageTitle();
		Assert.assertEquals(homepagetitle, "Fleetain - Modern Maintenance software");
		System.out.println(homepagetitle);
		logge.info("Verify the Home page Title");
		
	}
	
	@Test(priority = 2)
	public void verify_Login_user() {
		Assert.assertTrue(homepage.verifiCorrectUserName());
		logge.info("Verify Correct Login User");
		
	}
	/*
	 * @Test(priority = 3) public void verify_Masters_link() {
	 * 
	 * masterpage=homepage.clickOnMasterPage();
	 * logge.info("Click On Masters Page ");
	 * }
	 */
	
	/*
	 * @Test(priority= 4) public void click_On_Add_Parts_Category() {
	 * 
	 * logge.info("Click On Add parts Category");
	 * }
	 */

	/*
	 * @Test(priority = 4)
	 *public void verify_Vehicle_link() {
	 * 
	 * vehiclePage=homepage.clickOnVehiclePage();
	 * logge.info("Click on Vehicle Page");
	 * }
	 * 
	 */
	/*
	 * @Test(priority = 5) public void verify_Inventory_link() {
	 * 
	 * inventory=homepage.clickOnInventory();
	 * logge.info("click on Inventory Page");
	 * }
	 */
	
	  @Test(priority = 6) 
	  public void verify_Inspection_link() {
	  
	  inspection=homepage.clickOnInspectionPage();
	  logge.info("click On Inspection page"); }
	 
	
	  @Test(priority = 7) 
	  public void verify_Complaints_link() {
	  
	  complaintpage=homepage.clickOnComplaint();
	  logge.info("click on Complaint Page And verify Complaint page link");
	  }
	 
	/*
	 * @Test(priority= 8) public void verify_TaskList_link() {
	 * 
	 * tasklistpage=homepage.clickOnTaskList();
	 *   logge.info("click on Task List And Task List Page link");
	 * }
	 */
	/*
	 * @Test(priority= 9) public void verify_WorkOrder_link() {
	 * 
	 * workorderpage=homepage.clickOnWorkOrder();
	 * logge.info("click on WorkOrder Page and Check the Link Of WorkOrder ");
	 * 
	 * }
	 */
	/*
	 * @Test(priority= 10) public void verify_ServiceBill_link() {
	 * servicebill=homepage.clickOnServiceBill();
	 * logge.info("click on Service Bill and Check the Service Bill Page Link");
	 * 
	 * }
	 */
	@AfterClass
	public void tearDown() throws InterruptedException{ 
		Thread.sleep(2000);
		//driver.close();
		logge.info("Close Browser");
		}	
	

	 
 	
}
