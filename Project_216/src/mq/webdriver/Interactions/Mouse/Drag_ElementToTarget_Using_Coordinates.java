package mq.webdriver.Interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ElementToTarget_Using_Coordinates {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Slider1=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[1]"));
		new Actions(driver).dragAndDropBy(Slider1, 100, 0).perform();
		

		Thread.sleep(5000);
		WebElement Slider2=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[2]"));
		
		int BeforeX=Slider2.getLocation().getX();
		new Actions(driver).dragAndDropBy(Slider2, -200, 0).perform();
		int AfterX=Slider2.getLocation().getX();
		
		if(AfterX < BeforeX)
			System.out.println("Drag Successful");
		else
			System.out.println("Drag fail");
		
		

	}

}
