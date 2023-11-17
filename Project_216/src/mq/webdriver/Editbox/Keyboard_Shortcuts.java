package mq.webdriver.Editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Shortcuts {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		//Setting implicit wait to load object into DOM[document object model]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Pressing TAB Keys at Location
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("Ankur"+Keys.TAB
				+"Rathod"+Keys.TAB
				+"ankur@gmail.com");
		
		
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		Day.sendKeys("25");
		
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		Month.sendKeys("Dec");
		
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		Year.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		/*
		 * Note:--> For keyboard shortcuts to manage
		 * 			webdriver had a separate class called "Actions"
		 */
		
	}

}
