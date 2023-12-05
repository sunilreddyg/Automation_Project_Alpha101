package pageobjects.withpagefactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.withpagefactory.Keywords.Common_Reusable_actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Myinfo
{
	WebDriver driver;
	Common_Reusable_actions actions;
	public Myinfo(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		actions=new Common_Reusable_actions(driver);
	}
	

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement  Firstname;
	
	@FindBy(xpath = "//input[@name='middleName']")
	public WebElement  MiddleName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement  Surname;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement  Nickname;


	public void addinfodetails()
	{
		actions.TypeText(Firstname, "Aakash");
		actions.TypeText(MiddleName, "Krish");
		actions.CaptureScreen("InfoPage");
	}
	
	
	

}