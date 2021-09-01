package com.java.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.greenstechnologys.com/");
	
	//use scroll down
		
	JavascriptExecutor js=(JavascriptExecutor) driver;

	WebElement perumbakkam = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
	
	js.executeScript("arguments[0].scrollIntoView();",perumbakkam);
	
	Object text = js.executeScript("return arguments[0].innerHTML", perumbakkam);
	
	System.out.println(text);
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,-2000);");
	
	/*WebElement text2 = driver.findElement(By.xpath("//h1[@style='font-size:22px;']"));
	
	js.executeScript("return arguments[0].innerHTML", text2);
	
	System.out.println(text2.getText());
	*/
	
	
	
	
	
	
	
	//click
	/*driver.get("http://adactinhotelapp.com/");
	
	driver.findElement(By.id("username")).sendKeys("kalai");
	
	driver.findElement(By.id("password")).sendKeys("kkaal123#");
	
	WebElement logn = driver.findElement(By.id("login"));
	
	js.executeScript("arguments[0].click();",logn);
	*/
	
	
	
	
	
	
	
	
	
}
}
