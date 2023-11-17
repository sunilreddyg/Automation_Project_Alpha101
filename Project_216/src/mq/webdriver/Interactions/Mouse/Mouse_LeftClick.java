package mq.webdriver.Interactions.Mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_LeftClick 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsys.com/demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement UploadMenu=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		UploadMenu.click();
		
		Thread.sleep(4000);
		WebElement UploadButton=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(UploadButton).perform();
		//Mouse Left click method 
		
		
		
		
		

	}

}
