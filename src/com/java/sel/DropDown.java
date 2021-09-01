package com.java.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.java.base.BaseClass;

public class DropDown extends BaseClass {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	driver.manage().window().maximize();
	
	WebElement single = driver.findElement(By.xpath("//select[@class='form-control']"));
	//clickOnElement(single);
	//dropDown(single, "value","Monday");
	dropDown(single, "value", "Monday");
	
}}
	
	
	/*Select s=new Select(single);
	s.selectByValue("Thursday");
	*/
	
//	WebElement multiple = driver.findElement(By.xpath("//select[@style='width:200px']"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Select s1=new Select(multiple);
	s1.selectByVisibleText("Texas");
	s1.selectByValue("California");
	s1.selectByVisibleText("New York");
	s1.selectByValue("Washington");
	
	List<WebElement> all = s1.getOptions();
	
	for (WebElement options : all) {
		System.out.println(options.getText());
	}*/
	
	
	/*List<WebElement> all = s1.getOptions();
	for ( WebElement options : all) {
		System.out.println(options.getText());
	}*/
	
	/*List<WebElement> allSelected = s1.getAllSelectedOptions();
	
	for (WebElement selected : allSelected) {
		System.out.println("selected options are......."+selected.getText());
	}
	
	WebElement first = s1.getFirstSelectedOption();
	System.out.println("first selected is..."+first.getText());
	boolean multi = s1.isMultiple();
	
	System.out.println(multi);
	s1.deselectAll();
	//System.out.println(selected);
	}*/
	



//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

