package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass {
	public SignInPojo() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	
	private WebElement createnewacnt;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement Lastname;
	
	@FindBy(name="reg_email__")
	private WebElement mobileoremail;
	
	@FindBy(name="reg_passwd__")
	private WebElement password;

	public WebElement getCreatenewacnt() {
		return createnewacnt;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getMobileoremail() {
		return mobileoremail;
	}

	public WebElement getPassword() {
		return password;
	}
}
	
	
