package capturescreen;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureWith_Time_Stamp 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com/");
		driver.manage().window().maximize();
		
		
		//Create Java Time Stampt
		Date d=new Date();
		//Create Simple date format class
		DateFormat df=new SimpleDateFormat("yyyy-MMM-dd-hh-mm-ss");
		//Using simple dateformatter convert default date
		String time=df.format(d);
		
		
		//Select location and capture screen of any selected location at webpage
		WebElement Location=driver.findElement(By.xpath("//div[@class='d-flex col-md grid-feature-item-1']"));
		File src=Location.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("Screens\\Image2"+time+".png"));
		

	}

}
