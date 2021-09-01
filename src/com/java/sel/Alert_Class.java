
package com.java.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_Class {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
	driver.manage().window().maximize();
	
	//WebElement simple = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
	//Thread.sleep(3000);
	//simple.click();
	//Thread.sleep(3000);
	//driver.switchTo().alert().accept();     //for ok
	
	
	/*WebElement confirm = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
	
	confirm.click();
	
	driver.switchTo().alert().dismiss();*/
	
	driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
	
	     Alert prompt = driver.switchTo().alert();
	//capturing alert msg
	System.out.println(prompt.getText());
	
	prompt.sendKeys("prompt alert handled");
	
	Thread.sleep(4000);
	
	prompt.accept();
	//driver.close();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
