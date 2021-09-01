package automation.practice;

import org.openqa.selenium.WebDriver;

import com.java.base.BaseClass;

public class LoginPageAp extends BaseClass{
static WebDriver driver;
	public static void main(String[] args) {
		
	driver=browserConfig("chrome");	
		
	getURL("http://automationpractice.com/index.php");	
		
		PomAutoPrac pa=new PomAutoPrac(driver);
		
	clickOnElement(pa.getSignin());	
		
	passValues(pa.getUser(), "kalai95@gmail.com");	
	passValues(pa.getPaswd(), "John@10");	
	clickOnElement(pa.getLogin());	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
