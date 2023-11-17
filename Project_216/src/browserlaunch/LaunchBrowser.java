package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{

	public static void main(String[] args) {
		
		
		//Launching chrome browser and storing reference into WebDriver Interface Class
		WebDriver driver=new FirefoxDriver();
		
		//loading webpage to browser window
		driver.get("http://facebook.com");
		
		//Reading Page Title
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		//Closing browser window
		driver.close();
		
		/*
		 * WebDriver is a interface class. It is designed to
		 * manipulate all browser instances..
		 * 
		 * 	Advantages:-->
		 * 		WebDriver support cross browser automation. it means
		 * 		User can design code for one browser and user can
		 * 		use same code to run at differnet browsers
		 */

	}

}
