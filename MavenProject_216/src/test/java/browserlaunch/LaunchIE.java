package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		
		/*
		 * Downloading IEDriverServer.exe file for IE Browser
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Under The Internet Explorer Driver Server
		 * 		=> W.r.t selenium version download file
		 * 		=> Click on 64bit window IE link
		 * 		=> It will download zip format file 
		 * 		=> Unzip file and maitain IEDriverServer.exe file
		 * 			at  backup folder
		 * 		=> Setup runtime environment variabel before launch
		 * 			ie browser..
		 * 
		 * 		Note:--> Only works when IE browser installed 11 and above
		 */
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\IEDriverServer.exe");
		
		//Launching ie browser and storing reference into WebDriver Interface Class
		WebDriver driver=new InternetExplorerDriver();
		
		//loading webpage to browser window
		driver.get("http://google.com");
		
		//Reading Page Title
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		//Closing browser window
		driver.close();
	}

}
