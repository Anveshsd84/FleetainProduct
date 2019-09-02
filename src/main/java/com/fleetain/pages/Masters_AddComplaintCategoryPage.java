package com.fleetain.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetain.TestBase.TestBase;

public class Masters_AddComplaintCategoryPage extends TestBase {

	
	  @FindBy(id="category_name")
	  WebElement comcategoryname;
	  
	  @FindBy(id="submit")
	  WebElement clickOnCategory;
	  
	  @FindBy(xpath="//h4[contains(text(),'Inserted Successfully')]")
	  WebElement succesMessage;
	 
	
	public Masters_AddComplaintCategoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void addComplaintCategory(String addComplaint ) {
		
		comcategoryname.sendKeys(addComplaint);
		clickOnCategory.click();
	}
	public String successMessage() {
		return succesMessage.getText();
	}
	
	
}
