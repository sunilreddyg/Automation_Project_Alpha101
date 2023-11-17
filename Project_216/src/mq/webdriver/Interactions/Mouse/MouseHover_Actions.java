package mq.webdriver.Interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Actions 
{
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement Jobs=driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		new Actions(driver).moveToElement(Jobs).perform();
		
		WebElement FresherJobs=driver.findElement(By.xpath("//a[contains(@title,'Fresher jobs')]"));
		//FresherJobs.click();   //Perform Left Click
		
		//Using Mouse interfaction class performing Left click action at location
		new Actions(driver).click(FresherJobs).perform();
		
	}

}
