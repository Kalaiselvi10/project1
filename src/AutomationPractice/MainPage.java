
 

package AutomationPractice;

import org.openqa.selenium.WebDriver;

import com.java.base.BaseClass;
 
public class MainPage extends BaseClass {
	static WebDriver driver;
	
public static void main(String[] args) {
	
	driver=browserConfig("chrome");
	getURL("http://automationpractice.com/index.php");
	SigninPage sp=new SigninPage(driver);
	clickOnElement(sp.getSignin());
	passValues(sp.getUser(), "kalai95@gmail.com");
	passValues(sp.getPaswd(), "john@10");
	clickOnElement(sp.getLogin());
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
