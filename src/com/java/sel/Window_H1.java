package com.java.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_H1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	
	//URL : http://www.greenstechnologys.com/

	//	NOTE: Right Click contact us and select open in a new window and print Omr address.
	Thread.sleep(2000);
	WebElement contTab = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	
	Actions a=new Actions(driver);
	
	a.contextClick(contTab).perform();
	Thread.sleep(2000);
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
