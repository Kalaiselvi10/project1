package com.java.sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Concept {
	
static int indexofStableversion,indexofReleasedate,	indexofbetaversion;
	static int indexofbetareleasedate,indexoflinks;
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.selenium.dev/downloads/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//xpath for table headers
	
	 List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th"));
	
	//iterate all headers
	
	for (int i = 0; i < allHeaders.size(); i++) {
		
	String headers = allHeaders.get(i).getText();
	
		//System.out.println(headers);
		 
	if(headers.equalsIgnoreCase("stable version")) {
	
	 indexofStableversion = i;
	
	System.out.println("index of stsble version is....."+i);
	
	}	else if(headers.equalsIgnoreCase("release date")) {
	
	 indexofReleasedate = i;

	 System.out.println("index of release date....."+i);
	 
	}else if(headers.equalsIgnoreCase("beta version")) {
	 
		indexofbetaversion = i;
		
		System.out.println("index of beta version....."+i);
		
	}else if(headers.equalsIgnoreCase("beta release date")) {
		
		indexofbetareleasedate = i;
		
		System.out.println("index of beta release date......"+i);
		
	}else if(headers.equalsIgnoreCase("links")) {
		
		indexoflinks = i;
	
	System.out.println("index of links...."+i);
	
	}
	
}	
//traverse into table body	
	
	driver.findElements(By.xpath(""));
	
	
	
	
	
	
	
}	
	
}
	
