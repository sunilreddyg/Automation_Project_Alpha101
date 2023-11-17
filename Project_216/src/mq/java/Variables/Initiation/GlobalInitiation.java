package mq.java.Variables.Initiation;

public class GlobalInitiation 
{
	int a=10;
	public void method1()
	{
		//Once variable initiated globally dont initiate locally again
		int a=20; 
		a=50;
		System.out.println(a);
	}
	
	public void method2()
	{
		//Override new value to global variable
		a=40;
		System.out.println(a);
	}
	

	public static void main(String[] args) 
	{
		GlobalInitiation obj=new GlobalInitiation();
		obj.method1();
		obj.method2();

	}

}
