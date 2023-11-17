package switchcommands.Alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWith_Alerts {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Element=driver.findElement(By.xpath("//label[@for='concessionBooking']"));
		Element.click();
		Thread.sleep(3000);
		
		//Click OK button
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		

	}

}
