package mq.java.Exception_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongElement 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		if(driver!=null)
		{
			try {
				driver.get("http://facebook.com");
				
				if(driver.getTitle().contains("Facebook"))
				{
					try {
						driver.findElement(By.id("email"));
						System.out.println("Element found");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		//Without Handling exceptions
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://facebook.com");
		driver1.findElement(By.id("email"));
		

	}

}
