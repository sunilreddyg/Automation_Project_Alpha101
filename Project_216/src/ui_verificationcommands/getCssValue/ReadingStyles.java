package ui_verificationcommands.getCssValue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingStyles {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Location=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
		
		//Read Text color
		String Color=Location.getCssValue("color");
		System.out.println(Color);
		
		//Read font size
		String FontSize=Location.getCssValue("font-size");
		System.out.println(FontSize);
		
		//Get Cursor type
		String CursorType=Location.getCssValue("cursor");
		System.out.println(CursorType);
		
		//check object visibility
		String Status=Location.getCssValue("display");
		if(!Status.equals("none"))
			System.out.println("Object Visible");
		else
			System.out.println("Object not visible");
	}

}
