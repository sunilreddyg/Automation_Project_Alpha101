package capturescreen;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenUSing_Robot {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//Creating object for robot
		Robot robot=new Robot();
		BufferedImage image=robot.createScreenCapture(new Rectangle(1020,800));
		ImageIO.write(image, "PNG", new File("Screens\\Image4.png"));

		/*
		 * Note:--> Selenium can't capture browser popups and Alerts.
		 * 			Robot Can capture any thing display in visible port...
		 */
	}

}
