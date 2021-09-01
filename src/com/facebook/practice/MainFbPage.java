package com.facebook.practice;

import org.openqa.selenium.WebDriver;

import com.java.base.BaseClass;

public class MainFbPage extends BaseClass {
	
	public static WebDriver driver;
		public static void main(String[] args) {
			
			
    driver=browserConfig("chrome");
		
		getURL("https://en-gb.facebook.com/");
		
		LoginPageFb lp=new LoginPageFb(driver);
		
		passValues(lp.getUser(), "kalai123@gmail.com");
		
		passValues(lp.getPasswrd(), "kalai2021");
		
		clickOnElement(lp.getLoginbtn());
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

