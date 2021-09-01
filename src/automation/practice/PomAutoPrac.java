package automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAutoPrac {
static WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(name="passwd")
	private WebElement paswd;
	
	@FindBy(id="SubmitLogin")
	private WebElement login;

	

	public PomAutoPrac(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPaswd() {
		return paswd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
