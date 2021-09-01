package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/frames");
	
	driver.manage().window().maximize();
	
	 int size = driver.findElements(By.tagName("iframe")).size();
	
System.out.println(size);
	
	driver.switchTo().frame(1);  //switch from main page to frame--using index
	
	WebElement first = driver.findElement(By.id("sampleHeading"));
	String text = first.getText();
	System.out.println(text);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
