package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Click_Method_Using_JSExecutor 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		
		WebElement CreateAccount=driver.findElement(By.xpath("(//span[contains(.,'Create free account')])[1]"));
		
		//Original Method
		//CreateAccount.click();
		//Click method using mouse commands
		//new Actions(driver).click(CreateAccount).perform();
		
		//Get Reference of Javascript Executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", CreateAccount);
		Thread.sleep(3000);
		
		//Type text into entrybox using javscript executor
		js.executeScript("document.querySelector(\"#MemberName\").value='FirstEmailGTR'");
		
		//Click on button using javascript executor
		js.executeScript("document.querySelector(\"#iSignupAction\").click()");
	}

}