package objectidentification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Setting implicit wait to load object into DOM[document object model]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    
	    //Clicking PIM button
	    driver.findElement(By.xpath("//span[contains(.,'PIM')]")).click();
	    
	    //Clicking at Add Button
	    driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	    
	    //Enter Firstname into Textbox
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ankur");
	}

}
