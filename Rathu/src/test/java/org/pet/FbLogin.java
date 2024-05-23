package org.pet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.BaseClass;

public class FbLogin extends BaseClass {
	
	public FbLogin() {
		PageFactory.initElements(driver, this);
	}
		
		
		@FindBy(id="email")
		private WebElement email;
		


		@FindBy(xpath = "//input[@type='password']")
		private WebElement password;
		@FindBy(name="login")
		private WebElement logBtn;
		
		public WebElement getEmail() {
			return email;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLogBtn() {
			return logBtn;
		}
	}



 