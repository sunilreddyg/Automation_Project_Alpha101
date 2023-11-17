package mq.webdriver.Interactions.KeyBoard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_ShortCuts1 {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(10000);
		
		WebElement FromLabel=driver.findElement(By.xpath("//span[contains(.,'From')]"));
		new Actions(driver)
		.click(FromLabel)
		.pause(1000)
		.sendKeys("HYD")
		.pause(5000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
	}

}
