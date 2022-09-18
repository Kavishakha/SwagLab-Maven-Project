package SaucePackage;

import org.testng.annotations.Test;

import PageClasses.LoginPage;

public class SauceDemoLogin extends BaseClass{
	
	@Test

	public void loginTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("standard_user", "secret_sauce");
	
	}

}
