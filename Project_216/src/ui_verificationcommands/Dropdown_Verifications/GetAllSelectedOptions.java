package ui_verificationcommands.Dropdown_Verifications;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions 
{

	public static void main(String[] args) throws Exception {
		
		/*
		 * Note:--> This Method only works when object 
		 * 			is accept multiple option selection
		 * 			with in single dropdown
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsys.com/demo.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement SelectMenu=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenu.click();
		Thread.sleep(2000);
		
		WebElement Dropdown=driver.findElement(By.id("exampleFormControlSelect2"));
		
		//Condition to Verify Dropdown is multiple selection type
		if(new Select(Dropdown).isMultiple())
		{
			//Selecting Multiple Options
			new Select(Dropdown).deselectAll();
			new Select(Dropdown).selectByVisibleText("America");
			new Select(Dropdown).selectByVisibleText("Japan");
			new Select(Dropdown).selectByVisibleText("India");
			
			//Read All Option Selected Only
			List<WebElement> AllOptions=new Select(Dropdown).getAllSelectedOptions();
			for (WebElement EachOption : AllOptions) 
			{
				if(EachOption.getText().contains("America"))
					System.out.println("America Option Selected");
				
				if(EachOption.getText().contains("Japan"))
					System.out.println("Japan option selected");
			}
		}
		else
		{
			System.out.println("Drodpown is not Multiple Type");
		}
			
		
		
		

	}

}
