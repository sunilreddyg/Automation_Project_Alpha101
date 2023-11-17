package mq.webdriver.Link;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Example {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.linkText("Locations")).click();
		driver.findElement(By.linkText("India")).click();
		driver.findElement(By.linkText("FortArea")).click();
		driver.findElement(By.partialLinkText("Siwaji Mahraj Turminas")).click();
	}

}
