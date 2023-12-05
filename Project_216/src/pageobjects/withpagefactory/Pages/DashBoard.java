package pageobjects.withpagefactory.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoard 
{
	WebDriver driver;
	public DashBoard(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//button[@title='Assign Leave']")
	public WebElement assignLeave;
	
	public By assign_Leave=By.xpath("//button[@title='Assign Leave']");
	
	@FindBy(xpath="//button[@title='Leave List']")
	public WebElement leaveList;
	
	@FindBy(css="button[title='Timesheets']")
	public WebElement timeSheets;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div")
	public WebElement quickLaunch;
	
	
	public boolean verifyassignleavePresented()
	{
		boolean flag=false;
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(assignLeave));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	
	
	
	

}
