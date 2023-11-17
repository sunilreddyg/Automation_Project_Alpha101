package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_ElementTobe_Clickable {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://seller.flipkart.com/index.html#signUp/accountCreation/new?utm_source=fkwebsite&utm_medium=websitedirect");
		driver.manage().window().maximize();
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='mobileNumber']")))
			.sendKeys("903024");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.elementToBeClickable
					(By.xpath("//button[contains(.,'Send OTP')]"))).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
