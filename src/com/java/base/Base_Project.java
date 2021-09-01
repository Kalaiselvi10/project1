package com.java.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base_Project extends BaseClass{

	public static void main(String[] args) {
		
		browserConfig("chrome");
		
	getURL("http://automationpractice.com/index.php");	
		
	driver.manage().window().maximize();
	impWait(10);	
		
	driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();	
		
	driver.findElement(By.id("email")).sendKeys("kalai95@gmail.com");	
		
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("john@10");
	driver.findElement(By.id("SubmitLogin")).click();
	WebElement dressTab = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));	
		
		action(dressTab, "move");
		
		driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]")).click();	
		
		WebElement img = driver.findElement(By.xpath("(//img[@width='250'])[1]"));	
		
		action(img, "move");
		driver.findElement(By.xpath("(//span[text()='Quick view'])[1]")).click();	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
