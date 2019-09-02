package com.fleetain.Testcase;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fleetain.TestBase.TestBase;
import com.fleetain.pages.HomePage;
import com.fleetain.pages.Inspection_InspectionListPageDaily;
import com.fleetain.pages.InspectionsPage;
import com.fleetain.pages.LoginPage;
import com.fleetain.utility.ExcelSheetRead;

public class Inspection_InspectionListTestDaily extends TestBase {
	String excelpath="D:\\FleetainWorkSpace\\FleetainProduct\\src\\main\\java\\com\\fleetain\\TestData\\Vehicale Inspection.xlsx";
	String sheetname="Inspection_List";
	String sheetName_addPass="Add_Items_Pass_Add";
	String sheetName_Pass="Add_Item_Pass_Fail";
	String sheetNameOdometer="OdometerEntry";
	String readingEntry="Reading_Entry";
	String assignvehicle="Assign_Vehicle";
	public static final Logger logge=Logger.getLogger(Inspection_InspectionListTestDaily.class.getName());
     LoginPage loginpage;
	 HomePage homepage;
	 InspectionsPage inspectiopage;
	 Inspection_InspectionListPageDaily inspectionlist;
	
	public Inspection_InspectionListTestDaily() {
		super();
	}
	@BeforeClass
	public void setUp() {
		browserOpen();
		loginpage=new LoginPage();
		homepage = loginpage.login(prop.getProperty("Loginusername"),prop.getProperty("Loginpassword"));
		inspectiopage=homepage.clickOnInspectionPage();
		inspectionlist=inspectiopage.clickOnInspectionList();
		
	}
	
	/*
	 * @Test(priority = 1) public void clickOnAddInspection() {
	 * inspectionlist.clickONAddInspection(); }
	 */
	
	@DataProvider
	public Object[][] inspectionDataEnter() {
		
		Object dataSets[][]=ExcelSheetRead.getXlsxTestData(excelpath, sheetname);
		return dataSets;
	}
	
	@Test(priority = 1,dataProvider = "inspectionDataEnter")
	public void enter_Inspection_Data(String title, String description, String color) throws InterruptedException{
		
		inspectionlist.addInspection(title, description, color);
		
	}
	@Test(priority = 2)
	public void click_On_add_Item() {
		inspectionlist.addItems();
	}
	
	@DataProvider
        public Object[][] insertPassAddData() {
		
		Object dataSets[][]=ExcelSheetRead.getXlsxTestData(excelpath, sheetName_addPass);
		return dataSets;
	}
	@Test(priority= 3, dataProvider = "insertPassAddData")
	public void select_pass_Add_Items(String addTitle,String passlable, String addlabel,String unit,String shortdecription,String getinstructin1  ) throws InterruptedException{
		inspectionlist.clickOnPassAddItems(addTitle, passlable, addlabel, unit, shortdecription, getinstructin1);
		
		
	}
	
	    @DataProvider
        public Object[][] insertFailAddData() {
		
		Object dataSets[][]=ExcelSheetRead.getXlsxTestData(excelpath, sheetName_Pass);
		return dataSets;
	}
	@Test(priority=4,dataProvider = "insertFailAddData")
	public void click_On_Add_Item_And_Select_Pass_Fail(String failtitl,String faillLabl,String addfaillLabel, String shortfailDecript ) throws InterruptedException {
		
		inspectionlist.clickOnPassFailItem(failtitl, faillLabl, addfaillLabel, shortfailDecript);	
		
		
	}
	@DataProvider
    public Object[][] insertOdometerData() {
	
	Object dataSets[][]=ExcelSheetRead.getXlsxTestData(excelpath, sheetNameOdometer);
	return dataSets;
	}
	@Test(priority=5,dataProvider="insertOdometerData")
	public void click_on_Odometer_Entry(String Odometertitle,String odometerShortDes ) throws InterruptedException{
		inspectionlist.clickOnOdometerEntry(Odometertitle, odometerShortDes);
	}
	
	@DataProvider
    public Object[][] insertReadingEntry() {
	Object dataSets[][]=ExcelSheetRead.getXlsxTestData(excelpath, readingEntry);
	return dataSets;
	}
	@Test(priority=6,dataProvider="insertReadingEntry")
	public void click_On_Reading_Entry(String readingentrytitle,String readingShortDescript,String readingentyunit  ) throws InterruptedException{
		inspectionlist.clickOnReadingEntry(readingentrytitle, readingShortDescript, readingentyunit);
	}
	
	@Test(priority = 7,enabled=true)
	public void click_On_Save_Button() {
		inspectionlist.clickOnSaveButton();
		
	}
	
	@Test(priority =8,enabled=true)
     public void assign_Vehicle() throws InterruptedException {
		inspectionlist.assignVehicleDetails();
		
	}
	
	@Test(priority=9,enabled=true)
	public void assign_Person() {
		inspectionlist.assignPerson();
	}
	
	@Test(priority = 10,enabled=true)
	public void add_Work_Flow() throws InterruptedException {
		inspectionlist.addWorkFlow();
	}
	
	
	@Test(priority=11, enabled=true)
	public void acceptThePopUpAlert(){
		inspectionlist.alertHandle();
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		//driver.close();
	}
}
