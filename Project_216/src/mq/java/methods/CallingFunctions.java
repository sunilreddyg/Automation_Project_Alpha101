package mq.java.methods;

public class CallingFunctions 
{
	
	public static void method1() 
	{
		System.out.println("Executed method1");
		new CallingFunctions().method4();
		//Calling Instant method inside Static method
		//We Should call method using class instance
	}
	
	public void method2() 
	{
		System.out.println("Executed method2");
		method1(); 
		//static method is a power use it can call at instant
		//method directly without object creation..
	}
	
	public void method3() 
	{
		System.out.println("Executed method3");
		method2();
		//With in call any instant method to call inside instant
		//method object creation is not  necessary
	}
	
	public void method4() 
	{
		System.out.println("Executed method4");
	}

	public static void main(String[] args) 
	{
		  //Calling Static method with in class using main method
		 //Call directly using method name
		method1();
		
		//Calling instant method with in class inside static method
		//Call using Object Creation
		new CallingFunctions().method2();
		new CallingFunctions().method3();
		new CallingFunctions().method4();

	}

}
