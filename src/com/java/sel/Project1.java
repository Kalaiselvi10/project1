package com.java.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
	
	driver.findElement(By.id("email_create")).sendKeys("kalai95@gmail.com");
	
 driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span")).click();	
	
	WebElement radio = driver.findElement(By.xpath("//input[@value='2']"));
	
	radio.click();
	
	driver.findElement(By.id("customer_firstname")).sendKeys("Kalai");
	
	driver.findElement(By.id("customer_lastname")).sendKeys("B");
	
	driver.findElement(By.id("passwd")).sendKeys("john@10");
	
	WebElement day = driver.findElement(By.id("days"));
	
	Select s =new Select(day);
	
	s.selectByValue("10");
	
	Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.id("months"));
	
	Select s1=new Select(month);
	
	s1.selectByValue("11");
	
	Thread.sleep(2000);
	
	WebElement year = driver.findElement(By.id("years"));
	
	Select s2=new Select(year);
	
	s2.selectByValue("1995");
	
	driver.findElement(By.id("address1")).sendKeys("15A,Edison street");
	
	driver.findElement(By.id("city")).sendKeys("Newyork city");
	
WebElement state = driver.findElement(By.id("id_state"));
	
	Select s3 = new Select(state);
	
	s3.selectByValue("32");
	
	driver.findElement(By.id("postcode")).sendKeys("10005");
	WebElement country = driver.findElement(By.id("id_country"));
	
	Select s4=new Select(country);
	s4.selectByValue("21");
	
	driver.findElement(By.id("phone_mobile")).sendKeys("973928347640");
	
	driver.findElement(By.id("alias")).sendKeys("my address");
	
	driver.findElement(By.xpath("//span[text()='Register']")).click();
	
	
	
	
	
}
}
