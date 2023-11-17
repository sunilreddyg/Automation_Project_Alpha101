package library;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RunUsingJunit extends CommonActions 
{
	WebDriver driver;
	String url="https://www.facebook.com/reg";
	
	public RunUsingJunit() 
	{
		driver=setupchrome();
	}
	
	@Test
	public void test()
	{
		ClickonElement(CommonObjects.signuplink);
		typetext(CommonObjects.regfirstname, "Ajay");
		typetext(CommonObjects.regsurname, "Kumar");
	}

}
