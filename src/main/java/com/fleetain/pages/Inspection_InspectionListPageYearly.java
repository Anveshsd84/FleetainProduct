package com.fleetain.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fleetain.TestBase.TestBase;

public class Inspection_InspectionListPageYearly extends TestBase {
	//*******************************************NEW INSPECTION FORM*************************************
			@FindBy(xpath="//a[contains(text(),'+ Add Inspection  ')]")  WebElement clickOnAddInspection; 
			@FindBy(name="INSPECTION_FORM_NAME")  WebElement inspectionTitle;
			@FindBy(name="INSPECTION_DESCRIPTION")  WebElement inspctionDecription;
			@FindBy(name="IS_TEMPLATE")   WebElement saveTemplents;
			@FindBy(name="INSPECTION_TEMPLATE") WebElement alreadysavetemplates;
			@FindBy(xpath="//button[@type='submit' and @class='btn btn-info waves-effect']") WebElement clickOnSubmitButton;
		//*******************************************ADD ITEMS**************************************************
		//*******************************************PASS/ADD ITEMS**************************************************	
			@FindBy(xpath ="//button[@class='btn btn-info dropdown-toggle' and @type='button']") WebElement addItems;
			@FindBy(xpath="//li/a[contains(text(),'Pass Add/Item')]") WebElement selectpassAddItem;
			@FindBy(name="ITEM_NAME[]") WebElement addpassitemTitle;
			@FindBy(name="PASS_LABEL[]") WebElement passAddLabel;
			@FindBy(name="ADD_LABEL[]") WebElement  passAddINAddLabel;
			@FindBy(name="UNIT[]") WebElement passAddUnit;
			@FindBy(name="SHORT_DESCRIPTION[]") WebElement passAddInshortDesc;
			@FindBy(name="INSTRUCTION[]") WebElement passAddinstruction;
			@FindBy(xpath="//input[@class='form-control' and @name='PHOTO[]' ]") WebElement passAddPhoto; 
			@FindBy(name="VIDEO[]") WebElement passAddVideo;
		//***************************PASS/FAIL ITEMS**********************************************	
			@FindBy(xpath = "//li/a[contains(text(),'Pass fail/Item')]") WebElement clickOnPassFailItems;
			@FindBy(xpath="//input[@value='PASS/FAIL']/preceding::input[1]") WebElement enterPassFailItemTitle;
			@FindBy(xpath="//input[@value='PASS/FAIL']/following::input[1]") WebElement passFailINPassLabel;
			@FindBy(xpath="//input[@value='PASS/FAIL']/following::input[2]") WebElement passFailINFailLabel;
			@FindBy(xpath="//input[@value='PASS/FAIL']/following::input[3]") WebElement passFailINRequired;	
			@FindBy(xpath="//input[@value='PASS/FAIL']/following::input[4]") WebElement passFailINShortDescription;
			@FindBy(xpath="//input[@value='PASS/FAIL']/following::input[5]") WebElement passFailINAddPhoto;
		//******************************ODOMETER Entry***********************************************
			@FindBy(xpath="//li/a[contains(text(),'Odometer Entry')]") WebElement selectodometerEntry;
			@FindBy(xpath="//input[@value='ODOMETER ENTRY']/preceding::input[1]") WebElement titleMeterEntry;
			@FindBy(xpath="//input[@value='ODOMETER ENTRY']/following::input[1]") WebElement odometerShortDescription;
			@FindBy(xpath="//input[@value='ODOMETER ENTRY']/following::input[2]") WebElement odometerRequried;
			@FindBy(xpath="//input[@value='ODOMETER ENTRY']/following::input[3]") WebElement odometerUplodImage;
			@FindBy(xpath="//input[@value='ODOMETER ENTRY']/following::input[4]") WebElement odometerUplodVideo;	
		//**********************************Reading entry**************************************	
			@FindBy(xpath="//li/a[contains(text(),'Reading Entry')]") WebElement selectReadingEntry;
			@FindBy(xpath="//input[@value='METER ENTRY']/preceding::input[1]") WebElement readingEntryTitle;
			@FindBy(xpath="//input[@value='METER ENTRY']/following::input[1]") WebElement readingEntryShortDescription;;
			@FindBy(xpath="//input[@value='METER ENTRY']/following::input[2]") WebElement readingEntryUnit;
			@FindBy(xpath="//input[@value='METER ENTRY']/following::input[3]") WebElement readingEntryRequired;
			@FindBy(xpath="//input[@value='METER ENTRY']/following::input[4]") WebElement readingEntryUplodImage;
			@FindBy(xpath="//input[@value='METER ENTRY']/following::input[5]") WebElement readingEntryUplodVideo;	
		//*******************************************SAVE Button**********************************************
			@FindBy(xpath = "//button[@type='submit' and @value='submit']") WebElement savebutton;
			
