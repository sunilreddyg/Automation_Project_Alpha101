package mq.java.parameter;

public class Calculator 
{
	//Global instantiation
	int a;
	int b;
	
	//Constructor accept parameters same as methods
	public Calculator(int x, int y) 
	{
		//Assigning locally parameterized data to global variables
		a=x;
		b=y;
	}
	
	public void add()
	{
		//Adding two value using global variables
		int c=a+b;
		System.out.println(c);
	}
	
	public void mul()
	{
		int c=a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		//Calling Constructor using parameter
		 new Calculator(10, 20).add();
		 new Calculator(50, 30).mul();
	}

}
