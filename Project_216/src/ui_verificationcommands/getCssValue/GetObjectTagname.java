package ui_verificationcommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetObjectTagname {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Location=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		System.out.println(Location.getTagName());
		
		
		

	}

}
