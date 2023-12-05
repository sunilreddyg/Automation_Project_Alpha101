package framework.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeClass_And_AfterClass 
{
	
	//it will invoke before execution of first @Test annotated method with in class
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class Preconditions");
	}

	//invoke after execution of all @Test annotated methods with in class
	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostConditions");
	}

	@Test
	void tc001() 
	{
		System.out.println("tcool Executed");
	}
	
	@Test
	void tc002() 
	{
		System.out.println("tcoo2 Executed");
	}

}
