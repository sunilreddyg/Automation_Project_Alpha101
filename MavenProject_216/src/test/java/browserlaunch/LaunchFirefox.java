package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		
		/*
		 * Download geckodriver.exe file for firefox
		 * 
		 * 	=> Find firefox version installed in your computer
		 * 			Open Setting --> Click on Help Tab
		 * 			--> Click on Abour firefox.
		 *  => find suitable geckodrive release
		 *  => Under asserts downlaod zip format file
		 *  		w.r.t Operating systems and hotspot size..
		 */
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
				
		//Launching firefox browser and storing reference into WebDriver Interface Class
		WebDriver driver=new ChromeDriver();
		
		//loading webpage to browser window
		driver.get("http://facebook.com");
		
		//Reading Page Title
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		//Closing browser window
		driver.close();
				
		
	}

}
