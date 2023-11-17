package mq.java.Variables.Initiation;

public class LocalInitiation 
{
	
	
	public void method1() 
	{
		int a=10;
		a=30;
		System.out.println(a);
	}
	
	public void method2() 
	{
		int a=30;
		a=10;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		LocalInitiation obj=new LocalInitiation();
		obj.method1();
		obj.method2();

	}

}
