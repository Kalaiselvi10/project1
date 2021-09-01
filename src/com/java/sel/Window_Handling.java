package com.java.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
public static void main(String[] args) throws AWTException, Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//*************mobile
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	Actions a=new Actions(driver);
	
	a.contextClick(mobile).perform();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//**************electronics
	WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	a.contextClick(electronics).perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//************computers
WebElement computer = driver.findElement(By.xpath("//a[text()='Computers']"));
	a.contextClick(computer).perform();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//getWindowHandle()--->get current window id
	
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	//getWindowHandles()---->get all active windows id
	Set<String> windowHandles = driver.getWindowHandles();
	
	for (String str : windowHandles) {
	String title = driver.switchTo().window(str).getTitle();
	System.out.println(title);
	}
	
	String elec="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
	for (String str : windowHandles) {
		if(driver.switchTo().window(str).getTitle().equals(elec));
		System.out.println("Done......");
		break;
	}
			
			
			
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
