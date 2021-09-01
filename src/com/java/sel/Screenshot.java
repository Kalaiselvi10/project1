package com.java.sel;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/windows");
	driver.manage().window().maximize();
 driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	
	
	Thread.sleep(2000);
	
	Set<String> windows = driver.getWindowHandles();
	
	Iterator<String> iter = windows.iterator();
	
	String parent = iter.next();
	String child = iter.next();
	
	driver.switchTo().window(parent);
	driver.switchTo().window(child);
	
	WebElement text1 = driver.findElement(By.xpath("//h3[text()='New Window']"));
	
	System.out.println(text1.getText());
	Thread.sleep(3000);
	driver.switchTo().window(parent);
	
	WebElement text2 = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
	
	System.out.println(text2.getText());
	
	//convert webdriver object to take screenshot
	
	TakesScreenshot shot=(TakesScreenshot) driver;  //narrowing-->high to low
	
	//call getScreenshotAs method to create image file
	
	File src = shot.getScreenshotAs(OutputType.FILE);
	
	//create a file location
	
	File dest=new File("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\snap.png");
	
	//copy file to desired location
	
	FileUtils.copyFile(src,dest);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
