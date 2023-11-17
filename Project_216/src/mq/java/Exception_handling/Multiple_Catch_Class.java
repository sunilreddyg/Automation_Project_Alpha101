package mq.java.Exception_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Multiple_Catch_Class {

	public static void main(String[] args)
	{

		WebDriver driver=null;
		
		try {
			driver.findElement(By.id("email"));
			System.out.println("element found");
		} catch (NullPointerException e) {
			System.out.println("Browser not initiated");
		} catch (NoSuchElementException e) {
			System.out.println("Element Not found at source");
		}

	}

}
