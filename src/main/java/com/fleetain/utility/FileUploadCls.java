package com.fleetain.utility;
import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.fleetain.TestBase.TestBase;

public class FileUploadCls extends TestBase  {

	
	public void uploadFile() throws AWTException, InterruptedException  {
		ClipboardOwner owner=null;
		String docFile="C:\\Users\\Intel\\Downloads\\vehicale.jpg";
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
	
	
}
