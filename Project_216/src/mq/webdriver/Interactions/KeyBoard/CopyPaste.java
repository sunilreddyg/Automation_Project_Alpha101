package mq.webdriver.Interactions.KeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste 
{

	public static void main(String[] args) {
		
		
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
		   
		   WebElement email=driver.findElement(By.id("email"));
		   new Actions(driver)
		   .click(email).sendKeys("selenium")
		   .keyDown(Keys.SHIFT)
		   .sendKeys(Keys.ARROW_UP).pause(3000)
		   .keyDown(Keys.CONTROL)
		   .sendKeys("x")
		   .sendKeys(Keys.TAB)
		   .sendKeys("v").perform();

	}

}
