package switchcommands.Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Reference {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bushire/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //Switch to frame using frame location
	    WebElement FrameLoc=driver.findElement(By.xpath("//object[@data-radium='true']"));
	    driver.switchTo().frame(FrameLoc);
	    
	    //Identifying element under frame
	    WebElement OutStation=driver.findElement(By.xpath("(//div[contains(@class,'u4EAg')])[1]"));
	    OutStation.click();
	    
	    //Switch Controls back to mainpage
	    driver.switchTo().defaultContent();
	    

	}

}
