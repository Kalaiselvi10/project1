package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class X_Path {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	//findelement----->get single web element---->webelement
	//findelements------->get multiple webelements---->List<webelement>
	
	WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	
	create.click();
	Thread.sleep(2000);
	
	WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
	first.sendKeys("john");
	Thread.sleep(2000);
	
WebElement last = driver.findElement(By.xpath("//input[@name='lastname']"));
	last.sendKeys("smith");
	
	WebElement mbl = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	 mbl.sendKeys("9876543210");
	
	WebElement pass = driver.findElement(By.xpath("//input[@data-type='password']"));
	pass.sendKeys("abc#20");
	
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByValue("10");
	Thread.sleep(2000);
	
	WebElement mon = driver.findElement(By.id("month"));
	Select s1=new Select(mon);
	s1.selectByValue("11");
	Thread.sleep(2000);
	
	WebElement year = driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByValue("1995");
	
	//driver.close();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
