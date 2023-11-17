package browserlaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{

	public static void main(String[] args) 
	{
		//launching chromebrowser and storing into ChromeDriver referene class
		ChromeDriver chrome=new ChromeDriver();
		
		//Loading new page into browser window
		chrome.get("https://www.facebook.com/");

		//Read Page title
		String pageTitle=chrome.getTitle();
		System.out.println(pageTitle);
		
		//CLose Browser
		chrome.close();
	}

}
