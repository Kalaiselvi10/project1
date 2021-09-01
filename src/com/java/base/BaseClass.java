package com.java.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.java.sel.DropDown;

public class BaseClass {
	static WebDriver driver;
	//click---->webelement    ########### clickOnElement
		
	public static void clickOnElement(WebElement element) {
		
	element.click();	
	
	}
	//sendkeys->webelement,string ########### passValues
	
	public static void passValues(WebElement element , String value) {

		element.sendKeys(value);
}
	
	//getText()---->webelement ####### getContent
	
	public static void getContent(WebElement element) {

		System.out.println(element.getText());
	}
	//getTitle	
	public static void getTitle(String Title) {
String title2 = driver.getTitle();
System.out.println(title2);
	}
	
	//getCurrentUrl
	
	public static void getCurrentUrl() {
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
	}
	
	//getAttribute
	
	public static void getAttribute(WebElement element,String attribute) {
String attribute2 = element.getAttribute(attribute);
System.out.println(attribute2);
	}
	
//browserConfig--->string  ######### systemsetup
	    //if we give only browser name it'll setup automatically
	
	/*public static WebDriver browserConfig(String browserName) {

	if(browserName.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe");
		
	 driver =new ChromeDriver();    
		
	}else if(browserName.equalsIgnoreCase("FireFox")) {
		
		System.setProperty(null, null);
		
		driver=new FirefoxDriver();
		
	}else if(browserName.equalsIgnoreCase("Edge")) {
		
		System.setProperty(null, null);
		
		driver=new EdgeDriver();
		
	}else{
		System.out.println("invalid browserName");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	}	*/

	//browser name
	
	public static WebDriver browserConfig(String browsername) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
	return driver;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//get URL---------->string   ######### get
	public static void getURL(String url) {
driver.get(url);
		
	}
	
	
	//wait
	//implicitly wait---------->int     
	public static void impWait(int time) {

		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		}
		
	//explicitly wait----------->int,webelement	
		
		
/*	public static void expWait(int time,WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver,time);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		}	*/
		
	//Take screenshot----------->string location	
		
	/*public static void snapShot(String location) throws IOException {

		TakesScreenshot ts=(TakesScreenshot)driver;	
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(location);
		
		FileUtils.copyFile(src, dest);
		*/
	
	
	
	public static void snapShot(String location) throws IOException {

TakesScreenshot ts=(TakesScreenshot)driver;	
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(location);
		
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//close
	public static void shut() {
             driver.close();
	}
	//quit
public static void quit() {
driver.quit();
}
	
	
	
	
	
	//navigate------>to(string),back,forward,refresh
	
	public static void move(String url) {

		driver.navigate().to(url);
	}
	
	public static void back() {
driver.navigate().back();
	}
	
	public static void refresh() {
driver.navigate().refresh();
	}
	public static void forward() {
driver.navigate().forward();
	}
	
//actions--->actions a=new actions(driver)
	
	public static void action(WebElement element,String options ) {

		Actions a =new Actions(driver);
		
	if (options.equalsIgnoreCase("move")){
		a.moveToElement(element).perform();
	}	else if (options.equalsIgnoreCase("click")) {
		a.click(element).perform();
	}else if (options.equalsIgnoreCase("rightClick")) {
		a.contextClick(element).perform();
	}else if (options.equalsIgnoreCase("dualClick")) {
		a.doubleClick(element).perform();
	}else {
		System.out.println("not valid");
	}}
	//scroll
	
	public static void scroll(WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	
	
	
	
	
//robot 	
	public static void robot(WebElement element,String options) throws AWTException {
      Robot rob=new Robot();
      
    if (options.equalsIgnoreCase("up")) {
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
      
    }else if (options.equalsIgnoreCase("enter")) {
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}else if (options.equalsIgnoreCase("down")) {
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
	}else if (options.equalsIgnoreCase("left")) {
		rob.keyPress(KeyEvent.VK_LEFT);
		rob.keyRelease(KeyEvent.VK_LEFT);

	}else if(options.equalsIgnoreCase("right")) {
		rob.keyPress(KeyEvent.VK_RIGHT);
		rob.keyRelease(KeyEvent.VK_RIGHT);
	}else {
		System.out.println("not valid option");
	}}
      
 //Alert     
 
   public static void alert(WebElement element,String options) {

	   Alert element1 = driver.switchTo().alert();
	   
	   if (options.equalsIgnoreCase("accept")) {
		element1.accept();
	}else if (options.equalsIgnoreCase("dismiss")) {
		element1.dismiss();
	}else if (options.equalsIgnoreCase("text")) {
		String text = element1.getText();
		System.out.println(text);
	}}
	   
	 //Frames---->webelement
	   
public static void frame(WebElement element) {

	driver.switchTo().frame(element);
	}
	   
	public static void mainFrame(WebElement element) {

		driver.switchTo().frame(element);
	}   
 
//is Enabled      
      
    public static void isEnabled(WebElement element) {

    	boolean enabled = element.isEnabled();
    	
    	System.out.println(enabled);
	}  
      
   //is Displayed
    public static void isDisplayed(WebElement element) {

    	boolean displayed = element.isDisplayed();
    	
	System.out.println(displayed);
    }
      
   //is selected
    
    public static void isSelected(WebElement element) {
boolean selected = element.isSelected();
    	System.out.println(selected);
    	
	}
    
   //window handle ---->type(single/multiple),destination
    
    public static void windowHandles(String type,String destination) {

    	if (type.equalsIgnoreCase("single window")) {
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
		}else if (type.equalsIgnoreCase("multiple window")) {
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
		for (String all : windowHandles) {
			System.out.println(all);
			String title1 = driver.switchTo().window(all).getTitle();
			System.out.println(title1);
		}	
		
		String actualTitle=destination;
		
		for (String all : windowHandles) {
			if (driver.switchTo().window(all).getTitle().equals(actualTitle)) {
				break;
			}}		
		
		}}  
    //dropdown----->value,index,visibletext
 
    public static void dropDown(WebElement element,String option,String i) {
Select s=new Select(element);
   if (option.equalsIgnoreCase("index")) {
	s.selectByIndex(Integer.parseInt(i));
} else if (option.equalsIgnoreCase("value")) {
	s.selectByValue(i);
}else if (option.equalsIgnoreCase("text")) {
	s.selectByVisibleText(i);
}	}
    
    //getoptions
    
    public static void getOptions(WebElement element) {

    	Select s=new Select(element);
    	List<WebElement> list = s.getOptions();
    	for (WebElement all : list) {
			System.out.println(all.getText());
		}
	}
    
    
    	
    	
	}
    
    
    
    
    
    
    
    
    
    
    
    
  
	  
	  
	  
	  
	  
	  

  
      
      
	
	
	
	
	

	
	