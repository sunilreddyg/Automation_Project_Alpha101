package resuablecommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testable 
{
	
	public static boolean verifytitle(WebDriver driver,String exptitle)
	{
		return driver.getTitle().contains(exptitle);
	}
	
	
	public static boolean verifylocpresented(WebDriver driver,String xpath)
	{
		boolean flag=false;
		try {
			driver.findElement(By.xpath(xpath));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
