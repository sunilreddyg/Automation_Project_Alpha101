package mq.webdriver.Dropdown.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleOption_Selection {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsys.com/demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement SelectMenu=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu.click();
		
		WebElement Dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		
		
		//Decision statement to accept on multiple selection type
		if (new Select(Dropdown).isMultiple()) 
		{
			new Select(Dropdown).deselectAll();  //Deselection only possible on multile selection dropdown
			new Select(Dropdown).selectByVisibleText("India");
			new Select(Dropdown).selectByVisibleText("Japan");
			new Select(Dropdown).selectByVisibleText("Dubai");
			/*
			 * Note:--> To select multiple option selenium don't have
			 * 			separate method. Just repeat single option 
			 * 			select method multiple times
			 */
			
			Thread.sleep(2000);
			
			
			new Select(Dropdown).deselectByVisibleText("Japan");
		} 
		else 
		{
			System.out.println("Dropdown is Single Selection type");
		}
		
		
	}

}
