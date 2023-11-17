package mq.java.methods;

public class StaticMethods 
{
	//Reusable static specifier method
	public static void method1() 
	{
		System.out.println("method1 executed");
	}
	
	//Reusable static specifier method
	public static void method2() 
	{
		System.out.println("method2 executed");
	}
	
	//Reusable static specifier method
	public static void method3() 
	{
		System.out.println("method3 executed");
	}

	
	public static void main(String[] args) 
	{
		//With in class static methods can call from main method
		//directly using it's method name
		method1();
		method2();
		method3();
		
		//To Calling static method from outside class
		// Syntax:-->  Classname.methodname();
		StaticMethods.method1();
		StaticMethods.method2();
		StaticMethods.method3();
	}
	
	

}
