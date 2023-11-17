package mq.webdriver.list;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wroking_With_List 
{

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.linkText("Select Product Type")).click();
		driver.findElement(By.xpath("//li[@value='3'][contains(.,'Deposits')]")).click();

		Thread.sleep(2000);
		driver.findElement(By.linkText("Select Product")).click();
		driver.findElement(By.xpath("//li[@value='1'][contains(.,'Fixed Deposit')]")).click();
		
		
		driver.findElement(By.linkText("Apply online")).click();
		
		
		
		
		
	}

}
