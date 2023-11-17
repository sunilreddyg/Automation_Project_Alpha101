package mq.webdriver.Editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keyboard_Keys {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.live.com/login.srf?");
		driver.manage().window().maximize();
		//Setting implicit wait to load object into DOM[document object model]
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Storing page location into WebElement reference
		WebElement Username=driver.findElement(By.name("loginfmt"));
		Username.clear();   //Clear Text at Editbox
		Username.sendKeys("sunilreddy.gajjala@gmail.com"+Keys.ENTER);

		
		WebElement Password=driver.findElement(By.xpath("//input[@id='i0118']"));
		Password.sendKeys("6808admin"+Keys.END);
	}

}
