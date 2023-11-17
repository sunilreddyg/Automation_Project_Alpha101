package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_title 
{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println("Facebook title presented");
		
		WebElement forgotpassword=driver.findElement(By.linkText("Forgotten password?"));
		forgotpassword.click();
		
		boolean flag=false;
		try {
			flag=wait.until(ExpectedConditions.titleContains("Forgotten Password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Title Presnted status is --> "+flag);
		
		
		WebElement LoginBtn=driver.findElement(By.xpath("(//span[contains(.,'Log in')])[2]"));
		LoginBtn.click();
		
		boolean flag1=false;
		try {
			flag1=wait.until(ExpectedConditions.titleIs("Log in to Facebook"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Login Title presented "+flag1);
		
		
		WebElement Messenger=driver.findElement(By.linkText("Messenger"));
		Messenger.click();
		
		//Expectedcondtion Class without using webdriverwait
		boolean flag2=ExpectedConditions.titleContains("Messenger").apply(driver);
		System.out.println("Messenger title status is --> "+flag2);
		
		
		
		
		
	}

}
