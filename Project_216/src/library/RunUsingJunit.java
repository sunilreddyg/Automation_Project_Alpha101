package library;

import org.junit.Ignore;
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
	
	
	@Ignore
	public void test1()
	{
		System.out.println("Checking Singup Link Visibility");
		Waitforvisible(CommonObjects.signuplink).click();
		
		
		Waitfor("visible", CommonObjects.regfirstname).sendKeys("ajay");
	}
	

	
	@Ignore
	public void test2()
	{
		ClickonElement(CommonObjects.signuplink);
		System.out.println(driver.getTitle());
		typetext(CommonObjects.regfirstname, "Ajay");
		typetext(CommonObjects.regsurname, "Kumar");
	}
	
	
	@Test
	public void droddownselection()
	{
		LoadPage("https://www.facebook.com/reg/");
		selectdropdownoption(CommonObjects.regdobday, "21");
		select_dropdown(CommonObjects.regdobmonth, "value", "6");
		select_dropdown(CommonObjects.regdobyear, "index", "9");
		capturescreen("DropdownSelections");
	}

}
