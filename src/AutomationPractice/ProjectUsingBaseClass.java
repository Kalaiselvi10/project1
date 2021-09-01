package AutomationPractice;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.java.base.BaseClass;

public class ProjectUsingBaseClass extends BaseClass {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
	
	driver=browserConfig("chrome");
	
	impWait(10);
	
	getURL("http://automationpractice.com/index.php");
	
	WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
	
	clickOnElement(login);
	
	WebElement user = driver.findElement(By.id("email"));
	
	WebElement passwrd = driver.findElement(By.xpath("//input[@id='passwd']"));
	
	passValues(user, "kalai95@gmail.com");
	

	passValues(passwrd, "john@10");
	
	WebElement signin = driver.findElement(By.id("SubmitLogin"));
	
	clickOnElement(signin);
	
	WebElement dressTab = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	action(dressTab, "move");
	
	WebElement summer = driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
	clickOnElement(summer);
	
	WebElement img = driver.findElement(By.xpath("(//img[@width='250'])[1]"));
	
	action(img, "move");
	 WebElement quick = driver.findElement(By.xpath("(//span[text()='Quick view'])[1]"));
	 clickOnElement(quick);
Thread.sleep(2000);
	

driver.switchTo().frame(0);

	
	WebElement qtyUp = driver.findElement(By.xpath("//i[@class='icon-plus']"));

	action(qtyUp, "move");
	
	for (int i = 0; i < 4; i++) {
		qtyUp.click();
		}
	
	WebElement measurement = driver.findElement(By.xpath("//select[@id='group_1']"));
	
	dropDown(measurement, "value", "2");
	
	
	driver.findElement(By.id("color_11")).click();
	
	driver.findElement(By.xpath("//button[@name='Submit']")).click();
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Thread.sleep(3000);
	                   //screenshot-1


	snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\shot1.png");
	
	WebElement proceed1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	clickOnElement(proceed1);
	
	Thread.sleep(4000);
	
	WebElement decrease = driver.findElement(By.id("cart_quantity_down_5_26_0_545730"));
	action(decrease, "move");
	for (int i = 0; i < 2; i++) {
		decrease.click();
	}
	driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	
	
	WebElement text = driver.findElement(By.xpath("//textarea[@name='message']"));
	passValues(text, "pack the product within box..");
	
	WebElement subHead = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
	scroll(subHead);
	
	Thread.sleep(2000);
	
	            //take screenshot------2
	
	snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\shot2.png");
	impWait(10);
	WebElement proceed = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	
	clickOnElement(proceed);
	
	WebElement womenTab = driver.findElement(By.xpath("//a[@title='Women']"));

scroll(womenTab);

	impWait(20);
	 //take screenshot
	
	snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\shot3.png");
	
	WebElement submt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	clickOnElement(submt);
	impWait(20);
	WebElement checkb = driver.findElement(By.id("cgv"));
action(checkb, "click");
impWait(20);
WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
clickOnElement(submit1);
	
WebElement element1 = driver.findElement(By.xpath("//a[@class='bankwire']"));
clickOnElement(element1);
	

WebElement order = driver.findElement(By.xpath("//h1[@class='page-heading']"));

scroll(order);
impWait(20);
//take screenshot

snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\shot4.png");
WebElement submit3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
clickOnElement(submit3);

WebElement confirm = driver.findElement(By.xpath("//h1[@class='page-heading']"));

scroll(confirm);
//take screenshot

snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\shot5.png");
driver.findElement(By.xpath("//i[@class='icon-home']")).click();






}


	
	
	
}

