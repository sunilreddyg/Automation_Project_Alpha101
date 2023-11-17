package ui_verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title_presented {

	public static void main(String[] args) {
		
		
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(driver!=null)
		{
			driver.get("http://facebook.com");
			String RuntimeTitle=driver.getTitle();
			
			String ExpTitle="Facebook – log in or sign up";
			//Verify Equal Comparision between Two Strings
			if(RuntimeTitle.equals(ExpTitle))
				System.out.println("Title presented");
			else
				System.out.println("Title not presented");
			
		}
		else
			System.out.println("Browser launch failed");
		
		
		
		//Closing browser
		try {
			Thread.sleep(4000);
			driver.close();
		} catch (InterruptedException e) {
			
		}

	}

}
