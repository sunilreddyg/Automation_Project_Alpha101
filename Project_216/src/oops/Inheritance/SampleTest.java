package oops.Inheritance;

import org.junit.Test;

public class SampleTest 
{
	 //Without inheritance
	@Test
	public void methodA()
	{
		Parent obj=new Parent();
		obj.method1();
		System.out.println(obj.name);
		
		ChildA a=new ChildA();
		System.out.println(a.email);
	}

}
