package mq.java.methodTypes;

public class MethodTypes 
{

	//Void Method
	public void method1() 
	{
		//Void is a method type  it doesn't return any value
	}
	
	//Integer return method
	public int method2()
	{
		return 100;
	}
	
	//boolean return method
	public boolean method3()
	{
		boolean flag=false;
		return flag;
	}
	
	//String return method
	public String method4()
	{
		return "Selenium";
		
	}
	
	//char return method
	public char method5()
	{
		return 'S';
		
	}
	
	
	/*
	 * =>Otherthan void all method types return value
	 * =>We should write return value at the end of method
	 * =>return value should match with method type
	 * =>Finally return value to method name
	 * 
	 * 	What we can write during method type:-->
	 * 			All datatypes[int,boolean,String,char,double,float --etc]
	 * 			Allclasses [Class,InterfaceClass,AbstarctClass --etc]
	 */

	public static void main(String[] args) 
	{
		//Create object to Class
		MethodTypes obj=new MethodTypes();
		
		//Calling Void method
		obj.method1();
		
		
		//Calling Integer return method
		int val=obj.method2();
		System.out.println(val);
		
		//Calling Boolean return method
		boolean flag=obj.method3();
		System.out.println(flag);

		//Calling String return method
		String toolname=obj.method4();
		System.out.println(toolname);
		
		//String is a non-primitive datatype it contains set of methods
		boolean f=obj.method4().startsWith("sel");
		System.out.println(f);
		
		//Calling char return method
		char ch=obj.method5();
		System.out.println(ch);
	}

}
