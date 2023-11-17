package browser_options.Chrome;

import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Merge_ChromeOptions {

	public static void main(String[] args) 
	{
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		
	
		
		ChromeOptions options=new ChromeOptions();
		options.setBrowserVersion("97");
		options.setPageLoadTimeout(Duration.ofSeconds(200));
		options.merge(caps);
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://selenium.dev");
	}

}
