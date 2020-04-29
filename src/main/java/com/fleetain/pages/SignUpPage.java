package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class SignUpPage extends TestBase {
	
	
	//All Object Repository
	
	@FindBy(linkText = "Sign Up")
	WebElement signupbutn;
	
	@FindBy(name="EMAIL")
	WebElement emailID;
	
	@FindBy(name="PASSWORD")
	WebElement password;
	
	@FindBy(name="CPASSWORD")
	WebElement conPassWord;
	
	@FindBy(name="accept_terms")
	WebElement acceptTerm;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement submitbtn;
	
	@FindBy(xpath = "//input[@id='EMAIL']//following::p[1]")
	WebElement errorMsg;
	
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignUpPage() {
		signupbutn.click();
	}
	public void enterInvalidCreadential(String user, String passwd, String conPasss) {
		
		emailID.sendKeys(user);
		password.sendKeys(passwd);
		conPassWord.sendKeys(conPasss);
		acceptTerm.click();
		submitbtn.submit();
		
	}
       public String validateErrorMassageSign() {
		
		return errorMsg.getText();
	}
	
	public void validCreadential(String user, String passwd,String conPasss ) {
		emailID.clear();
		emailID.sendKeys(user);
		password.clear();
		password.sendKeys(passwd);
		conPassWord.clear();
		conPassWord.sendKeys(conPasss);
		acceptTerm.click();
		submitbtn.submit();
		
	}
	
	
	
	
	
	
	
}

