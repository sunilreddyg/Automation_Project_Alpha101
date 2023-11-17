package browserlaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebSocket_Issue {

	public static void main(String[] args) 
	{
			//WebSocket issue with Selenium WebDriver
		
		
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			//launching chrome browser using chrome options...
			ChromeDriver chrome=new ChromeDriver(options);
			chrome.get("https://www.facebook.com/");

	}

}
