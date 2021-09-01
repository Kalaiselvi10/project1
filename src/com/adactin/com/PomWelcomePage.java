package com.adactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomWelcomePage {

	static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement locat;
	@FindBy(id="hotels")
	private WebElement hotel;
    @FindBy(id="room_type")
	private WebElement roomtype;
    @FindBy(id="room_nos")
	private WebElement roomNos;
    @FindBy(id="datepick_in")
	private WebElement checkin ;
    @FindBy(id="datepick_out")
	private WebElement checkout ;
	@FindBy(id="adult_room")
	private WebElement adult ;
    @FindBy(id="child_room")
	private WebElement child ;
	@FindBy(id="Submit")
	private WebElement search ;
	public PomWelcomePage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocat() {
		return locat;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}


	
}
