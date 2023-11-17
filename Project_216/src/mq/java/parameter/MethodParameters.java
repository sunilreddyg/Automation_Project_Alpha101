package mq.java.parameter;

public class MethodParameters 
{
	//methdo without parameter
	public void method1()
	{
		System.out.println("method1");
	}
	
	//Method with String parameter
	public void method2(String name)
	{
		System.out.println(name);
	}
	
	//Method with integer parameter
	public void method3(int num)
	{
		System.out.println(num);
	}
	
	//method with boolean parameter
	public void method4(boolean flag)
	{
		System.out.println(flag);
	}
	
	//method with double parameter
	public void method5(double price)
	{
		System.out.println(price);
	}
	
	//method with char parameter
	public void method6(char ch)
	{
		System.out.println(ch);
	}

	public static void main(String[] args) 
	{
		MethodParameters obj=new MethodParameters();
		obj.method1();			//Calling Method Without Arguments
		obj.method2("Iphone");  //Calling method with string argument
		obj.method3(30);		//Calling method with integer argument
		obj.method4(false);     //Calling method with boolean argument
		obj.method6('A');       //Calling method with char argument
		
		
	}

}
