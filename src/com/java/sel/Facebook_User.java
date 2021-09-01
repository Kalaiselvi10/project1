package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_User {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement fb_user = driver.findElement(By.id("email"));
		
		//fb_user.sendKeys("9585385535");
		
		WebElement fb_pas = driver.findElement(By.id("pass"));
		
		fb_user.sendKeys(Keys.CONTROL,"ac");
		
		fb_pas.sendKeys(Keys.CONTROL,"v");
		
		
		
		//fb_pas.sendKeys("kalai@10");
		Thread.sleep(2000);
		WebElement logn_btn = driver.findElement(By.xpath("//button[@name='login']"));
		
		logn_btn.click();	
	Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	}
	
	
	
	
	
	
	
	
	
}