		//*******************************************Assign Vehicle******************************************
			@FindBy(xpath="//select[@class='form-control vehicle_select' and @name='VEHICLE_SELECTED']") WebElement selectVehicle;
			@FindBy(xpath="//select[@name='FREQUENCY']") WebElement selctFrequency;
			@FindBy(name="EVERY") WebElement frequncyShedule;
			@FindBy(name="VEHICLE_TYPE_GROUP")WebElement selectVehicleGrup;
			@FindBy(id="s2id_autogen2") WebElement chooseVehicle;
			@FindBy(xpath = "//input[@type='radio' and @value='day_of_month']") WebElement selctDayOfMonth;
			@FindBy(xpath = "//input[@type='radio' and @value='day_of_week']") WebElement selectdayOfWeek;
			@FindBy(xpath="//input[@id='day11']") WebElement selectDate;
			
			@FindBy(xpath = "//button[@type='submit' and @value='submit']") WebElement clickonsubmit;
		//*******************************************ASSIGN PERSON******************************************
			@FindBy(id="s2id_autogen1") WebElement selectPerson;
			@FindBy(xpath = "//div[@class='fs-label'and text()='Select some options']") WebElement selectVehicleForPersonAssig ;
			@FindBy(xpath="//a[contains(text(),'  Assign Person ')]") WebElement clickOnAssignPerson;
			@FindBy(xpath="//input[@type='search'and @placeholder='Search']") WebElement selectVehicleForassignPerson;
			@FindBy(xpath="//button[@type='submit' and @value='submit']") WebElement clickSubmit;
			@FindBy(id="s2id_autogen2_search") WebElement sendPersonNumber;
			
		//*******************************************ADD WORK FLOW******************************************	
			@FindBy(xpath="//button[@class='btn btn-info dropdown-toggle btn-sm' and @type='button']")WebElement clickOnAddWorkflow;
			@FindBy(name="WORKFLOW_NAME") WebElement  enterWorkFlowName;
			@FindBy(name="WORKFLOW_TRIGER") WebElement selectTrigger;
			@FindBy(id="Item_demo") WebElement selectItemDemo;
			@FindBy(xpath = "//div[@id='action_demo']/preceding::select[1]")WebElement addActionElement;
			@FindBy(xpath="//div[@id='Notification_demo']/preceding::select[1]") WebElement notificationUser;
			@FindBy(xpath="//div[@id='Users_demo']/preceding::select[1]") WebElement emailUser;
			@FindBy(xpath="//button[@type='submit' and @value='Save']") WebElement saveButton; 
			@FindBy(xpath = "//input[@type='checkbox' and @class='email']") WebElement clickSendEmail;
			@FindBy(xpath = "//input[@type='checkbox' and @class='notification']") WebElement sendNotification;
			@FindBy(xpath="//input[@type='checkbox' and @name='EMAIL_USER[]' and @value='466']") WebElement emailUserMayur;
			@FindBy(xpath="//input[@type='checkbox' and @name='EMAIL_USER[]' and @value='464']") WebElement emailUserKailas;
			@FindBy(xpath = "//input[@type='checkbox' and @name='NOTIFICATION_USER[]' and @value='466']")WebElement notificationMayur;
//			@FindBy(xpath = "//input[@type='checkbox' and @name='NOTIFICATION_USER[]' and @value='465']")WebElement notificationanwesh;
			@FindBy(xpath = "//input[@type='checkbox' and @name='NOTIFICATION_USER[]' and @value='464']")WebElement notificatioKailas;
			@FindBy(xpath="//select[@class='form-control collapsed']") WebElement getItems;
			@FindBy(xpath = "//input[@type='checkbox' and @value='712' ]") WebElement bus;
			
			
		//******************************************DashBoard***********************************************************	
			@FindBy(id="blackk")WebElement clickOnInspectionLeaderboard;
			
