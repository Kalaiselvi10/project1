package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHand_Task {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	
	WebElement multiple = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
	
	Actions a=new Actions(driver);
	a.click(multiple).perform();
	
	WebElement first = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
	
	System.out.println(first.getText());
	
	WebElement second = driver.findElement(By.xpath("//a[text()='Click Here']"));
	
	a.click(second).perform();
	Thread.sleep(2000);
	
	WebElement third = driver.findElement(By.xpath("//h3[text()='New Window']"));
	
	Thread.sleep(3000);
	System.out.println(third.getText());
}
}
