package waitcommands;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_Example 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(20))
		            .pollingEvery(Duration.ofMillis(100))
		            .ignoring(NoSuchElementException.class,
		            		NoAlertPresentException.class);

		    wait.until(
		        d -> {
		          driver.findElement(By.id("email")).sendKeys("Displayed");
		          return true;
		             }
		    		);
		
		System.out.println("Element is presented");
		  
		
	}

}
