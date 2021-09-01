package com.java.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginPage extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//get text

		WebElement text = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		
		getContent(text);
		//sendkeys
	WebElement user = driver.findElement(By.id("email"));
		
		passValues(user,"kalai");
		
	WebElement paswrd = driver.findElement(By.id("pass"));	
		
	passValues(paswrd,"kalai@10");
		//click
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		
		clickOnElement(btn);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

