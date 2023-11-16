package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		/*
		 * Download chromedriver.exe file
		 * 	
		 *  	Find a Current Chrome browser version at your computer
		 * 			Open ChromeBrowser --> click on settings
		 * 			---> Help Menu----> About google chrome
		 * 
		 * 		=> https://googlechromelabs.github.io/chrome-for-testing/
		 * 		=> Click on <<stable>> link under channels
		 * 		=> Copy URL w.r.t Operating system and Hotspot size
		 * 					[Windows - 64]
		 * 		=> Paste url at any browser and press enter to downlaod zip format file
		 * 
		 * 		Setup Chromedriver.exe file at Environment Variable:-->
		 * 		System.setProperty("webdriver.chrome.driver","filepath");
		 */
		
		
		//Setting Runtime Environment Variable Path 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//Launching chrome browser and storing reference into WebDriver Interface Class
		WebDriver driver=new ChromeDriver();
		
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
