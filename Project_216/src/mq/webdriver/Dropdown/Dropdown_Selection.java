package mq.webdriver.Dropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//selecting dropdown using Option Name  [Name is casesensitive]
		WebElement DOBday=driver.findElement(By.id("day"));
		new Select(DOBday).selectByVisibleText("24");
		
		//selecting dropdown using Value Property 
		WebElement DOBmonth=driver.findElement(By.id("month"));
		new Select(DOBmonth).selectByValue("5");
		
		//Selecting dropdown using index number
		WebElement DOByear=driver.findElement(By.id("year"));
		new Select(DOByear).selectByIndex(23);

	}

}
