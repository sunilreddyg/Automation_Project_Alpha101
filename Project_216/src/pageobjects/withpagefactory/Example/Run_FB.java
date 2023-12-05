package pageobjects.withpagefactory.Example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_FB 
{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//In order to find @Findby annoation object we should use
		//PageFactoly library class..
		FBLogin login=PageFactory.initElements(driver, FBLogin.class);
		login.loginemail.sendKeys("sunil");
		login.loginpassword.sendKeys("sunil@123");
		login.loginbutton.click();
		
	}

}
