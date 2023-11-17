package mq.java.methods;

public class TestApp 
{
	
	public void OpenBrowser() 
	{
		System.out.println("Browser Is Up");
	}
	
	public void LoadWebpage()
	{
		System.out.println("Application OPened");
	}
	
	public void Enterusername()
	{
		System.out.println("username Entry Finished");
	}
	
	public void EnterPassword()
	{
		System.out.println("Password Entery Finished");
	}
	
	public void SubmitLogin()
	{
		System.out.println("Login Submitted");
	}
	
	
	//Reusable method
	public void userlogin()
	{
		//Calling methods with in class
		Enterusername();
		EnterPassword();
		SubmitLogin();
	}
	
	public static void main(String[] args) 
	{
		new TestApp().OpenBrowser();
		new TestApp().LoadWebpage();
		new TestApp().userlogin();
	}
}

