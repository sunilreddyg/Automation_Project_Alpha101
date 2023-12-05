package framework.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class IgnoreTest 
{

	@Test  //Invoke method to run
	public void test1() 
	{
		System.out.println("test1 Executed");
	}
	
	//Method doesn't run because @Test not specified
	public void test2() 
	{
		System.out.println("test2 Executed");
	}
	
	@Disabled //ignore method to run
	public void test3() 
	{
		System.out.println("test3 Executed");
	}
	
	@Test  //Invoke method to run
	public void test4() 
	{
		System.out.println("test4 Executed");
	}
}
