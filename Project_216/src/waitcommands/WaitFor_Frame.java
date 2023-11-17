package waitcommands;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Frame 
{

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bushire/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    

	    try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
					(By.xpath("//object[@data-radium='true']")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	    
	    
	    
	    //Identifying element under frame
	    WebElement OutStation=driver.findElement(By.xpath("(//div[contains(@class,'u4EAg')])[1]"));
	    OutStation.click();
	    
	    //Switch Controls back to mainpage
	    driver.switchTo().defaultContent();
		
		
		
	}

}
