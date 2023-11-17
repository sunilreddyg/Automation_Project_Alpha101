package robot_window_interface;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement uploadButton=driver.findElement(By.xpath("//button[contains(.,'Upload Resume')]"));
		uploadButton.click();
		Thread.sleep(5000);
		
		
		String path="D:\\MyNewIDE_Projects\\UseCase Template.docx";
		
		//Selecting String
		StringSelection spath=new StringSelection(path);
		
		//Get System Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();

		//Set New Content to clipbaord
		clipboard.setContents(spath, null);
		
		

		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release control key
		robot.keyRelease(KeyEvent.VK_CONTROL);

		//Press Enter Key
		robot.keyPress(KeyEvent.VK_ENTER);

	}

}
