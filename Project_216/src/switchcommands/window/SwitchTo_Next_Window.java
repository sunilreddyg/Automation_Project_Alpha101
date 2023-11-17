package switchcommands.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	    //This link will open extra window
	    WebElement Meta=driver.findElement(By.linkText("Meta"));
	    Meta.click();
	    Thread.sleep(5000);
	    
	    //Get All window handles
	    Set<String> AllWindowIDs=driver.getWindowHandles();
	   
	    //Convert Set of String values into interator
	    Iterator<String> itr=AllWindowIDs.iterator();
	    
	    //Reading each iterator value using next keyword
	    String window1=itr.next();
	    String window2=itr.next();
	    
	    //Switch to Second window
	    driver.switchTo().window(window2);
	    System.out.println("Second window title is --> "+driver.getTitle());
	    
	    //Switch to First window
	    driver.switchTo().window(window1);
	    System.out.println("First window title is :--> "+driver.getTitle());
	    
	    
	    /*
	     * Note:--> Only use this program when two windows are opened.
	     * 			[
	     * 				Because Set is  a unorder collection of obejcts
	     * 				it change it's order when more than two iterations 
	     * 				available 
	     * 			]
	     */
	}

}
