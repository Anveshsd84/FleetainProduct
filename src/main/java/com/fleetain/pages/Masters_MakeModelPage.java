package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class Masters_MakeModelPage extends TestBase {

	
	  @FindBy(id="add-model") 
	  WebElement addmakeModellink;
	 
	  @FindBy(name="MAKE_NAME")
	  WebElement makename;
		
	  @FindBy(name="MODEL_NAME")
	  WebElement modelName;
		
	  @FindBy(name="MINIMUM_LIMIT")
	  WebElement fuelLimite;
		
	  @FindBy(xpath = "//button[@class='btn btn-success mr5' and @type='submit']")
	  WebElement submitbtn;
		
	  @FindBy(xpath = "//button[@class='btn btn-danger' and @ type='button']")
	  WebElement cancelbtn;
	
	
	public Masters_MakeModelPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddMakeModel() {
		addmakeModellink.click();
	}
	
	public void enterMakeModelDetails(String makeModelName,String modelName,String fuelLimit ) {
		makename.sendKeys(makeModelName,modelName,fuelLimit);
		submitbtn.click();
	}
	
	
}