			public Inspection_InspectionListPageYearly() {
				PageFactory.initElements(driver, this);
			}
			public void clickONAddInspection() {		
				
			}
			
			public void addInspection(String etitle, String eDescription, String colortext) throws InterruptedException {
				clickOnAddInspection.click();
				Thread.sleep(1000);
				inspectionTitle.sendKeys(etitle);	
					
				inspctionDecription.sendKeys(eDescription);
				driver.findElement(By.xpath("//input[@name='INSPECTION_COLOR' and @value='"+colortext+"']")).click();
				//alradysavetemplates.click();
				clickOnSubmitButton.click();	
				
			}
			public void addItems() {
				JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", addItems);
		    	js.executeScript("arguments[0].click();", selectpassAddItem );
				
			}
			public void clickOnPassAddItems(String addtitle,String passLable,String addLabel,String addunit, String shortDecription,String getInstructin ) throws InterruptedException  {
				addpassitemTitle.sendKeys(addtitle);
				passAddLabel.sendKeys(passLable);
				passAddINAddLabel.sendKeys(addLabel);
				passAddUnit.sendKeys(addunit);
				passAddInshortDesc.sendKeys(shortDecription);
				passAddinstruction.sendKeys(getInstructin);
//				passAddPhoto.click();
//				uploadFile("C:\\Users\\Intel\\Downloads\\cleanveh.jpg");
				Thread.sleep(2000);
			}

			public void clickOnPassFailItem(String failPasstitle,String passsLable, String failLabel,String shortfailDecription) throws InterruptedException {
				JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", addItems);
		    	js.executeScript("arguments[0].click();", clickOnPassFailItems );
		    	enterPassFailItemTitle.sendKeys(failPasstitle);
		    	passFailINPassLabel.sendKeys(passsLable);
		    	passFailINFailLabel.sendKeys(failLabel);
		    	passFailINRequired.click();
		    	passFailINShortDescription.sendKeys(shortfailDecription);
//		    	passFailINAddPhoto.click();
//		   	uploadFile("C:\\Users\\Intel\\Downloads\\cleanveh.jpg");
		    	Thread.sleep(2000);
			}
			
			public void clickOnOdometerEntry(String odometertitle,String odometerShortDesc) throws InterruptedException{
				JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", addItems);
		    	js.executeScript("arguments[0].click();", selectodometerEntry );
		    	titleMeterEntry.sendKeys(odometertitle);
		    	odometerShortDescription.sendKeys(odometerShortDesc);
		    	odometerRequried.click();
//		    	odometerUplodImage.click();
//		    	uploadFile("C:\\Users\\Intel\\Downloads\\cleanveh.jpg");
//		    	odometerUplodVideo.click();
//		    	uploadFile("C:\\Users\\Intel\\Downloads\\cleanveh.jpg");
		    	Thread.sleep(2000);
			}
			
