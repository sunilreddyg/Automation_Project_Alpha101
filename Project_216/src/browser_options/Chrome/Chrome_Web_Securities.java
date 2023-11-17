package browser_options.Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Web_Securities {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-web-security");
		options.addArguments("--allow-insecure-localhost");
		options.addArguments("--ignore-urlfetcher-cert-requests");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://skyscanner.com");

	}

}
