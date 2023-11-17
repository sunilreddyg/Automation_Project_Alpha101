package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Element_Screen {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		//This feature only available at selenium 4  Version..
		
		//Select location and capture screen of any selected location at webpage
		WebElement Location=driver.findElement(By.xpath("//div[@class='d-flex col-md grid-feature-item-1']"));
		File src=Location.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\Image2.png"));
	}

}
