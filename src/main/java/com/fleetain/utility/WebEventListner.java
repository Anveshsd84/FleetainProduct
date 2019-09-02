package com.fleetain.utility;
import java.io.IOException;

/*************************************** PURPOSE **********************************

- This class implements the WebDriverEventListener, which is included under events.
The purpose of implementing this interface is to override all the methods and define certain useful  Log statements 
which would be displayed/logged as the application under test is being run.

Do not call any of these methods, instead these methods will be invoked automatically
as an when the action done (click, findBy etc). 

*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.fleetain.TestBase.TestBase;

public class WebEventListner extends TestBase implements WebDriverEventListener {

	public void beforeNavigateTo(String URLL, WebDriver driver) {
		System.out.println("Before Navigation to :"+ URLL +":");
		
	}

	public void afterNavigateTo(String URLL, WebDriver driver) {
		System.out.println("Navigate to:'"+URLL+":");
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		
		
	}

	public void afterNavigateBack(WebDriver driver) {
		
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		
		
	}

	public void afterNavigateForward(WebDriver driver) {
		
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Trying To Find Element By :"+by.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Found Element By :"+by.toString());
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("Trying to click On"+element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Value of the:" + element.toString() + " before any changes made");
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Element Value Changed to:"+element.toString());
		
	}

	public void beforeScript(String script, WebDriver driver) {
		
		
	}

	public void afterScript(String script, WebDriver driver) {
		
		
	}

	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception Occured :"+error);
		
			try {
				TestUtils.takeScreenShotAtEndOFTheTest();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
		
	}

}
