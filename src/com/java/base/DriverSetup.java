package com.java.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DriverSetup extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	//browserConfig---->string	
		
	browserConfig("Chrome");
		
	//getURL("https://en-gb.facebook.com/")	;
		
		
	impWait(20);	
		
	//snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\basesnap.png");	
		
	//shut();	
	/*move("https://en-gb.facebook.com/");	
		
	
	 WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]")) ; 
     
     clickOnElement(create);
	
	Thread.sleep(2000);
	
	WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	
	passValues(name,"kalaiselvi");
	
	Thread.sleep(2000);
back();		
		
Thread.sleep(2000);		
		
refresh();		*/
		
		//***************Actions*****************
	
	
getURL("http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	
	WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
	action(courses,"move");
	Thread.sleep(3000);
	
	WebElement aws = driver.findElement(By.xpath("//span[text()='AWS Training']"));
	
	action(aws,"click");
	
shut();
	


	// #############ALERT###############
	
	getURL("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
	
	driver.manage().window().maximize();
	
	
	WebElement simple = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
	
	alert(simple,"accept");
	
	WebElement confirm = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
	
	alert(confirm, "dismiss");
	
	
	
	
	
	
	
	
	
	}	
	
	
	
	
	
	
	
	
}
