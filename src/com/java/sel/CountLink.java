package com.java.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	List<WebElement> x = driver.findElements(By.tagName("a"));
	
	
	System.out.println(x.size());
	
	for (WebElement x1 : x) {
		System.out.println(x1.getAttribute("href"));
	}
	
	
	
	
	
	
	
}
}
