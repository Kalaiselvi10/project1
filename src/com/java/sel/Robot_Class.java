package com.java.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Class {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement mobile = driver.findElement(By.id("//a[text()='Mobiles']"));
	
	Actions act=new Actions(driver);
	act.contextClick(mobile).perform();
	
	Robot rob=new Robot();
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	
	
	
	
	
	
	
}
}
