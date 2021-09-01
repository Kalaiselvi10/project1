package com.adactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomBookingConfirmpage {

	static WebDriver driver;
	

	public PomBookingConfirmpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[1]")
	private WebElement scroll;
	
	public WebElement getScroll() {
	return scroll;
}
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(xpath="//a[text()='Click here to login again']")
	private WebElement home;

	public WebElement getHome() {
		return home;
	}
	
}
