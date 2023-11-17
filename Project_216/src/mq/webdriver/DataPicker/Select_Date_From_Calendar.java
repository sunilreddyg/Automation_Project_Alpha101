package mq.webdriver.DataPicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Date_From_Calendar {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Account login
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    
	    WebElement Leave=driver.findElement(By.xpath("(//span[contains(.,'Leave')])[1]"));
	    Leave.click();
	    
	    //Open Calendar
	    driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).click();
	    Thread.sleep(2000);
	    //Selecting date from Calendar
	    driver.findElement(By.xpath("//div[@class='oxd-calendar-date'][contains(.,'19')]")).click();
	}

}
