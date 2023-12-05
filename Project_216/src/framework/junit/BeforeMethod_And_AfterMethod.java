package framework.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeMethod_And_AfterMethod {

	//Invoke every test annotation before
	@BeforeEach
	void setUp() throws Exception 
	{
		System.out.println("Test PreCondition");
	}

	
	//invoke every test annoation after
	@AfterEach
	void tearDown() throws Exception 
	{
		System.out.println("Test PostCondition");
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
	
	@Test
	void tc003() 
	{
		System.out.println("tcoo3 Executed");
	}
	
	
	@BeforeAll
	static void SetupTest() throws Exception
	{
		System.out.println("Pre Setup is finished");
	}

}
