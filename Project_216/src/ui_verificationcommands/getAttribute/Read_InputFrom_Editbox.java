package ui_verificationcommands.getAttribute;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_InputFrom_Editbox {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		WebElement Myinfo=driver.findElement(By.xpath("//span[contains(.,'My Info')]"));
		Myinfo.click();
		
		Thread.sleep(5000);
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		boolean flag=Firstname.getAttribute("value").contains("Paul");
		System.out.println(flag);
		
		
		
		

	}

}
