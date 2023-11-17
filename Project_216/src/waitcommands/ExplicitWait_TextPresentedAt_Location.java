package waitcommands;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_TextPresentedAt_Location 
{
	
	public static void main(String args[])
	{
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.live.com/login.srf?");
		driver.manage().window().maximize();
		
		
		
		
		//Enable explicitwait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	
		WebElement NextBtn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		NextBtn.click();
		
		By ErrorLoc=By.xpath("//div[@id='usernameError']");
		String Exp_Text="Enter a valid email address, phone number, or Skype name.";
		
		boolean flag=false;
		try {
			flag=wait.until(ExpectedConditions
					.textToBePresentInElementLocated(ErrorLoc, Exp_Text));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Text is Presented:--->  "+flag);
		
	}

}
