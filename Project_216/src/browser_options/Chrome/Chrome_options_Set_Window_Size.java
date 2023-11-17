package browser_options.Chrome;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_options_Set_Window_Size 
{

	public static void main(String[] args) throws Exception 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=300,500");
		
		
	
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");
		
		
		Thread.sleep(5000);
		driver.manage().window().setSize(new Dimension(700, 600));
		

	}

}
