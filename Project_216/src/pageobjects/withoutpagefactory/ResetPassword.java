package pageobjects.withoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPassword 
{
	WebDriver driver;
	public ResetPassword(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public By header=By.xpath("//h6[contains(.,'Reset Password')]");
	public By headerinfo=By.xpath("//p[@class='oxd-text oxd-text--p']");
	public By usernameLabel=By.xpath("//label[contains(.,'Username')]");
	public By username=By.xpath("//input[@name='username']");
	public By cancel=By.xpath("//button[contains(.,'Cancel')]");
	public By resetpassword=By.xpath("//button[contains(.,'Reset Password')]");
	
	
	String expheader="Reset Password";
	public void verifypageheader()
	{
		boolean flag=driver.findElement(header).getText().contains(expheader);
		System.out.println("Reset password page header is -> "+flag);
	}
	
	String explabel="Username";
	public void verifyusernamelabel()
	{
		boolean flag=driver.findElement(usernameLabel).getText().contains(explabel);
		System.out.println("Header presented status is ---> "+flag);
	}
	
	
	public void enterusername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void clickresetpassword()
	{
		driver.findElement(resetpassword).click();
	}
	
	public void clickcancelbutton()
	{
		driver.findElement(cancel).click();
	}
	
}
