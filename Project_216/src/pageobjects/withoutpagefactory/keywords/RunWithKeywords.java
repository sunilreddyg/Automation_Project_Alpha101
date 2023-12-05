package pageobjects.withoutpagefactory.keywords;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import resuablecommands.HelperClass;

public class RunWithKeywords 
{
	WebDriver driver;
	public RunWithKeywords() 
	{
		HelperClass.setUpDriver();
		driver=HelperClass.getDriver();
	}
	
	@Test
	public void test() 
	{
		HelperClass.openPage("http://instagram.com");
		InstaLogin login=new InstaLogin(driver);
		login.userlogin("Admin", "90302485");
		
	}

}
