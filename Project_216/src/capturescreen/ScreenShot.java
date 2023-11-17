package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		//Capturing screen and converting into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Creating folder at local drive
		FileHandler.createDir(new File("Screens"));
		//Copy File into local drive
		FileHandler.copy(src, new File("Screens\\Image.png"));

		
		/*
		 * Image extension
		 * PNG:--> Portable network graphic
		 */
	}

}
