package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	
	WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
	Actions a=new Actions(driver);   //syntax for actions class
	
	a.moveToElement(courses).perform();
	Thread.sleep(3000);
	
	WebElement aws = driver.findElement(By.xpath("//span[text()='AWS Training']"));
	
	a.click(aws).perform();
	
	driver.close();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
