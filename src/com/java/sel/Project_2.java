package com.java.sel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
 
public class Project_2 {
	
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
	login.click();
	
	driver.findElement(By.id("email")).sendKeys("kalai95@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("john@10");
	driver.findElement(By.id("SubmitLogin")).click();
	WebElement dressTab = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	Actions a=new Actions(driver);
	a.moveToElement(dressTab).perform();
	
	WebElement summer = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
	summer.click();
	
	WebElement img = driver.findElement(By.xpath("(//img[@width='250'])[1]"));
	
	Actions image=new Actions(driver);
	image.moveToElement(img).perform();
	
	 WebElement quick = driver.findElement(By.xpath("(//span[text()='Quick view'])[1]"));
	quick.click();
Thread.sleep(2000);
	

driver.switchTo().frame(0);

	
	WebElement qtyUp = driver.findElement(By.xpath("//i[@class='icon-plus']"));

	Actions up=new Actions(driver);
	up.moveToElement(qtyUp).perform();
	Thread.sleep(1000);
	
	for (int i = 0; i < 4; i++) {
		qtyUp.click();
		}
	
	WebElement measurement = driver.findElement(By.xpath("//select[@id='group_1']"));
	
	Select s=new Select(measurement);
	
	s.selectByValue("2");
	driver.findElement(By.id("color_11")).click();
	
	driver.findElement(By.xpath("//button[@name='Submit']")).click();
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Thread.sleep(3000);
	                   //screenshot-1
	TakesScreenshot shot1=(TakesScreenshot) driver;
	
	File src1 = shot1.getScreenshotAs(OutputType.FILE);
	
	File dest1=new File("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\snap1.png");
	
	FileUtils.copyFile(src1, dest1);
	
	driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	
	Thread.sleep(4000);
	
	WebElement decrease = driver.findElement(By.id("cart_quantity_down_5_26_0_545730"));
	Actions dec=new Actions(driver);
	
	dec.moveToElement(decrease).perform();

	for (int i = 0; i < 2; i++) {
		decrease.click();
	}
	driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	
	WebElement subHead = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
	
	driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("pack the product within box..");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",subHead);
	Thread.sleep(2000);
	
	            //take screenshot------2
	
	TakesScreenshot shot2=(TakesScreenshot) driver;
	
	File src2 = shot2.getScreenshotAs(OutputType.FILE);
	
File dest2=new File("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\snap2.png");
	FileUtils.copyFile(src2, dest2);
	
	WebElement proceed = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	proceed.click();
	WebElement womenTab = driver.findElement(By.xpath("//a[@title='Women']"));

	JavascriptExecutor js1=(JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",womenTab);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //take screenshot
	
	TakesScreenshot shot3=(TakesScreenshot) driver;
	
		
		File src3 = shot3.getScreenshotAs(OutputType.FILE);
		
	File dest3=new File("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\snap3.png");
		FileUtils.copyFile(src3, dest3);
	
	WebElement proceed1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	proceed1.click();
	
	WebElement checkb = driver.findElement(By.id("uniform-cgv"));
	checkb.click();
	
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	

WebElement order = driver.findElement(By.xpath("//h1[@class='page-heading']"));

JavascriptExecutor js2=(JavascriptExecutor) driver;

js2.executeScript("arguments[0].scrollIntoView(true);",order);
        
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//take screenshot

TakesScreenshot shot4=(TakesScreenshot) driver;
	
	File src4 = shot4.getScreenshotAs(OutputType.FILE);
	
File dest4=new File("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\snap4.png");
	FileUtils.copyFile(src4, dest4);

driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

WebElement confirm = driver.findElement(By.xpath("//h1[@class='page-heading']"));

JavascriptExecutor js3=(JavascriptExecutor) driver;

js3.executeScript("arguments[0].scrollIntoView(true);",confirm);
        
//take screenshot

TakesScreenshot shot5=(TakesScreenshot) driver;
	
	File src5 = shot5.getScreenshotAs(OutputType.FILE);
	
File dest5=new File("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\snap5.png");
	FileUtils.copyFile(src5, dest5);

driver.findElement(By.xpath("//i[@class='icon-home']")).click();






}
}
