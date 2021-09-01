package com.adactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomIteneraryPage {

	public PomIteneraryPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	
	private WebElement radio;

	public WebElement getRadio() {
		return radio;
	}
	
	@FindBy(id="continue")
	private WebElement proceed;

	public WebElement getProceed() {
		return proceed;
	}
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private  WebElement ccnum;
	
	@FindBy(id="cc_type")
	private  WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private  WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private  WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private  WebElement cvv;
	
	@FindBy(name="book_now")
	private  WebElement booknow;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(id="hotel_name_dis")
	private WebElement view;

	public WebElement getView() {
		return view;
	}

	
	}
	