			public void clickOnReadingEntry(String readingtitle,String readingShortDescription,String readingEntyUnit) throws InterruptedException{
				JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", addItems);
		    	js.executeScript("arguments[0].click();", selectReadingEntry );
		    	readingEntryTitle.sendKeys(readingtitle);
		    	readingEntryShortDescription.sendKeys(readingShortDescription);
		    	readingEntryUnit.sendKeys(readingEntyUnit);
		    	readingEntryRequired.click();
//		    	readingEntryUplodImage.click();
//		    	uploadFile("C:\\Users\\Intel\\Downloads\\cleanveh.jpg");
		    	Thread.sleep(2000);
		    	
			}
			public void clickOnSaveButton() {
				
				savebutton.click();
			}
			
			public void assignVehicleDetails() throws InterruptedException {
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", selectVehicle);
				//selectVehicle.click();
				Select selvechicle=new Select(selectVehicle);
				selvechicle.selectByValue("Some Vehicles");
				selectVehicleGrup.click();
				Select selectGrup=new Select(selectVehicleGrup);
				selectGrup.selectByValue(prop.getProperty("selectVehicleGroup"));
				chooseVehicle.click();
				chooseVehicle.sendKeys(Keys.ENTER);
				chooseVehicle.sendKeys(Keys.ENTER);
				chooseVehicle.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				selctFrequency.click();
				Select freq=new Select(selctFrequency);
				freq.selectByValue(prop.getProperty("selectTheFrequency"));
				frequncyShedule.sendKeys(prop.getProperty("frequencySelect"));
				selctDayOfMonth.click();
				Thread.sleep(2000);
				selectDate.click();
				
				Thread.sleep(2000);
				
				
				clickonsubmit.click();
				
			}
			
			
			public void assignPerson() {
				//clickOnAssignPerson.click();
				//selectVehicleforpersonAssig.click();
				JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", selectVehicleForPersonAssig);
		    	selectVehicleForassignPerson.sendKeys("MH49SD8585");
		    	selectVehicleForassignPerson.sendKeys(Keys.ARROW_DOWN);
		    	selectVehicleForassignPerson.sendKeys(Keys.ENTER);
				selectPerson.click();
				sendPersonNumber.sendKeys("ANVESH");
				sendPersonNumber.sendKeys(Keys.ARROW_DOWN);
				sendPersonNumber.sendKeys(Keys.ENTER);
				clickSubmit.submit();
				
			}
			public void addWorkFlow() throws InterruptedException {
				Thread.sleep(2000);
				clickOnAddWorkflow.click();
				enterWorkFlowName.sendKeys("Mayur");
				selectTrigger.click();
				Select seltrigger=new Select(selectTrigger);
				seltrigger.selectByValue("Whenever one or more item fail");
				addActionElement.click();
				Actions action=new Actions(driver);
				action.moveToElement(clickSendEmail).click().perform();
				action.moveToElement(sendNotification).click().perform();
				emailUser.click();
				//action.moveToElement(getItems).click().perform();
				//emailUser.click();
				action.moveToElement(emailUserKailas).click().perform();
				action.moveToElement(notificationMayur).click().perform();
				notificationUser.click();
				action.moveToElement(notificatioKailas).click().perform();
				action.moveToElement(notificationMayur).click().perform();
				saveButton.click();
				
			}
			public void alertHandle() {
				driver.switchTo().alert().accept();
			}
			
			public static void setClipboardData(String string) {
				//StringSelection is a class that can be used for copy and paste operations.
				   StringSelection stringSelection = new StringSelection(string);
				   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
				}
			
			public static void uploadFile(String fileLocation) {
		        try {
		        	//Setting clipboard with file location
		            setClipboardData(fileLocation);
		            //native key strokes for CTRL, V and ENTER keys
		            Robot robot = new Robot();
			
		            robot.keyPress(KeyEvent.VK_CONTROL);
		            robot.keyPress(KeyEvent.VK_V);
		           // robot.keyRelease(KeyEvent.VK_V);
		           // robot.keyRelease(KeyEvent.VK_CONTROL);
		            robot.keyPress(KeyEvent.VK_ENTER);
		            robot.keyRelease(KeyEvent.VK_ENTER);
		        } catch (Exception exp) {
		        	exp.printStackTrace();
		        }
			
			}
}
