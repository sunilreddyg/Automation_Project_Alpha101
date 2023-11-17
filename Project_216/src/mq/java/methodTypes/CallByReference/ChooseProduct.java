package mq.java.methodTypes.CallByReference;

public class ChooseProduct 
{
	
	//Method type is a class
	public static Book1  SelectBook1()
	{
		return new Book1();   
		//Return Controls to Book1 class
		//if user call selectBook1 method it return Book1 Controls to User
		//So that user can access Book1 class method and variables
			
	}
	
	//Method type is a class
	public static Book2 selectBook2()
	{
		return new Book2();
	}
	

}
