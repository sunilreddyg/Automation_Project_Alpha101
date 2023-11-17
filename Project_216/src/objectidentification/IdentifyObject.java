package objectidentification;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class IdentifyObject 
{

	public static void main(String[] args) 
	{
		
	
		//Setup Browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().setSize(new Dimension(1024, 768));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("sunil");
		driver.findElement(By.id("pass")).sendKeys("admin@12345");
		driver.findElement(By.name("login")).click();
		
		
		
		

	}

}
