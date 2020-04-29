package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	// All Object Repository
	
	
	// Web Element of User Name
	@FindBy(name="EMAIL")
	WebElement username;
	
	//Web Element Of Password
	@FindBy(name="PASSWORD")
	WebElement password;
	
	// Web Element of Check Box
	@FindBy(id = "checkbox-signup")
    WebElement cleckCheckbox; 
    
	//Web Element of Login Button
	@FindBy(xpath = "//button[@class='btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light add_data_login']")
	WebElement logInBtn;
	
	// WebElement Of Error Massage
	
	@FindBy(xpath = "//div[@id='mymodal_login_error']")
	WebElement errormassage;
	
	
	
	//********This initElements method will create all WebElements***********
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * public SignUpPage clickOnSignUp() { signupbutn.click(); return new
	 * SignUpPage(); }
	 */
	 
	
	public String validateLoginPageTitle(){            // Validate the Login Page Title
		return driver.getTitle();
	}
	
	public void invalidlogin(String user, String passwd) {         // Enter Invalid Login Credential
		
		username.sendKeys(user);   
		password.sendKeys(passwd);
		logInBtn.click();
	
	}
	public String validateErrorMassage() {              // validate Error Message
		
		return errormassage.getText();
		
		
	}
	public HomePage login(String usr,String psw){                   // Valid Login Credential 
		username.clear();
		username.sendKeys(usr);
		password.clear();
		password.sendKeys(psw);
		cleckCheckbox.click();
		logInBtn.click();
		return new HomePage();                                    // Login Succefully
}
	
}
