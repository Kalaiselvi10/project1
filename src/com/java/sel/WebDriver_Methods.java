package com.java.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver_Methods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//get-------->open the URL
	driver.get("https://www.google.com/search?q=flipkart.india&oq=flipkart.&aqs=chrome.1.69i57j0l6j5.12563j0j9&sourceid=chrome&ie=UTF-8");
	//getTitle------>return title of the current page
	String title = driver.getTitle();
	System.out.println(title);
	//getCurrentUrl---------->return the current url
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	//getPagesource------->return current page source(backend code)
//String pageSource = driver.getPageSource();
//System.out.println(pageSource);
	//close()---->close the current tab
	//driver.close();	
	//driver.quit();  ---->close the browser
	//to--->navigate to next url
	driver.navigate().to("https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY");
	//back---->back to previous page
	driver.navigate().back();
	//forward---->forward to the nextpage
	driver.navigate().forward();
	//refresh-->it refresh current page
	driver.navigate().refresh();
	driver.manage().window().maximize();  //to maximize the window
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
