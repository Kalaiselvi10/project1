package com.facebook.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFb {

public static WebDriver driver;

public LoginPageFb(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

@FindBy(id="email")
private WebElement user;

@FindBy(name="pass")
	private WebElement passwrd;
	
@FindBy(xpath="//button[@type='submit']")	
	private WebElement loginbtn;



public WebElement getUser() {
	return user;
}

public WebElement getPasswrd() {
	return passwrd;
}

public WebElement getLoginbtn() {
	return loginbtn;
}
	
	





	
	
	
	
	
}
