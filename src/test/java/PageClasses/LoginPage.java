package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(name = "user-name")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
		
	@FindBy(name = "login-button")
	WebElement LoginBtn;
	
	// ***************************************** Methods ***********************************
	
	public LoginPage(WebDriver baseDriver) {
		
		this.driver = baseDriver;
		PageFactory.initElements(baseDriver, this);
	}
	
	public void Login(String UsernameVal, String PassVal) {
		
		//Step1: Enter User name
		
		UserName.sendKeys(UsernameVal);
				
		//Step2: Enter Password
		
		Password.sendKeys(PassVal);
					
		//Step3: Click pn Login Button

		LoginBtn.click();
	}

}
