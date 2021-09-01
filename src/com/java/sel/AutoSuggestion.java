package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	
	
	
	
	
	
}
}
