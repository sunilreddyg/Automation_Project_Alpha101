package mq.java.Variables;

public class StaticVariables 
{
	//Global Variable [Class Variables/static Variable]
	static String name="sunil";
	static String email="sunilreddy@mindqsystems.com";
	static String mobile="9030248855";
	
	public void PrintDetails() 
	{
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
	}

	public static void main(String[] args) 
	{
		//Calling Static Variables
		 String Myname=StaticVariables.name;
		 System.out.println(Myname);
		 
		 String MyEmail=StaticVariables.email;
		 System.out.println(MyEmail);
		 
		 String MyPhone=StaticVariables.mobile;
		 System.out.println(MyPhone);
		 
		 //calling instant method
		new StaticVariables().PrintDetails();

	}

}
