package oops.Interface.multiple_inheritence;

public class C extends D implements A,B
{


	@Override
	public void method2() 
	{
		System.out.println("Method2 From B");
		
	}

	@Override
	public void method1() 
	{
		System.out.println("Method1 from A");
	}


	


}
