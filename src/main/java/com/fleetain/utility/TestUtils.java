package com.fleetain.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.fleetain.TestBase.TestBase;

public class TestUtils extends TestBase {
//***********************************************Page Load Time Out And Implicitly Wait*****************************************
	public static long PAGE_LOAD_TIME_OUT = 50;
	public static long IMPLICIT_WAIT = 50;
	
//*****************************************Screen Shot Code**************************************************************
	public static void takeScreenShotAtEndOFTheTest() throws Exception {
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String currentDir="D:\\FleetainWorkSpace\\FleetainProduct\\screenshots\\";
		String currentDir=System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir+"/screenshot/"+timestamp()+".png"));
	}
	
	public static String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

//*****************************************Upload File Code**************************************************************
	
	public static void uploadFile(String docFile) throws AWTException, InterruptedException {
		ClipboardOwner owner=null;
		
		StringSelection strSel = new StringSelection(docFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, owner);
		
		//Create an object for robot class
		Robot robot = new Robot();
		//Control key in the keyboard
		//Ctrl+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	//*******************************************************************************************************
	
	
	
}
