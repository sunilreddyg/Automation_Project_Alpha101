package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor_SelectDropdownOPtions 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		//Default Dropdown selection command
		//new Select(driver.findElement(By.id("day"))).selectByVisibleText("23");
		
		
		//Enable javascript on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
				
		//Selecting Option from dropdown using Value property
		//This is alternative syntax for selectbyvalue
		WebElement DayDropdown=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		js.executeScript("arguments[0].value='12'", DayDropdown);
		
		
		//Selecting Option from dropdown using Index Property
		//This is alternative syntax for SelectByindex
		Thread.sleep(3000);
		WebElement MonthDropdown=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		js.executeScript("arguments[0].selectedIndex='3'", MonthDropdown);
		
		
		//Selecting Option from dropdown using Value property
		WebElement YearDropdown=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		js.executeScript("arguments[0].selectedIndex='20'", YearDropdown);
	}

}