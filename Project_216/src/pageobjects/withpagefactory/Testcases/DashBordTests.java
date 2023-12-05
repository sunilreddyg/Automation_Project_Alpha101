package pageobjects.withpagefactory.Testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.withoutpagefactory.HRM_Loginpage;
import pageobjects.withpagefactory.Keywords.Common_Reusable_actions;
import pageobjects.withpagefactory.Pages.DashBoard;
import pageobjects.withpagefactory.Pages.MenuTabs;

public class DashBordTests 
{
	WebDriver driver;
	HRM_Loginpage login;
	MenuTabs tabs;
	DashBoard dashboard;
	Common_Reusable_actions actions;
	
	public DashBordTests(WebDriver driver) 
	{
		login=new HRM_Loginpage(driver);
		tabs=new MenuTabs(driver);
		dashboard=new DashBoard(driver);
		actions=new Common_Reusable_actions(driver);
		this.driver=driver;
	}
	
	public boolean check_assignleave_AtQuickLaunch()
	{
		return dashboard.quickLaunch.findElement(dashboard.assign_Leave).isDisplayed();
	}

}
