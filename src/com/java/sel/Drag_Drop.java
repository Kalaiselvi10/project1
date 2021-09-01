package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	/*driver.get("https://demoqa.com/droppable");
	
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	
	WebElement drag = driver.findElement(By.xpath("//div[text()='Drag me']"));
	
	WebElement drop = driver.findElement(By.id("droppable"));
	
	a.dragAndDrop(drag, drop).perform();
	*/
driver.get("https://demoqa.com/buttons");
	
	driver.manage().window().maximize();
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
