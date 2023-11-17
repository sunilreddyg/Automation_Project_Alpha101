package ui_validationcommands;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.outlook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		String Mainwindow=driver.getWindowHandle();			
	
		//Identify Signin button
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[2]"));
		if(Signin_btn.isDisplayed())
			Signin_btn.click();
		else
			System.out.println("Element Not visible at webpage");
		
		Thread.sleep(3000);
		//Switch to Seconds window
		Set<String> allwindowids=driver.getWindowHandles();
		for (String eachwindow : allwindowids) 
		{
			driver.switchTo().window(eachwindow);
		}
		
		
		Thread.sleep(3000);
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		if(Email.isDisplayed() && Email.isEnabled())
		{
			Email.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		}
		else
			System.out.println("Email is not visible");
		
		Thread.sleep(3000);
		try {
			WebElement password=driver.findElement(By.xpath("//input[@id='i0118']"));
			if(password.isDisplayed())
			{
				password.sendKeys("admin@123");
			}
			else
				System.out.println("password is not visible at page");
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		/*
		 * Note:--> For every object need not to verify object visible and
		 * 			enabled status, Because selenium is desinged to perform
		 * 			action on visible and enabled objects only.
		 * 		
		 * 			WebDriver throws below exceptions when user try invalid
		 * 			actions.
		 * 
		 * ElementNotvisibleException   
		 * 			==> It Throws When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> It Throws When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
