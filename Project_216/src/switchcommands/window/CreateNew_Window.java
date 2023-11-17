package switchcommands.window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNew_Window {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    //Get window Handles
	    String MainWindowID=driver.getWindowHandle();
	    
	    //Creating new Window at existing browser
	    WebDriver BlogWindow=driver.switchTo().newWindow(WindowType.WINDOW);
		BlogWindow.get("https://about.instagram.com/en_US/blog");
		String BlogwindowID=BlogWindow.getWindowHandle();
		System.out.println(BlogwindowID);
		
		System.out.println("Blog Title is --> "+BlogWindow.getTitle());
		
		//Switch Control back to mainwindow
		driver.switchTo().window(MainWindowID);
		System.out.println("Mainwidnow title is --> "+driver.getTitle());
	}

}
