package mq.java.Variables;

public class VariableTypes 
{
	int a=100;				//Global Variables[Instant variable]
	double price=12345.345; //Global Variables[Instant variable]
	
	public void method1() 
	{
		String name="Riya";   //Local variable
		System.out.println(name);
	}
	
	public void method2()
	{
		String name="Sunny";	 //Local variable
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		//Calling Instant variable and Stroring return data into new Variable
		int x=new VariableTypes().a;
		System.out.println(x);
		
		//Calling Instant variable and Stroring return data into new Variable
		double y=new VariableTypes().price;
		System.out.println(y);
		
		//Printing without Storing
		System.out.println(new VariableTypes().price);
		
		//Note:--> Variable always return value

	}

}
