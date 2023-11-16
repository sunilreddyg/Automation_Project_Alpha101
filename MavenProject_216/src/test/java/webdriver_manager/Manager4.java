package webdriver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manager4 {

	public static void main(String[] args) 
	{
		
		//Manage [download,Maintain,Setup ChromeDriver at Runtime]
		WebDriverManager.chromedriver().setup();
		
		//Launching chrome browser and storing reference into WebDriver Interface Class
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
