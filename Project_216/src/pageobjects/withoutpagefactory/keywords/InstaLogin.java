package pageobjects.withoutpagefactory.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstaLogin 
{
	WebDriver driver;
	PageObject_Keywords keywords;
	public InstaLogin(WebDriver driver) 
	{
		this.driver=driver;
		keywords=new PageObject_Keywords(driver);
	}
	
	public By username=By.xpath("//input[@name='username']");
	public By password=By.xpath("//input[@aria-label='Password']");
	public By loginbutton=By.xpath("//button[@type='submit']");
	
	
	
	public void userlogin(String uid,String pwd)
	{
		keywords.typetext(username, uid);
		keywords.typetext(password, pwd);
		keywords.ClickElemnet(loginbutton);
	}

}
