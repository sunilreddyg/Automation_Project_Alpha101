package ui_verificationcommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_presented_At_location {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "https://login.live.com/login.srf?"
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.live.com/login.srf?");
		driver.manage().window().maximize();
	
		
		//Sending blank text to email editbox
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.sendKeys("");
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		
		try {
			//Reading Text from location
			WebElement ErrorLoc=driver.findElement(By.xpath("//div[@id='usernameError']"));
			String ErrorText=ErrorLoc.getText();
			
			//Checking location contains text
			if(!ErrorText.isEmpty())  //!--NOT
			{
				String ExpText="Enter a valid email address, phone number, or Skype name.";
				//Comparing expected location with actual location
				if(ErrorText.equals(ExpText))
					System.out.println("As Expected Error Text presented");
				else
					System.out.println("Expected Error msg not match with Actual error message");
			}
			else
				System.out.println("Location Doesn't contains text");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Location not exist and page");
		}
		
	}

}
