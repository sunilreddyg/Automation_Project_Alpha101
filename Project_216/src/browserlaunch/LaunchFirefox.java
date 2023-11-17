package browserlaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) 
	{
		
		//Launching firefox browser and Storing into FirefoxDriver class
		FirefoxDriver firefox=new FirefoxDriver();
		
		//loading webpage to browser window
		firefox.get("http://instagram.com");
		
		//Read page title
		String PageTitle=firefox.getTitle();
		System.out.println(PageTitle);
		
		//Close Browser window
		firefox.close();
		

	}

}
