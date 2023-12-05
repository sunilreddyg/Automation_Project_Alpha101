package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;

public class Testcaselogin 
{
	WebDriver driver;
	HRM_Loginpage login;
	AccountPage account;
	public Testcaselogin(WebDriver driver) 
	{
		this.driver=driver;
		login=new HRM_Loginpage(driver);
		account=new AccountPage(driver);
	}
	
	
	//Testname:--> loginwith invalid test
	String ValidUID="Admin";
	String InvalidPWD="hello";
	public void verifyloginwithinvaliddata()
	{
		if(login.verifyLoginpageDisplayed())
		{
			login.userlogin(ValidUID, InvalidPWD);
			if(login.verifyErrorDisplayed())
				System.out.println("Error is displayed");
			else
				System.out.println("Error is not displayed");
		}
	}
	
	
	//Testname:--> Verify login with valid data
	public void Verifyloginwithvaliddata()
	{
		if(login.verifyLoginpageDisplayed())
		{
			login.userlogin("Admin", "admin123");
			if(account.verifyloginSuccessful())
				System.out.println("Login is Successful");
			else
				System.out.println("Login failed");
		}
	}
}
