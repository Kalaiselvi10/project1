package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//task1
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement redbus = driver.findElement(By.id("src"));
		redbus.sendKeys("TRICHY");
		
		WebElement redbus1=driver.findElement(By.id("dest"));
		redbus1.sendKeys("CHENNAI");
		//driver.close();
		/*//task2
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement google = driver.findElement(By.name("q"));
		
		google.sendKeys("Greens Technology");
		*/
		//task3
		//driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	/*	driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		WebElement swiggy = driver.findElement(By.id("location"));
		swiggy.sendKeys("chennai");*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
