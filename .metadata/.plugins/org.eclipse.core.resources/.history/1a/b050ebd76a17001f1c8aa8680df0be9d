package org.sin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPojo extends BaseClass{
	public SigninPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement creatacnt;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;
	
	@FindBy(name ="lastname")
	private WebElement lastname;
	
	@FindBy(name ="reg_email__")
	private WebElement regmail;
	
	@FindBy(name ="reg_passwd__")
	private WebElement regpasswrd;

	public WebElement getCreatacnt() {
		return creatacnt;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getRegmail() {
		return regmail;
	}

	public WebElement getRegpasswrd() {
		return regpasswrd;
	}


	
	
	

}
