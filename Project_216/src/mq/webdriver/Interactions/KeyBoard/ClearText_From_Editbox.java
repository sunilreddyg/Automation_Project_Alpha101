package mq.webdriver.Interactions.KeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ClearText_From_Editbox {

	public static void main(String[] args) throws Exception {
		
		 ChromeOptions ops = new ChromeOptions();
         ops.addArguments("--disable-notifications");
	
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		WebElement DateField=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		//DateField.clear();    [Direct method to clear text from editbox]
		
		new Actions(driver).click(DateField)
		.keyDown(Keys.CONTROL).sendKeys("A").sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ESCAPE).perform();
	}

}
