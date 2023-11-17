package mq.java.conditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Else_if_Statement 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Elseif:-->
		 * 		Multiple decisions take place here..
		 */
		
		
		 int a=19;
		 
		if (a > 18) 
		{
			System.out.println("Valid");
		}
		else if (a==18) 
		{
			System.out.println("Equal");
		}
		else if (a < 18) 
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println("No Decision Equal");
		}
		
		
		
		String browser="firefox";
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("No Browser matched");
		}
			
	
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
		}
		
		
		if(driver.getTitle().contains("Facebook"))
		{
			driver.findElement(By.id("pass")).sendKeys("admin");
		}
		
		
		
		
	}

}
