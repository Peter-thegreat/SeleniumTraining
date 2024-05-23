package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@type='password']")

	private WebElement password;

	@FindBy(name = "login")
	private WebElement logbtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

}
